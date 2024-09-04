# %%
import pandas as pd
import psycopg2
import numpy as np

# %%
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

# %%
# tmp_input_file = "Developability_Request-date.xlsm"

file_path = 'dev_sheet-somedate.xlsx'

# %%
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

# %%
def load_devsheet(file_path):
    dev_sheet = pd.read_excel(file_path, "Dev. Sheet")
    dev_sheet.columns = dev_sheet.columns.str.strip()
    dev_sheet.rename(columns={
            'Sample Alias': 'sample_alias',
            'Measurement Prot. Conc. Date': 'measurement_prot_conc_date',
            'Measurement Prot. Conc. Contact': 'measurement_prot_conc_contact',
            'Startdatum Dialyse': 'startdatum_dialyse',
            'Proben Nr.': 'proben_nr',
            'Batch': 'batch',
            'Temperature': 'temperature',
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
            'Storage Temp [°C]': 'storage_temp',
            'Storage at -80 °C': 'storage_at_80'
        }, inplace=True)
    dev_sheet2 = add_columns_containing_value(dev_sheet, 'x')
    required_col = dev_sheet2[['milestone', 'pds', 'study_code', 'department', 'ppb', 'tpp',
       'app', 'project_id', 'internal_project_id', 'tpp_name', 'sample_alias',
       'measurement_prot_conc_date', 'measurement_prot_conc_contact',
       'startdatum_dialyse', 'proben_nr', 'batch', 'pH', 'temperature',
       'timepoint', 'nanodrop_mg_ml', 'buffer_formulation', 'analysis_type',
       'storage_temp', 'storage_at_80', 'ext_cof', 'isoelectric_point',
       'format', 'mw_kda', 'methods']].copy()
    columns_to_str = ['measurement_prot_conc_date', 'measurement_prot_conc_contact', 'batch', 'methods']
    required_col[columns_to_str] = required_col[columns_to_str].astype(str)
    startdatum_dialyse_na_df = required_col[required_col['startdatum_dialyse'].isna()]
    startdatum_dialyse_df = required_col.dropna(subset=['startdatum_dialyse'])
    return required_col, startdatum_dialyse_na_df, startdatum_dialyse_df

# %% [markdown]
# 

# %%


# %%


# %%
# dev_sheet.columns

# %%


# %%
# dev_sheet.columns

# %%


# %%
# dev_sheet2.columns

# %%


# %%
# 'pds','department','batch','ppb','tpp','app','internal_project_id','tpp_name','isoelectric_point','format','mw_kda','sample_alias','measurement_prot_conc_date','measurement_prot_conc_contact','startdatum_dialyse','proben_nr','pH','temperature','timepoint','nanodrop_mg_ml','buffer_formulation','analysis_type','RT','study_code','milestone','project_id','ext_cof','storage_temp','methods','storage_at_80'

# %%


# %%


# %%
required_col, startdatum_dialyse_na_df, startdatum_dialyse_df = load_devsheet(file_path)

# %%
required_col.shape[0]

# %%
startdatum_dialyse_na_df.shape[0]

# %%
startdatum_dialyse_df.shape[0]

# %% [markdown]
# # Delete editted

# %%
query_existing_records = """SELECT id, sample_alias, measurement_prot_conc_contact, temperature, pH, batch, tpp_name, methods, startdatum_dialyse
                            FROM order_list_clap_missing"""
old_dev_miss_record = pd.read_sql(query_existing_records, connection)

# Ensure the specified columns are converted to string

old_dev_miss_record.columns

# %%
columns_to_str = ['sample_alias','measurement_prot_conc_contact', 'batch', 'methods']
old_dev_miss_record[columns_to_str] = old_dev_miss_record[columns_to_str].astype(str)
records_to_remove = startdatum_dialyse_df.merge(old_dev_miss_record[['sample_alias', 'methods']], on=['sample_alias', 'methods'])

# %%
print("Records to remove:", records_to_remove.shape[0])

# %%
records_to_remove

# %%
old_dev_miss_record

# %%
startdatum_dialyse_df

# %%
# print(startdatum_dialyse_df[['sample_alias', 'methods', 'startdatum_dialyse']].dtypes)
# print(old_dev_miss_record[['sample_alias', 'methods', 'startdatum_dialyse']].dtypes)


# %%
# startdatum_dialyse_df['sample_alias'] = startdatum_dialyse_df['sample_alias'].str.lower()
# startdatum_dialyse_df['methods'] = startdatum_dialyse_df['methods'].str.lower()
# startdatum_dialyse_df['startdatum_dialyse'] = startdatum_dialyse_df['startdatum_dialyse'].str.lower()

# old_dev_miss_record['sample_alias'] = old_dev_miss_record['sample_alias'].str.lower()
# old_dev_miss_record['methods'] = old_dev_miss_record['methods'].str.lower()
# old_dev_miss_record['startdatum_dialyse'] = old_dev_miss_record['startdatum_dialyse'].str.lower()


# %%
# startdatum_dialyse_df[['sample_alias', 'methods', 'startdatum_dialyse']]



# %%
# old_dev_miss_record[['sample_alias', 'methods', 'startdatum_dialyse']]

# %%


# %%


# %%
# print(startdatum_dialyse_df[['sample_alias', 'methods', 'startdatum_dialyse']].isna().sum())
# print(old_dev_miss_record[['sample_alias', 'methods', 'startdatum_dialyse']].isna().sum())


