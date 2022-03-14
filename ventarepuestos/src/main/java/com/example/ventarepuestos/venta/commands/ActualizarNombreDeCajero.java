package com.example.ventarepuestos.venta.commands;

import com.example.ventarepuestos.venta.values.CajeroId;
import com.example.ventarepuestos.venta.values.NombreCajero;
import com.example.ventarepuestos.venta.values.VentaId;

import co.com.sofka.domain.generic.Command;

public class ActualizarNombreDeCajero extends Command{

    private final VentaId ventaId;
    private final CajeroId cajeroId;
    private final NombreCajero nombre;

    public ActualizarNombreDeCajero(VentaId ventaId, CajeroId cajeroId, NombreCajero nombre){
        this.ventaId = ventaId;
        this.cajeroId = cajeroId;
        this.nombre = nombre;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public CajeroId getCajeroId() {
        return cajeroId;
    }

    public NombreCajero getNombre() {
        return nombre;
    }

    
    
}
