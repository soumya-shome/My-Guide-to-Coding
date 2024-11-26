import pandas as pd
import pymysql
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
 

connection = pymysql.connect(host=db_host, port = db_port, user = db_username, password = db_password ,database = db_name )
try:
    dev_sheet = pd.read_excel(tmp_input_file,"Dev. Request Sheet")
    dev_sheet.rename(columns={'Sample Alias': 'sample_alias', 'Measurement Prot. Conc. Date': 'measurement_prot_conc_date', 'Measurement Prot. Conc. Contact': 'measurement_prot_conc_contact','Startdatum Dialyse': 'startdatum_dialyse','Proben Nr.': 'proben_nr','Batch': 'batch','Temperature  [°C]': 'temperature', 'Timepoint': 'timepoint', 'Nanodrop [mg/ml]': 'nanodrop_mg_ml', 'Buffer formulation': 'buffer_formulation', 'Analysis Type': 'analysis_type'}, inplace=True)
    dev_sheet.rename(columns={'nano-DSF':'nanoDSF','Study Code': 'study_code', 'Lab': 'department', 'PPB': 'ppb','TPP': 'tpp','APP': 'app','Sanofi Project ID': 'internal_project_id','TPP Name': 'tpp_name', 'pI': 'isoelectric_point', 'Format': 'format', 'MW [kDa]': 'mw_kda','Milestone':'milestone','PDS Liste':'pds','PAS Liste':'pds','Project ID':'project_id','Ext. Koeffizent':'ext_cof',' Storage Temp [°C]':'storage_temp' ,'Storage Temp [°C]':'storage_temp' ,'Storage at -80 °C':'storage_at_80'}, inplace=True)
    dev_sheet2 = add_columns_containing_value(dev_sheet,'x')
    required_col = dev_sheet2[['sample_alias','measurement_prot_conc_date', \
                            'measurement_prot_conc_contact','startdatum_dialyse','batch','pH','temperature', \
                            'timepoint','nanodrop_mg_ml','buffer_formulation','analysis_type','study_code', \
                            'department','ppb','tpp','app','internal_project_id','tpp_name','isoelectric_point', \
                            'format','mw_kda','milestone','pds','project_id','ext_cof','storage_temp','storage_at_80','methods']]
    required_col[['startdatum_dialyse','measurement_prot_conc_date','measurement_prot_conc_contact', \
                'temperature', 'pH', 'batch','methods']] = required_col[['startdatum_dialyse','measurement_prot_conc_date','measurement_prot_conc_contact', \
                'temperature', 'pH', 'batch','methods']].astype(str)
    startdatum_dialyse_na_df = required_col[required_col['startdatum_dialyse'].isna()]
    startdatum_dialyse_na_df[['startdatum_dialyse','measurement_prot_conc_date','measurement_prot_conc_contact', 'temperature',\
                        'pH', 'batch','methods']] = startdatum_dialyse_na_df[['startdatum_dialyse','measurement_prot_conc_date','measurement_prot_conc_contact', 'temperature',\
                        'pH', 'batch','methods']].astype(str)
    startdatum_dialyse_df = required_col.dropna(subset=['startdatum_dialyse'])
    startdatum_dialyse_df[['startdatum_dialyse','measurement_prot_conc_date','measurement_prot_conc_contact', 'temperature',\
                        'pH', 'batch','methods']] = startdatum_dialyse_na_df[['startdatum_dialyse','measurement_prot_conc_date','measurement_prot_conc_contact', 'temperature',\
                        'pH', 'batch','methods']].astype(str)

    try:
        query3 = "SELECT sample_alias, measurement_prot_conc_contact, temperature, pH, batch, tpp_name, methods, startdatum_dialyse from order_list_clap_missing"
        old_dev_miss_record = pd.read_sql(query3, connection)
        old_dev_miss_record[['sample_alias', 'measurement_prot_conc_contact', 'temperature','pH', 'batch', 'tpp_name', 'methods', 'startdatum_dialyse']] = old_dev_miss_record[['sample_alias', 'measurement_prot_conc_contact', 'temperature', 'pH', 'batch', 'tpp_name', 'methods', 'startdatum_dialyse']].astype(str)
        # required_col = required_col.dropna(subset=['startdatum_dialyse'])
        records_to_remove = startdatum_dialyse_df.merge(old_dev_miss_record, on=['sample_alias', 'measurement_prot_conc_contact','batch', 'methods'])
 
        print("records_to_remove:",records_to_remove.shape[0])
    except Exception as e:
        print("Error: ",e)
        records_to_remove = pd.DataFrame()
    ##########################  Update Developability info into mysql Table #############################
    if not records_to_remove.empty:
        New_Dev_filter_records = records_to_remove
    else:
        print("New records not found in Developability sheet")
        New_Dev_filter_records = pd.DataFrame()
 
    cursor = connection.cursor()
 
    if not New_Dev_filter_records.empty:
        # New_Dev_filter_records = New_Dev_filter_records[['sample_alias', 'measurement_prot_conc_contact','temperature', 'pH', 'batch', 'methods']].drop_duplicates().values.tolist()
        New_Dev_filter_records = New_Dev_filter_records.replace({np.nan:''})
        for index, row in New_Dev_filter_records.iterrows():
            if row['measurement_prot_conc_date'] == 'NaT':
                row['measurement_prot_conc_date'] = None
            sql2 = "DELETE FROM order_list_clap_missing WHERE (sample_alias = %s AND measurement_prot_conc_date = %s AND measurement_prot_conc_contact = %s AND temperature = %s AND pH = %s AND batch = %s AND methods = %s)"
            val2 = (row['sample_alias'],row['measurement_prot_conc_date'], row['measurement_prot_conc_contact'],row['temperature'],row['pH'],row['batch'],row['methods'])            # print("Query {}{}".format(sql2,val2))
            try:
                # cur.execute(sql2,val2)
                print(f"Query executed: {sql2}:{val2}")
            except Exception as e:
                print(e)
                # print(delete_query,records_to_delete)
        try:
            connection.commit()
        except:
            pass
    else:
        print("Nothing to delete")
    try:
        query3 = "SELECT sample_alias,measurement_prot_conc_contact, temperature,pH, batch,tpp_name,methods from order_list_clap_missing"
        old_dev_miss_record = pd.read_sql(query3, connection)
        old_dev_miss_record[['sample_alias','measurement_prot_conc_contact', 'temperature','pH', 'batch','tpp_name','methods']] = old_dev_miss_record[['sample_alias','measurement_prot_conc_contact', 'temperature','pH', 'batch','tpp_name','methods']].astype(str)
        merged2 = startdatum_dialyse_na_df.merge(old_dev_miss_record, how='left', indicator=True)
        New_Dev_miss_records = merged2[merged2['_merge']=='left_only'].drop(['_merge'],axis=1)
        print("New Developability Record count: {}".format(New_Dev_miss_records.shape[0]))
    except Exception as e:
        print("Error: ",e)
        New_Dev_miss_records = pd.DataFrame()
    ##########################  Update Developability info into mysql Table #############################
    if not New_Dev_miss_records.empty:
        New_Dev_filter_records = New_Dev_miss_records
    else:
        print("New records not found in Developability sheet")
        New_Dev_filter_records = pd.DataFrame()
    cur = connection.cursor()    
    if not New_Dev_filter_records.empty:
        New_Dev_filter_records = New_Dev_filter_records.replace({np.nan:''})
        for index, row in New_Dev_filter_records.iterrows():
            if row['measurement_prot_conc_date'] == 'NaT':
                row['measurement_prot_conc_date'] = None
            if row['startdatum_dialyse'] == 'NaT':
                row['startdatum_dialyse'] = None
            sql2 = "INSERT INTO `order_list_clap_missing` (`pds`, `department`, `batch`, `ppb`, `tpp`, `app`, `internal_project_id`, `tpp_name`, `isoelectric_point`, `format`,  `mw_kda`, `sample_alias`, `measurement_prot_conc_date`, `measurement_prot_conc_contact`, `startdatum_dialyse`, `proben_nr`, `pH`, `temperature`, `timepoint`, `nanodrop_mg_ml`, `buffer_formulation`, `analysis_type`, `RT`, `study_code`, `milestone`, `project_id`, `ext_cof`, `storage_temp`,`methods`) VALUES (%s, %s, %s, %s,%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)"
            val2 = (row['pds'], row['department'], row['batch'], row['ppb'], row['tpp'], row['app'], row['internal_project_id'], row['tpp_name'], row['isoelectric_point'], row['format'], row['mw_kda'],  row['sample_alias'], row['measurement_prot_conc_date'],row['measurement_prot_conc_contact'],row['startdatum_dialyse'],row['proben_nr'],row['pH'],row['temperature'],row['timepoint'],row['nanodrop_mg_ml'],row['buffer_formulation'],row['analysis_type'],"DEV",row['study_code'],row['milestone'],row['project_id'],row['ext_cof'],row['storage_temp'],row['methods'])
            # print("Query {}{}".format(sql2,val2))
            try:
                # cur.execute(sql2, val2 )
                print(f"Query executed: {sql2}:{val2}")
            except Exception as e:
                print(e)
                # print("startdatum dialyse is a not valid datetime : {}".format(row['startdatum_dialyse']))
        try:
            connection.commit()
        except:
            pass
except Exception as e:
    print(e)
finally:
    connection.close()