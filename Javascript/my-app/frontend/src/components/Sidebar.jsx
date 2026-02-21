// src/components/Sidebar.js
import React from 'react';
import { Link as RouterLink } from 'react-router-dom';
import './Sidebar.css';
import { FaHome } from "react-icons/fa";
import { GiGears } from "react-icons/gi";
import { TbPlugConnected } from "react-icons/tb";
import { FaHistory } from "react-icons/fa";
import { ImDatabase } from "react-icons/im";
import { FaUpload } from "react-icons/fa";

import Box from '@mui/material/Box';
import Drawer from '@mui/material/Drawer';
import List from '@mui/material/List';
import Divider from '@mui/material/Divider';
import ListItem from '@mui/material/ListItem';
import ListItemButton from '@mui/material/ListItemButton';
import ListItemIcon from '@mui/material/ListItemIcon';
import ListItemText from '@mui/material/ListItemText';
import { IoMdCloseCircleOutline } from "react-icons/io";

const SidebarData = [
  { title: 'Dashboard', path: '/dashboard', icon: <FaHome />, size: "1.5rem" },
  { title: 'Instruments', path: '/instruments', icon: <GiGears />, size: "1.5rem" },
  { title: 'Connectors', path: '/connectors', icon: <TbPlugConnected />, size: "1.5rem" },
  { title: 'History', path: '/history', icon: <FaHistory />, size: "1.3rem" },
  { title: 'Data Lake', path: '/data_lake', icon: <ImDatabase />, size: "1.2rem" },
  { title: 'Uploader', path: '/uploader', icon: <FaUpload />, size: "1.2rem" },
];

function Sidebar({ open, toggleDrawer }) {

  const DrawerList = (
    <Box sx={{ position: "relative", overflow: "hidden" }} role="presentation" onClick={() => toggleDrawer(false)}>
      <IoMdCloseCircleOutline style={{ position: "absolute", right: "0.5rem", top: "0.5rem", outline: "none", fontSize: "1.8rem", padding: 0, margin: 0, color: "white", cursor: "pointer" }} onClick={() => toggleDrawer(false)} />
      <RouterLink to="/dashboard"><h1 style={{ textAlign: "center", paddingRight: "0.8rem", paddingTop: "1.5rem", cursor: "pointer", color: "white" }}>GeneFlow</h1></RouterLink>
      <Divider sx={{ borderColor: "#FFF"}} />
      <List>
        {SidebarData.map((text) => (
            <ListItem key={text.title} disablePadding  sx={{ '&:hover': { backgroundColor: "rgba(255, 255, 255, 0.3)" }}} component={RouterLink} to={text.path}>
              <ListItemButton>
                <ListItemIcon sx={{ color: "white", fontSize: text.size, display: "flex", justifyContent: "center" }}>
                  {text.icon}
                </ListItemIcon>
                <ListItemText primary={text.title} sx={{ color: '#FFF' }} />
              </ListItemButton>
            </ListItem>
        ))}
      </List>
    </Box>
  );

  return (
    <>
      <Drawer 
        sx={{
          '& .MuiDrawer-paper': {
            width: 300, // Set the width of the Drawer
            height: '100vh', // Make the Drawer full height
            boxSizing: 'border-box', // Ensure padding is included in height calculation
            backgroundColor: "#494ca2",
            color: "white"
          },
        }}
        open={open} onClose={() => toggleDrawer(false)}>
        {DrawerList}
      </Drawer>
    </>
  );
}

export default Sidebar;
