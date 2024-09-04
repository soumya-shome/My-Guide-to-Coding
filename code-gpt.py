import pandas as pd
import psycopg2
import numpy as np

def add_columns_containing_value(df, value):
    df['methods'] = None
    for i, row in df.iterrows():
        columns = row[row == value].index.tolist()
        columns_str = ','.join(columns)
        if columns:
            df.at[i, 'methods'] = columns_str
        else:
            df = df.drop(i)
    return df

tmp_input_file = "Developability_Request-date.xlsm"


db_host = '127.0.0.1'
db_port = '5432'
db_username = 'postgres'
db_password = 'password'
db_name = 'leap'

# Connect to PostgreSQL database
connection = psycopg2.connect(
    host=db_host,
    port=db_port,
    user=db_username,
    password=db_password,
    dbname=db_name
)
import pandas as pd
import numpy as np
 
import pandas as pd
import numpy as np
import sqlite3  # or any other database module
from sqlalchemy import create_engine
 
# Configuration
file_path = 'dev_sheet.xlsx'

# Load and rename columns
def load_and_process_excel(file_path):
    try:
        dev_sheet = pd.read_excel(file_path, "Dev. Sheet")
        dev_sheet.rename(columns={
            'Sample Alias': 'sample_alias',
            'Measurement Prot. Conc. Date': 'measurement_prot_conc_date',
            'Measurement Prot. Conc. Contact': 'measurement_prot_conc_contact',
            'Startdatum Dialyse': 'startdatum_dialyse',
            'Proben Nr.': 'proben_nr',
            'Batch': 'batch',
            'Temperature  [°C]': 'temperature',
            'Timepoint': 'timepoint',
            'Nanodrop [mg/ml]': 'nanodrop_mg_ml',
            'Buffer formulation': 'buffer_formulation',
            'Analysis Type': 'analysis_type',
            'nano-DSF': 'nanoDSF',
            'Study Code': 'study_code',
            'Lab': 'department',
            'PPB': 'ppb',
            'TPP': 'tpp',
            'APP': 'app',
            'Sanofi Project ID': 'internal_project_id',
            'TPP Name': 'tpp_name',
            'pI': 'isoelectric_point',
            'Format': 'format',
            'MW [kDa]': 'mw_kda',
            'Milestone': 'milestone',
            'PDS Liste': 'pds',
            'PAS Liste': 'pds',
            'Project ID': 'project_id',
            'Ext. Koeffizent': 'ext_cof',
            ' Storage Temp [°C]': 'storage_temp',
            'Storage at -80 °C': 'storage_at_80'
        }, inplace=True)
 
        # Verify column names
        print("Columns in dev_sheet after renaming:", dev_sheet.columns)
 
        return dev_sheet
    except Exception as e:
        print("Error loading or renaming columns:", e)
        raise
 
