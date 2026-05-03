// src/pages/Dashboard.js
import React from 'react';
import Sidebar from '../components/Sidebar';

function Dashboard() {
  return <div style={{ display: "flex", flexDirection: "column", marginTop: "1rem" }}>
    <div style={{ display: "flex", justifyContent: "space-between", paddingRight: "3rem", alignItems: "center" }}>
      <p style={{ fontSize: "2.5rem", margin: 0, padding: 0 }}>Dashboard</p>
    </div>
    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Repellendus exercitationem, eveniet beatae cum, maxime neque earum consequatur voluptate eaque et explicabo consectetur. Omnis dolorem, possimus aperiam nemo ut, harum ullam iusto modi fugiat laudantium reprehenderit eligendi, porro ipsum cum sunt quis voluptates deserunt debitis vel voluptas nesciunt esse! Iusto, officia.</p>
  </div>;
}

export default Dashboard;