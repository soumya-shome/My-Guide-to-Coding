// src/pages/Dashboard.js
import React,  { useState, useEffect } from 'react';
import Axios from 'axios';
import { FaEdit } from "react-icons/fa";
import { FaEye } from "react-icons/fa6";
import { FaTrash } from "react-icons/fa";
import { BsPlugin } from "react-icons/bs";
import ReactGrid from '../components/ReactGrid';
import { Box, Divider, FormControl, MenuItem, Modal, Select, TextField, Typography } from '@mui/material';
import { IoIosWarning, IoMdCloseCircleOutline } from 'react-icons/io';

// const responseData = {"current_page":"connectors","connectors":[{"id":1,"connector_id":"C0001","connector_name":"Amgen-HTE-Vicell-XR-Lab21","ckey":"14198f5e-548f-4efa-bf49-54f0067c3e3c","instrument_id":"I0001","status":"1","instrument_name":"Vi-Cell-XR","vendor":"Beckman","version":"0.0.1","folder_location":"Beckman_Vi-Cell-XR_0.0.1","category":"PlateReader","master_inst_id":"MI0001"},{"id":25,"connector_id":"C0027","connector_name":"New_QuantStudio_test","ckey":"3c9603b2-2a23-4699-b30f-56c3ae1ad88f","instrument_id":"I0025","status":"0","instrument_name":"QuantStudio","vendor":"AppliedBio","version":"0.0.1","folder_location":"AppliedBio_QuantStudio_0.0.1","category":"RT-PCR","master_inst_id":"MI0004"},{"id":27,"connector_id":"C0028","connector_name":"Test_EndoToxin","ckey":"ee1ebd10-eda6-452f-8ec0-25e8894d87cf","instrument_id":"I0027","status":"0","instrument_name":"Endotoxin","vendor":"CharlesTriver","version":"0.0.1","folder_location":"CharlesTriver_Endotoxin_0.0.1","category":"Spectrophotometer","master_inst_id":"MI0006"},{"id":28,"connector_id":"C0029","connector_name":"Chromatography_Test","ckey":"a0ceb3d6-a3a0-4926-abaf-e95d8da2e8c2","instrument_id":"I0028","status":"1","instrument_name":"Chromatography","vendor":"Empower","version":"0.0.1","folder_location":"Empower_Chromatography_0.0.1","category":"Chromatography","master_inst_id":"MI0007"},{"id":29,"connector_id":"C0031","connector_name":"neeconnector","ckey":"1a7884f2-7d1e-4ead-a641-050106d52ccc","instrument_id":"I0029","status":"0","instrument_name":"Chemstation","vendor":"Agilent","version":"1.0.0","folder_location":"Agilent_Chemstation_1.0.0","category":"CDS","master_inst_id":"MI0013"},{"id":29,"connector_id":"C0030","connector_name":"Chemstation_Lab","ckey":"fbd3df93-2486-4d36-ba71-84e586551a62","instrument_id":"I0029","status":"1","instrument_name":"Chemstation","vendor":"Agilent","version":"1.0.0","folder_location":"Agilent_Chemstation_1.0.0","category":"CDS","master_inst_id":"MI0013"}]}

