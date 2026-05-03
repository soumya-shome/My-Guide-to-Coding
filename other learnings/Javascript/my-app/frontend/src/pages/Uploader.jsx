import { Box, FormControl, MenuItem, Select, Typography } from '@mui/material';
import React, { useState } from 'react';
import { useDropzone } from 'react-dropzone';
import { FaUpload } from "react-icons/fa";

function DragAndDropUpload({ fileNames, setFileNames }) {
  const { getRootProps, getInputProps } = useDropzone({
    onDrop: acceptedFiles => {
      console.log('Files:', acceptedFiles);
      setFileNames([ ...acceptedFiles])
      // Handle file upload logic here
    },
  });

  return (
    <Box {...getRootProps()} border="2px dashed #c2c2c2" p={2} mb={2} textAlign="center" style={{ height: "50vh", display: "flex", flexDirection: "column", alignItems : "center", justifyContent: "center", gap: "1rem", cursor: "pointer" }}>
      <input {...getInputProps()} />
      <FaUpload style={{ fontSize: "2rem", color: "#494ca2"}} />
      {!!fileNames.length && <p>{`${fileNames.length} file(s) selected`}</p>}
      <Typography variant="h6" sx={{ color: "#494ca2" }}>Drag and drop some files or click to upload</Typography>
    </Box>
  );
}

function Uploader() {

  const [instrument, setInstrument] = useState("");
  const [fileNames, setFileNames] = useState([]);

  return <div style={{ display: "flex", flexDirection: "column", margin: "1rem 2rem 0 0" }}>
    <div style={{ display: "flex", justifyContent: "space-between", paddingRight: "3rem", alignItems: "center" }}>
      <p style={{ fontSize: "2.5rem", margin: 0, padding: 0 }}>Drag and Drop File Upload</p>
    </div>
    <Box>
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
      <DragAndDropUpload {...{ fileNames, setFileNames }}/>
      <button style={{ height: "2.5rem", border: "1px solid white", backgroundColor: "#494ca2", color: "white", outline: "none", marginBottom: "1rem", display: "flex", alignItems: "center" }} onClick={() => {}}>Submit</button>
    </Box>
  </div>;
}

export default Uploader;