# Process data and synchronize with database
def sync_with_database(dev_sheet, connection):
    try:
        # Add required columns (assuming add_columns_containing_value is defined elsewhere)
        dev_sheet2 = add_columns_containing_value(dev_sheet, 'x')
 
        required_col = dev_sheet2[['sample_alias', 'measurement_prot_conc_date', 'measurement_prot_conc_contact', 
                                   'startdatum_dialyse', 'batch', 'pH', 'temperature', 'timepoint', 
                                   'nanodrop_mg_ml', 'buffer_formulation', 'analysis_type', 'study_code', 
                                   'department', 'ppb', 'tpp', 'app', 'internal_project_id', 'tpp_name', 
                                   'isoelectric_point', 'format', 'mw_kda', 'milestone', 'pds', 'project_id', 
                                   'ext_cof', 'storage_temp', 'storage_at_80', 'methods']].copy()
 
        # Ensure columns are of the correct type
        columns_to_str = ['startdatum_dialyse', 'measurement_prot_conc_date', 'measurement_prot_conc_contact', 
                          'temperature', 'pH', 'batch', 'methods']
        for col in columns_to_str:
            if col in required_col.columns:
                required_col[col] = required_col[col].astype(str)
 
        # Separate records with missing and non-missing 'startdatum_dialyse'
        startdatum_dialyse_na_df = required_col[required_col['startdatum_dialyse'].isna()]
        startdatum_dialyse_df = required_col.dropna(subset=['startdatum_dialyse'])
 
        # Query database for existing records
        query_existing_records = """SELECT sample_alias, measurement_prot_conc_contact, temperature, pH, batch, tpp_name, methods, startdatum_dialyse
                                    FROM order_list_clap_missing"""
        old_dev_miss_record = pd.read_sql(query_existing_records, connection)
        old_dev_miss_record[columns_to_str] = old_dev_miss_record[columns_to_str].astype(str)
 
        # # Identify records to remove
        # records_to_remove = startdatum_dialyse_df.merge(old_dev_miss_record, on=['sample_alias', 'measurement_prot_conc_contact', 'batch', 'methods'])
        # print("Records to remove:", records_to_remove.shape[0])
 
        # # Delete records from database
        # if not records_to_remove.empty:
        #     cursor = connection.cursor()
        #     records_to_remove = records_to_remove.replace({np.nan: ''})
        #     for _, row in records_to_remove.iterrows():
        #         if row['measurement_prot_conc_date'] == 'NaT':
        #             row['measurement_prot_conc_date'] = None
        #         sql_delete = """DELETE FROM order_list_clap_missing 
        #                         WHERE sample_alias = ? AND measurement_prot_conc_date = ? AND measurement_prot_conc_contact = ? 
        #                         AND temperature = ? AND pH = ? AND batch = ? AND methods = ?"""
        #         val_delete = (row['sample_alias'], row['measurement_prot_conc_date'], row['measurement_prot_conc_contact'],
        #                       row['temperature'], row['pH'], row['batch'], row['methods'])
        #         try:
        #             cursor.execute(sql_delete, val_delete)
        #             print(f"Query executed: {sql_delete} : {val_delete}")
        #         except Exception as e:
        #             print("Delete query error:", e)
        #     try:
        #         connection.commit()
        #     except Exception as e:
        #         print("Error committing delete transactions:", e)
 
        # Identify new records to insert
        query_existing_records = """SELECT sample_alias, temperature, pH, batch, tpp_name, methods 
                                    FROM order_list_clap_missing"""
        old_dev_miss_record = pd.read_sql(query_existing_records, connection)
        old_dev_miss_record[columns_to_str] = old_dev_miss_record[columns_to_str].astype(str)
        merged_records = startdatum_dialyse_na_df.merge(old_dev_miss_record, how='left', indicator=True)
        new_dev_miss_records = merged_records[merged_records['_merge'] == 'left_only'].drop(['_merge'], axis=1)
        print("New Developability Record count:", new_dev_miss_records.shape[0])
 
        # Insert new records into database
        if not new_dev_miss_records.empty:
            cur = connection.cursor()
            new_dev_miss_records = new_dev_miss_records.replace({np.nan: ''})
            for _, row in new_dev_miss_records.iterrows():
                if row['measurement_prot_conc_date'] == 'NaT':
                    row['measurement_prot_conc_date'] = None
                if row['startdatum_dialyse'] == 'NaT':
                    row['startdatum_dialyse'] = None
                sql_insert = """INSERT INTO order_list_clap_missing 
                                (pds, department, batch, ppb, tpp, app, internal_project_id, tpp_name, isoelectric_point, format, mw_kda, 
                                 sample_alias, measurement_prot_conc_date, measurement_prot_conc_contact, startdatum_dialyse, proben_nr, 
                                 pH, temperature, timepoint, nanodrop_mg_ml, buffer_formulation, analysis_type, RT, study_code, 
                                 milestone, project_id, ext_cof, storage_temp, methods) 
                                VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"""
                val_insert = (row['pds'], row['department'], row['batch'], row['ppb'], row['tpp'], row['app'], row['internal_project_id'], 
                              row['tpp_name'], row['isoelectric_point'], row['format'], row['mw_kda'], row['sample_alias'], 
                              row['measurement_prot_conc_date'], row['measurement_prot_conc_contact'], row['startdatum_dialyse'], 
                              row['proben_nr'], row['pH'], row['temperature'], row['timepoint'], row['nanodrop_mg_ml'], 
                              row['buffer_formulation'], row['analysis_type'], "DEV", row['study_code'], row['milestone'], 
                              row['project_id'], row['ext_cof'], row['storage_temp'], row['methods'])
                try:
                    cur.execute(sql_insert, val_insert)
                    print(f"Query executed: {sql_insert} : {val_insert}")
                except Exception as e:
                    print("Insert query error:", e)
            try:
                connection.commit()
            except Exception as e:
                print("Error committing insert transactions:", e)
 
    except Exception as e:
        print("Error processing data or synchronizing with database:", e)
 
def main():
    try:
        # Establish connection
        # engine = create_engine(connection)
        # connection = engine.connect()
 
        # Load and process data
        dev_sheet = load_and_process_excel(file_path)
 
        # Sync with database
        sync_with_database(dev_sheet, connection)
 
    except Exception as e:
        print("General error:", e)
    finally:
        try:
            connection.close()
        except:
            pass
 
if __name__ == "__main__":
    main()