package com.example.ventarepuestos.venta.commands;

import com.example.ventarepuestos.venta.values.CajeroId;
import com.example.ventarepuestos.venta.values.VentaId;

public class AsociarCajero {
    
    private final VentaId ventaId;
    private final CajeroId cajeroId;

    public AsociarCajero(VentaId ventaId, CajeroId cajeroId){
        this.ventaId = ventaId;
        this.cajeroId = cajeroId;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public CajeroId getCajeroId() {
        return cajeroId;
    }

    

}
