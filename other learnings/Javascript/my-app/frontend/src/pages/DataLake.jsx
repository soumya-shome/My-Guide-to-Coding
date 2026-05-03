// src/pages/Dashboard.js
import React, { useEffect, useState } from 'react';
import ReactGrid from '../components/ReactGrid';
// import datalake from '../assets/datalake';
import { Box, Divider, Modal, Typography } from '@mui/material';
import { IoMdCloseCircleOutline } from 'react-icons/io';
import Axios from 'axios';

// const responseData = JSON.parse({"current_page":"data_lake","table_data": [{"entry_id": "D0024", "processed_on": "12 Feb, 2025 14:24:23", "updated_filename": "C0000_2025-02-12_08-54-22_Chromatography_0.0.1.pdf"}]});

function DataLake() {

  const [rowData, setRowData] = useState([]);
  const [colDefs, setColDefs] = useState([
    { headerName: "Log ID", field: "log_id", flex: 1 },
    { headerName: "Original File Name", field: "original_filename", flex: 1 },
    { headerName: "Updated File Name", field: "updated_filename", flex: 1 },
    { headerName: "File URL", field: "file_url", flex: 1 },
    { headerName: "Processed Data", field: "", flex: 1, cellRenderer: (params) => <div>
      <button style={{ backgroundColor: "#494ca2", color: "white", cursor: "pointer" }} onClick={() => setShowData(params.data.data)}>View Processed Data</button>
    </div>},
  ]);
  const [showData, setShowData] = useState(false);

  useEffect(() => {
    console.log("Firing...");
    try{
      const response = Axios("http://3.128.204.153:8000/data_lake/?format=json");
      // console.log(response);
      setRowData([ ...response.data.data]);
    } catch(e){
      console.log("Error occured --->", e);
      // setRowData([ ...responseData.connectors]);
    }
  }, [])

  const gridOptions = {
    pagination: true,
    paginationPageSize: 10, // Default page size
    paginationPageSizeSelector: [10, 20, 50, 100], // User-selectable page sizes
  };

  const style = {
    position: 'absolute',
    top: "10%",
    left: '50%',
    transform: 'translate(-50%, 0%)',
    width: "70%",
    bgcolor: 'background.paper',
    boxShadow: 24,
    padding: "0",
    margin: "auto",
    borderRadius: "0.25rem"
  };


  return <div style={{ display: "flex", flexDirection: "column", marginTop: "1rem" }}>
    <div style={{ display: "flex", justifyContent: "space-between", paddingRight: "3rem", alignItems: "center" }}>
      <p style={{ fontSize: "2.5rem", margin: 0, padding: 0 }}>Data Lake</p>
    </div>
    {!!rowData.length && <>
      <ReactGrid {...{ rowData, colDefs, gridOptions }} />
    </>}
    {/* {!!showData ? <div style={{ position: "absolute", backgroundColor: "rgba(0,0,0,0.5)", zIndex: 99999, top: 0, left: 0, right: 0 }}>
      <div style={{ backgroundColor: "white", width: "70%", margin: "auto" }}>
        <p onClick={() => setShowData(false)}>X</p>
        <div style={{ paddingLeft: "2rem" }}><pre>{JSON.stringify(JSON.parse(showData.replace(/NaN/g, 'null')), null, 2)}</pre></div>
      </div>
    </div> : <></>} */}
    {!!showData ?  <Modal
        open={!!showData}
        onClose={() => setShowData(false)}
        aria-labelledby="modal-modal-title"
        aria-describedby="modal-modal-description"
      >
        <Box sx={style}>
          <Box sx={{ display: "flex", alignItems: "center", padding: "1rem 0.5rem 0.5rem 1rem" }}>
            <Typography sx={{ flex: 1 }} id="modal-modal-title" variant="h5" component="h2">
              Processed Data
            </Typography>
            <IoMdCloseCircleOutline style={{ fontWeight: 800, fontSize: "1.5rem", cursor: "pointer" }} onClick={() => setShowData(false)}/>
          </Box>
          <Divider />
          <Box style={{ padding: "0 1rem", maxHeight: "80vh", overflowY: "scroll" }}>
            <pre>{JSON.stringify(JSON.parse(showData.replace(/NaN/g, 'null')), null, 2)}</pre>
          </Box>
        </Box>
      </Modal> : <></> }
  </div>;
}

export default DataLake;
