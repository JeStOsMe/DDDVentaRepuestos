package com.example.ventarepuestos.venta.commands;

import com.example.ventarepuestos.venta.values.Fecha;
import com.example.ventarepuestos.venta.values.VentaId;

import co.com.sofka.domain.generic.Command;

public class CambiarFechaDeVenta extends Command{

    private final VentaId ventaId;
    private final Fecha fecha;

    public CambiarFechaDeVenta(VentaId ventaId, Fecha fecha){
        this.ventaId = ventaId;
        this.fecha = fecha;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public Fecha getFecha() {
        return fecha;
    }

    
    
}
