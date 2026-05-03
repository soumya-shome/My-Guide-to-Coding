// src/pages/Dashboard.js
import React,  { useState, useEffect } from 'react';
import Axios from 'axios';
import { FaEdit } from "react-icons/fa";
import { FaTrash } from "react-icons/fa";
import { BsPlugin } from "react-icons/bs";
import ReactGrid from '../components/ReactGrid';
import { Box, Divider, FormControl, MenuItem, Modal, Select, TextField, Typography } from '@mui/material';
import { IoMdCloseCircleOutline } from 'react-icons/io';
import { IoIosWarning } from "react-icons/io";

// const responseData = {"current_page":"instruments","instruments":[{"id":1,"instrument_id":"I0001","instrument_name":"Vi-Cell-XR","vendor":"Beckman","version":"0.0.1","folder_location":"Beckman_Vi-Cell-XR_0.0.1","category":"PlateReader","master_inst_id":"MI0001"},{"id":25,"instrument_id":"I0025","instrument_name":"QuantStudio","vendor":"AppliedBio","version":"0.0.1","folder_location":"AppliedBio_QuantStudio_0.0.1","category":"RT-PCR","master_inst_id":"MI0004"},{"id":26,"instrument_id":"I0026","instrument_name":"Iconnmr","vendor":"Brucker","version":"0.0.1","folder_location":"Brucker_Iconnmr_0.0.1","category":"NMR","master_inst_id":"MI0003"},{"id":27,"instrument_id":"I0027","instrument_name":"Endotoxin","vendor":"CharlesTriver","version":"0.0.1","folder_location":"CharlesTriver_Endotoxin_0.0.1","category":"Spectrophotometer","master_inst_id":"MI0006"},{"id":28,"instrument_id":"I0028","instrument_name":"Chromatography","vendor":"Empower","version":"0.0.1","folder_location":"Empower_Chromatography_0.0.1","category":"Chromatography","master_inst_id":"MI0007"},{"id":29,"instrument_id":"I0029","instrument_name":"Chemstation","vendor":"Agilent","version":"1.0.0","folder_location":"Agilent_Chemstation_1.0.0","category":"CDS","master_inst_id":"MI0013"}]}

