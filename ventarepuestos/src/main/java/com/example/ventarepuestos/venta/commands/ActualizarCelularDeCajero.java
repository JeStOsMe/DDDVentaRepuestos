package com.example.ventarepuestos.venta.commands;

import com.example.ventarepuestos.venta.values.CajeroId;
import com.example.ventarepuestos.venta.values.CelularCajero;
import com.example.ventarepuestos.venta.values.VentaId;

import co.com.sofka.domain.generic.Command;

public class ActualizarCelularDeCajero extends Command{

    private final VentaId ventaId;
    private final CajeroId cajeroId;
    private final CelularCajero celular;

    public ActualizarCelularDeCajero(VentaId ventaId, CajeroId cajeroId, CelularCajero celular){
        this.ventaId = ventaId;
        this.cajeroId = cajeroId;
        this.celular = celular;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public CajeroId getCajeroId() {
        return cajeroId;
    }

    public CelularCajero getCelular() {
        return celular;
    }

    
    
}
