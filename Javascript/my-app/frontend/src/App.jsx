import * as React from 'react';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import { CgMenuRound } from "react-icons/cg";
import Sidebar from './components/Sidebar';
import Content from './components/Content';
import Dashboard from './pages/Dashboard';
import Instruments from './pages/Instruments';
import Connectors from './pages/Connectors';
import History from './pages/History';
import DataLake from './pages/DataLake';
import Uploader from './pages/Uploader';
import { createTheme, ThemeProvider } from '@mui/material/styles';

const theme = createTheme({
  typography: {
    fontFamily: [
      'Poppins',
      'sans-serif',
    ].join(','),
  },
});

export default function TemporaryDrawer() {
  const [open, setOpen] = React.useState(false);

  const toggleDrawer = (newOpen)  => {
    setOpen(newOpen);
  };

  const wrappedComponent = (component) => {
    return <div style={{ paddingLeft: "5rem" }}>
      {component}
    </div>
  }

  return (
    <ThemeProvider theme={theme}>
      <div style={{ position: "relative" }}>
        <CgMenuRound style={{ position: "absolute", top: "0.5rem", left: "0.8rem", fontSize: "3rem", padding: 0, marginLeft: 0, color: "#494ca2", cursor: "pointer" }} onClick={() => toggleDrawer(true)} />
        <BrowserRouter>
        <Sidebar {...{ open, toggleDrawer }}/>
        <Routes>
          <Route path="/dashboard" element={wrappedComponent(<Dashboard />)} />
          <Route path="/instruments" element={wrappedComponent(<Instruments />)} />
          <Route path="/connectors" element={wrappedComponent(<Connectors />)} />
          <Route path="/history" element={wrappedComponent(<History />)} />
          <Route path="/data_lake" element={wrappedComponent(<DataLake />)} />
          <Route path="/uploader" element={wrappedComponent(<Uploader />)} />
          <Route path="/" element={wrappedComponent(<Dashboard />)} />
        </Routes>
      </BrowserRouter>
      </div>
    </ThemeProvider>
  );
}