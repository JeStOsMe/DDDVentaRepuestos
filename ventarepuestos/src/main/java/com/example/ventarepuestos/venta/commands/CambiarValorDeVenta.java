package com.example.ventarepuestos.venta.commands;

import com.example.ventarepuestos.venta.values.Dinero;
import com.example.ventarepuestos.venta.values.VentaId;

import co.com.sofka.domain.generic.Command;

public class CambiarValorDeVenta extends Command{

    private final VentaId ventaId;
    private final Dinero dinero;
    
    public CambiarValorDeVenta(VentaId ventaId, Dinero dinero){
        this.ventaId = ventaId;
        this.dinero = dinero;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public Dinero getDinero() {
        return dinero;
    }

    
    
}