function Instruments() {

  const [rowData, setRowData] = useState([]);
  const [colDefs, setColDefs] = useState([
    { headerName: "Name", field: "instrument_name", flex: 1 },
    { headerName: "Vendor", field: "vendor", flex: 1 },
    { headerName: "Version", field: "version", flex: 1 },
    { headerName: "Folder Location", field: "folder_location", flex: 1 },
    { headerName: "Category", field: "category", flex: 1 },
    { headerName: "Action", field: "", flex: 1, cellRenderer: (params) => <div style={{ display: "flex", gap: "1rem", height: "90%", alignItems: "center", fontSize: "1.3rem", cursor: "pointer" }}>
      <FaEdit style={{ color: "darkcyan" }} onClick={() => setEditItem(params.data)} />
      <FaTrash style={{ color: "crimson" }} onClick={() => setDeleteItem(params.data)} />
    </div>},
  ]);
  const [open, setOpen] = useState(false);
  const [instrument, setInstrument] = useState("");
  const [editItem, setEditItem] = useState(null);
  const [deleteItem, setDeleteItem] = useState(null);

  const gridOptions = {
    pagination: true,
    paginationPageSize: 10, // Default page size
    paginationPageSizeSelector: [10, 20, 50, 100], // User-selectable page sizes
  };

  useEffect(() => {
    try{
      const response = Axios("http://3.128.204.153:8000/instruments/?format=json");
      // console.log(response);
      setRowData([ ...response.data.instruments]);
    } catch(e){
      console.log("Error occured --->", e);
      // setRowData([ ...responseData.instruments]);
    }
  }, [])

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

  const buttonFlex = { display: "flex", alignItems: "center" };

  return <div style={{ display: "flex", flexDirection: "column", marginTop: "1rem" }}>
    <div style={{ display: "flex", justifyContent: "space-between", paddingRight: "3rem", alignItems: "center" }}>
      <p style={{ fontSize: "2.5rem", margin: 0, padding: 0 }}>Instruments</p>
      <button style={{ display: "flex", height: "2.5rem", border: "1px solid white", backgroundColor: "#494ca2", 
        gap: "0.5rem", color: "white", alignItems: "center", outline: "none" }} onClick={() => setOpen(true)}>
          <BsPlugin />Register Instrument
      </button>
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
              Register Instrument
            </Typography>
            <IoMdCloseCircleOutline style={{ fontWeight: 800, fontSize: "1.5rem", cursor: "pointer" }} onClick={() => setOpen(false)}/>
          </Box>
          <Divider />
          <Box style={{ padding: "0 1rem" }}>
            <label style={{ display: 'block', margin: '0.5rem 0' }}>
              Select Instrument
            </label>
            <FormControl variant="outlined" style={{ width: '100%', marginBottom: "1rem" }} size="small">
              <Select
                id="instrument-select"
                value={instrument}
                onChange={(e) => setInstrument(e.target.value)}
              >
                <MenuItem value="">&nbsp;</MenuItem>
              </Select>
            </FormControl>
            <button style={{ height: "2.5rem", border: "1px solid white", backgroundColor: "#494ca2", color: "white", outline: "none", marginBottom: "1rem", ...buttonFlex }} onClick={() => {}}>Submit</button>
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
              Edit Instrument
            </Typography>
            <IoMdCloseCircleOutline style={{ fontWeight: 800, fontSize: "1.5rem", cursor: "pointer" }} onClick={() => setEditItem(null)}/>
          </Box>
          <Divider />
          <Box style={{ padding: "0 1rem" }}>
            <label style={{ display: 'block', margin: '0.5rem 0' }}>
              Instrument Name
            </label>
            <FormControl variant="outlined" style={{ width: '100%', marginBottom: "0.5rem" }} size="small">
              <TextField variant="outlined" defaultValue={editItem.instrument_name}/>
            </FormControl>
            <label style={{ display: 'block', margin: '0.5rem 0' }}>
              Vendor
            </label>
            <FormControl variant="outlined" style={{ width: '100%', marginBottom: "0.5rem" }} size="small">
              <TextField variant="outlined" defaultValue={editItem.vendor}/>
            </FormControl>
            <label style={{ display: 'block', margin: '0.5rem 0' }}>
              Version
            </label>
            <FormControl variant="outlined" style={{ width: '100%', marginBottom: "0.5rem" }} size="small">
              <TextField variant="outlined" defaultValue={editItem.version}/>
            </FormControl>
            <label style={{ display: 'block', margin: '0.5rem 0' }}>
              Folder Location
            </label>
            <FormControl variant="outlined" style={{ width: '100%', marginBottom: "0.5rem" }} size="small">
              <TextField variant="outlined" defaultValue={editItem.folder_location}/>
            </FormControl>
            <label style={{ display: 'block', margin: '0.5rem 0' }}>
              Category
            </label>
            <FormControl variant="outlined" style={{ width: '100%', marginBottom: "1rem" }} size="small">
              <TextField variant="outlined" defaultValue={editItem.category}/>
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
              Delete Instrument
            </Typography>
            <IoMdCloseCircleOutline style={{ fontWeight: 800, fontSize: "1.5rem", cursor: "pointer" }} onClick={() => setDeleteItem(null)}/>
          </Box>
          <Divider />
          <Box style={{ padding: "0 1rem" }}>
            <Box style={{ display: "flex", flexDirection: "column", alignItems: "center", textAlign: "center", paddingTop: "1rem" }}>
              <IoIosWarning style={{ color: "#494ca2", fontSize: "4rem" }} />
              <label style={{ display: 'block', margin: '0.5rem 0' }}>
                <p>{`Are you sure you want to delete instrument `}<b>{deleteItem.instrument_name}</b>{`?`}</p>
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

export default Instruments;