function Connectors() {

  const [rowData, setRowData] = useState([]);
  const [colDefs, setColDefs] = useState([
    { headerName: "Connector Name", field: "connector_name", flex: 1 },
    { headerName: "Instrument Name", field: "instrument_name", flex: 1 },
    { headerName: "Instrument Version", field: "version", flex: 1 },
    { headerName: "Status", field: "status", flex: 1, hide: true },
    { headerName: "Action", field: "", flex: 1, cellRenderer: (params) => <div style={{ display: "flex", gap: "1rem", height: "90%", alignItems: "center", fontSize: "1.3rem", cursor: "pointer" }}>
      {params.data.status != 1 ? <FaEdit style={{ color: "darkcyan" }} onClick={() => setEditItem(params.data)} /> : <></>}
      <FaEye style={{ color: "#5C6BC0" }} onClick={() => setViewItem(params.data)} />
      <FaTrash style={{ color: "crimson" }} onClick={() => setDeleteItem(params.data)} />
    </div>},
  ]);
  const [open, setOpen] = useState(false);
  const [connector, setConnector] = useState("");
  const [viewItem, setViewItem] = useState(null);
  const [editItem, setEditItem] = useState(null);
  const [deleteItem, setDeleteItem] = useState(null);

  const gridOptions = {
    pagination: true,
    paginationPageSize: 10, // Default page size
    paginationPageSizeSelector: [10, 20, 50, 100], // User-selectable page sizes
  };

  const style = {
    position: 'absolute',
    top: '30%',
    left: '50%',
    transform: 'translate(-50%, -50%)',
    width: "30%",
    bgcolor: 'background.paper',
    boxShadow: 24,
    padding: "0",
    borderRadius: "0.25rem"
  };

  const buttonFlex = { display: "flex", alignItems: "center" }

  useEffect(() => {
    try{
      const response = Axios("http://3.128.204.153:8000/connectors/?format=json");
      // console.log(response);
      setRowData([ ...response.data.connectors]);
    } catch(e){
      console.log("Error occured --->", e);
      // setRowData([ ...responseData.connectors]);
    }
  }, [])

  return <div style={{ display: "flex", flexDirection: "column", marginTop: "1rem" }}>
    <div style={{ display: "flex", justifyContent: "space-between", paddingRight: "3rem", alignItems: "center" }}>
      <p style={{ fontSize: "2.5rem", margin: 0, padding: 0 }}>Connectors</p>
      <button style={{ display: "flex", height: "2.5rem", border: "1px solid white", backgroundColor: "#494ca2", gap: "0.5rem", color: "white", alignItems: "center", outline: "none" }} onClick={() => setOpen(true)}><BsPlugin />Register Connector</button>
    </div>
    {!!rowData.length && <>
      <ReactGrid {...{ rowData, colDefs, gridOptions }} />
    </>}
    {!!open ?  <Modal
        open={open}
        onClose={() => setOpen(false)}
        aria-labelledby="modal-modal-title"
        aria-describedby="modal-modal-description"
      >
        <Box sx={style}>
          <Box sx={{ display: "flex", alignItems: "center", padding: "1rem 0.5rem 0.5rem 1rem" }}>
            <Typography sx={{ flex: 1 }} id="modal-modal-title" variant="h5" component="h2">
              Register Connector
            </Typography>
            <IoMdCloseCircleOutline style={{ fontWeight: 800, fontSize: "1.5rem", cursor: "pointer" }} onClick={() => setOpen(false)}/>
          </Box>
          <Divider />
          <Box style={{ padding: "0 1rem" }}>
            <label style={{ display: 'block', margin: '0.5rem 0' }}>
              Select Connector
            </label>
            <FormControl variant="outlined" style={{ width: '100%', marginBottom: "1rem" }} size="small">
              <Select
                id="instrument-select"
                value={connector}
                onChange={(e) => setConnector(e.target.value)}
              >
                <MenuItem value="">&nbsp;</MenuItem>
              </Select>
            </FormControl>
            <button style={{ height: "2.5rem", border: "1px solid white", backgroundColor: "#494ca2", color: "white", outline: "none", marginBottom: "1rem", ...buttonFlex }} onClick={() => {}}>Submit</button>
          </Box>
        </Box>
      </Modal> : <></> }
    {!!viewItem ?  <Modal
      open={!!viewItem}
      onClose={() => setViewItem(null)}
      aria-labelledby="modal-modal-title"
      aria-describedby="modal-modal-description"
    >
      <Box sx={style}>
        <Box sx={{ display: "flex", alignItems: "center", padding: "1rem 0.5rem 0.5rem 1rem" }}>
          <Typography sx={{ flex: 1 }} id="modal-modal-title" variant="h5" component="h2">
            Connector Details
          </Typography>
          <IoMdCloseCircleOutline style={{ fontWeight: 800, fontSize: "1.5rem", cursor: "pointer" }} onClick={() => setViewItem(null)}/>
        </Box>
        <Divider />
        <Box style={{ padding: "1rem", display: "flex", flexDirection: "column", gap: "0.3rem" }}>
          <label style={{ display: 'block', margin: '0.5rem 0' }}>
            <b>Connector Name:</b>&nbsp;{viewItem.connector_name}
          </label>
          <label style={{ display: 'block', margin: '0.5rem 0' }}>
            <b>Connector Key:</b>&nbsp;{viewItem.ckey}
          </label>
          <label style={{ display: 'block', margin: '0.5rem 0' }}>
            <b>Instrument Name:</b>&nbsp;{viewItem.instrument_name}
          </label>
          <label style={{ display: 'block', margin: '0.5rem 0' }}>
            <b>Instrument Version:</b>&nbsp;{viewItem.version}
          </label>
          <label style={{ display: 'block', margin: '0.5rem 0' }}>
            <b>Status:</b>&nbsp;{viewItem.status}
          </label>
        </Box>
      </Box>
    </Modal> : <></> }
    {!!editItem ? <Modal
        open={!!editItem}
        onClose={() => setEditItem(null)}
        aria-labelledby="modal-edit-title"
        aria-describedby="modal-edit-description"
      >
      <Box sx={{ ...style, top: "50%" }}>
        <Box sx={{ display: "flex", alignItems: "center", padding: "1rem 0.5rem 0.5rem 1rem" }}>
          <Typography sx={{ flex: 1 }} id="modal-modal-title" variant="h5" component="h2">
            Edit Connector
          </Typography>
          <IoMdCloseCircleOutline style={{ fontWeight: 800, fontSize: "1.5rem", cursor: "pointer" }} onClick={() => setEditItem(null)}/>
        </Box>
        <Divider />
        <Box style={{ padding: "0 1rem" }}>
          <label style={{ display: 'block', margin: '0.5rem 0' }}>
            Instrument ID
          </label>
          <FormControl variant="outlined" style={{ width: '100%', marginBottom: "0.5rem" }} size="small">
            <TextField variant="outlined" defaultValue={editItem.connector_id}/>
          </FormControl>
          <label style={{ display: 'block', margin: '0.5rem 0' }}>
            Connector Name
          </label>
          <FormControl variant="outlined" style={{ width: '100%', marginBottom: "0.5rem" }} size="small">
            <TextField variant="outlined" defaultValue={editItem.connector_name}/>
          </FormControl>
          <label style={{ display: 'block', margin: '0.5rem 0' }}>
            Instrument Name
          </label>
          <FormControl variant="outlined" style={{ width: '100%', marginBottom: "0.5rem" }} size="small">
            <TextField variant="outlined" defaultValue={editItem.instrument_name}/>
          </FormControl>
          <label style={{ display: 'block', margin: '0.5rem 0' }}>
            Version
          </label>
          <FormControl variant="outlined" style={{ width: '100%', marginBottom: "0.5rem" }} size="small">
            <TextField variant="outlined" defaultValue={editItem.version}/>
          </FormControl>
          <label style={{ display: 'block', margin: '0.5rem 0' }}>
            Status
          </label>
          <FormControl variant="outlined" style={{ width: '100%', marginBottom: "1rem" }} size="small">
            <TextField variant="outlined" defaultValue={editItem.status}/>
          </FormControl>
          <button style={{ height: "2.5rem", border: "1px solid white", backgroundColor: "#494ca2", color: "white", outline: "none", marginBottom: "1rem", ...buttonFlex }} onClick={() => {}}>Save Changes</button>
        </Box>
      </Box>
      </Modal> : <></>}
    {!!deleteItem ? <Modal
        open={!!deleteItem}
        onClose={() => setOpen(false)}
        aria-labelledby="modal-modal-title"
        aria-describedby="modal-modal-description"
      >
        <Box sx={style}>
          <Box sx={{ display: "flex", alignItems: "center", padding: "1rem 0.5rem 0.5rem 1rem" }}>
            <Typography sx={{ flex: 1 }} id="modal-modal-title" variant="h5" component="h2">
              Delete Connector
            </Typography>
            <IoMdCloseCircleOutline style={{ fontWeight: 800, fontSize: "1.5rem", cursor: "pointer" }} onClick={() => setDeleteItem(null)}/>
          </Box>
          <Divider />
          <Box style={{ padding: "0 1rem" }}>
            <Box style={{ display: "flex", flexDirection: "column", alignItems: "center", textAlign: "center", paddingTop: "1rem" }}>
              <IoIosWarning style={{ color: "#494ca2", fontSize: "4rem" }} />
              <label style={{ display: 'block', margin: '0.5rem 0' }}>
                <p>{`Are you sure you want to delete instrument `}<b>{deleteItem.connector_name}</b>{`?`}</p>
                <p>{`This action cannot be undone.`}</p>
              </label>
            </Box>
          </Box>
          <Divider />
          <Box style={{ display: "flex", justifyContent: "center", gap: "1rem", paddingTop: "1rem" }}>
            <button style={{ height: "2.5rem", border: "2px solid #494ca2", backgroundColor: "white", color: "#494ca2", outline: "none", marginBottom: "1rem", ...buttonFlex }} onClick={() => setDeleteItem(null)}>Cancel</button>
            <button style={{ height: "2.5rem", border: "1px solid white", backgroundColor: "#494ca2", color: "white", outline: "none", marginBottom: "1rem", ...buttonFlex }} onClick={() => {}}>Delete</button>
          </Box>
        </Box>
      </Modal> : <></>}
  </div>;
}

export default Connectors;

