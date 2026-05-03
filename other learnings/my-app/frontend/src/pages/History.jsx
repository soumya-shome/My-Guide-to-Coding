// src/pages/History.js
import React,  { useState, useEffect } from 'react';
import Axios from 'axios';
import { FaEdit } from "react-icons/fa";
import { FaTrash } from "react-icons/fa";
import { BsPlugin } from "react-icons/bs";
import ReactGrid from '../components/ReactGrid';

// const responseData = {"current_page":"logs","log_data":[{"log_id":"L0146","connector_id":"C0000","instrument_name":"Chromatography","version":"0.0.1","ip_address":"","pc_name":"via Uploader","timestamp":"2025-03-06 11:42:58","status":"Processed","org_filename":"Empower_Chromatography.pdf","updated_filename":"C0000_2025-03-06_11-42-58_Chromatography_0.0.1.pdf"},{"log_id":"L0145","connector_id":"C0000","instrument_name":"Chromatography","version":"0.0.1","ip_address":"","pc_name":"via Uploader","timestamp":"2025-02-19 06:48:27","status":"Processed","org_filename":"Empower_Chromatography.pdf","updated_filename":"C0000_2025-02-19_06-48-27_Chromatography_0.0.1.pdf"},{"log_id":"L0144","connector_id":"C0001","instrument_name":"Vi-Cell-XR","version":"0.0.1","ip_address":"192.168.76.198","pc_name":"LTIN546059","timestamp":"2025-02-13 14:53:32","status":"Processed","org_filename":"GAA S8 P6D0 1B.txt","updated_filename":"C0001_2025-02-13_14-53-32_Vi-Cell-XR_0.0.1.txt"},{"log_id":"L0142","connector_id":"C0000","instrument_name":"Iconnmr","version":"0.0.1","ip_address":"","pc_name":"via Uploader","timestamp":"2025-02-12 08:54:48","status":"Processed","org_filename":"Sep29-2023-1600-PHARMA-FRGCRV164 (1).set","updated_filename":"C0000_2025-02-12_08-54-48_Iconnmr_0.0.1.set"},{"log_id":"L0141","connector_id":"C0000","instrument_name":"Chromatography","version":"0.0.1","ip_address":"","pc_name":"via Uploader","timestamp":"2025-02-12 08:54:22","status":"Processed","org_filename":"Empower_Chromatography.pdf","updated_filename":"C0000_2025-02-12_08-54-22_Chromatography_0.0.1.pdf"},{"log_id":"L0121","connector_id":"C0000","instrument_name":"QuantStudio","version":"0.0.1","ip_address":"","pc_name":"Soumyadeep-PC","timestamp":"2025-02-08 21:32:55","status":"Processed","org_filename":"2019-04-25_135946-KCNJ6.csv","updated_filename":"C0000_2025-02-08_21-32-55_QuantStudio_0.0.1.csv"}]}

function Instruments() {

  const [rowData, setRowData] = useState([]);
  const [colDefs, setColDefs] = useState([
    { headerName: "Connector ID", field: "connector_id", flex: 1 },
    { headerName: "Instrument Name", field: "instrument_name", flex: 1 },
    { headerName: "Instrument Version", field: "version", flex: 1 },
    { headerName: "IP Address", field: "ip_address", flex: 1 },
    { headerName: "PC Name", field: "pc_name", flex: 1 },
    { headerName: "Timestamp", field: "timestamp", flex: 1 },
    { headerName: "Status", field: "status", flex: 1 },
    { headerName: "Original Filename", field: "org_filename", flex: 1 },
    { headerName: "Updated Filename", field: "updated_filename", flex: 1 },
  ]);

  const gridOptions = {
    pagination: true,
    paginationPageSize: 10, // Default page size
    paginationPageSizeSelector: [10, 20, 50, 100], // User-selectable page sizes
  };

  useEffect(() => {
    try{
      const response = Axios("http://3.128.204.153:8000/logs/?format=json");
      // console.log(response);
      setRowData([ ...response.data.log_data]);
    } catch(e){
      console.log("Error occured --->", e);
      // setRowData([ ...responseData.log_data]);
    }
  }, [])

  return <div style={{ display: "flex", flexDirection: "column", marginTop: "1rem" }}>
      <p style={{ fontSize: "2.5rem", margin: 0, padding: 0 }}>Client History</p>
    {!!rowData.length && <>
      <ReactGrid {...{ rowData, colDefs, gridOptions }} />
    </>}
  </div>;
}

export default Instruments;