# %%



# %%
# common_rows

# %%
# old_dev_miss_record.columns

# %%
# s1 = pd.merge(startdatum_dialyse_df,old_dev_miss_record, how = 'inner',indicator=False)

# %%
# s1

# %%
# merged = startdatum_dialyse_df.merge(old_dev_miss_record, how='left', on=['sample_alias', 'measurement_prot_conc_contact', 'temperature',  'batch', 'tpp_name', 'methods', 'startdatum_dialyse'], indicator=True)
# # New_Dev_miss_records = merged[merged['_merge'] == 'left_only'].drop(['_merge'], axis=1)

# %%
# New_Dev_miss_records = merged[merged['_merge'] == 'left_only'].drop(['_merge'], axis=1)

# %%
# New_Dev_miss_records

# %%
# # Identify records to remove
# records_to_remove = old_dev_miss_record.merge(startdatum_dialyse_df, on=['sample_alias', 'measurement_prot_conc_contact', 'batch', 'methods','startdatum_dialyse'])
# print("Records to remove:", records_to_remove.shape[0])

# %%


# Delete records from database
if not records_to_remove.empty:
    cursor = connection.cursor()
    records_to_remove = records_to_remove.replace({np.nan: ''})
    for _, row in records_to_remove.iterrows():
        if row['measurement_prot_conc_date'] == 'NaT':
            row['measurement_prot_conc_date'] = None
        sql_delete = "DELETE FROM order_list_clap_missing WHERE sample_alias = %s AND measurement_prot_conc_contact = %s  AND batch = %s AND methods = %s"
        val_delete = (row['sample_alias'],  row['measurement_prot_conc_contact'],row['batch'], row['methods'])
        try:
            cursor.execute(sql_delete, val_delete)
            print(f"Query executed: {sql_delete} : {val_delete}")
        except Exception as e:
            print("Delete query error:", e)
    try:
        connection.commit()
    except Exception as e:
        print("Error committing delete transactions:", e)

# %% [markdown]
# # Insert new

# %%
# Query existing records from the PostgreSQL database
try:
    query3 = """SELECT sample_alias, measurement_prot_conc_contact, temperature, pH, batch, tpp_name, methods
                FROM order_list_clap_missing"""
    old_dev_miss_record = pd.read_sql(query3, connection)
    columns_to_str = ['sample_alias', 'measurement_prot_conc_contact', 'temperature', 'ph', 'batch', 'tpp_name', 'methods']
    old_dev_miss_record[columns_to_str] = old_dev_miss_record[columns_to_str].astype(str)

    merged2 = startdatum_dialyse_na_df.merge(old_dev_miss_record, how='left', indicator=True)
    New_Dev_miss_records = merged2[merged2['_merge'] == 'left_only'].drop(['_merge'], axis=1)
    
    print("New Developability Record count: {}".format(New_Dev_miss_records.shape[0]))
except Exception as e:
    print("Error: ", e)
    New_Dev_miss_records = pd.DataFrame()



# %%
New_Dev_miss_records

# %%
# Update Developability info into PostgreSQL Table
if not New_Dev_miss_records.empty:
    New_Dev_filter_records = New_Dev_miss_records
else:
    print("New records not found in Developability sheet")
    New_Dev_filter_records = pd.DataFrame()



# %%
cur = connection.cursor()

if not New_Dev_filter_records.empty:
    New_Dev_filter_records = New_Dev_filter_records.replace({np.nan: ''})
    # df.replace({np.nan: '', None: ''}, inplace=True)
    for index, row in New_Dev_filter_records.iterrows():
        if row['measurement_prot_conc_date'] == 'nan':
            row['measurement_prot_conc_date'] = None
        if row['startdatum_dialyse'] == 'nan' or row['startdatum_dialyse'] == 'NaT':
            row['startdatum_dialyse'] = None

        sql2 = """INSERT INTO order_list_clap_missing 
                  (pds, department, batch, ppb, tpp, app, internal_project_id, tpp_name, isoelectric_point, format, mw_kda, 
                   sample_alias, measurement_prot_conc_date, measurement_prot_conc_contact, startdatum_dialyse, proben_nr, pH, 
                   temperature, timepoint, nanodrop_mg_ml, buffer_formulation, analysis_type, RT, study_code, milestone, 
                   project_id, ext_cof, storage_temp, methods) 
                  VALUES (%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, 
                          %s, %s, %s,%s)"""
        val2 = (row['pds'], row['department'], row['batch'], row['ppb'], row['tpp'], row['app'], row['internal_project_id'], 
                row['tpp_name'], row['isoelectric_point'], row['format'], row['mw_kda'], row['sample_alias'], 
                row['measurement_prot_conc_date'], row['measurement_prot_conc_contact'], row['startdatum_dialyse'], 
                row['proben_nr'], row['pH'], row['temperature'], row['timepoint'], row['nanodrop_mg_ml'], 
                row['buffer_formulation'], row['analysis_type'], "DEV", row['study_code'], row['milestone'], 
                row['project_id'], row['ext_cof'], row['storage_temp'], row['methods'])
        
        try:
            cur.execute(sql2, val2)
            print("New missing Developability records were added to the database")
        except Exception as e:
            print(e)

    try:
        connection.commit()
    except Exception as e:
        print("Error committing transaction: ", e)



