import React from 'react';
import { AgGridReact } from 'ag-grid-react';
import { AllCommunityModule, ModuleRegistry } from 'ag-grid-community';

// Register all Community features
ModuleRegistry.registerModules([AllCommunityModule]);

const ReactGrid = ({ rowData, colDefs, gridOptions }) => {
    return (
        <>
            <div style={{ height: "80vh", marginTop: "1rem", paddingRight: "3rem" }}>
                <div style={{ height: "100%" }}>
                    <AgGridReact
                        rowData={rowData}
                        columnDefs={colDefs}
                        {...gridOptions}
                    />
                </div>
            </div>
        </>
    )
}

export default ReactGrid;