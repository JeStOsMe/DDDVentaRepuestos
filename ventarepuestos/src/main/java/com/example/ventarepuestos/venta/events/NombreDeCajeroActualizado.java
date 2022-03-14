package com.example.ventarepuestos.venta.events;

import com.example.ventarepuestos.venta.values.CajeroId;
import com.example.ventarepuestos.venta.values.NombreCajero;

import co.com.sofka.domain.generic.DomainEvent;

public class NombreDeCajeroActualizado extends DomainEvent{

    private final CajeroId cajeroId;
    private final NombreCajero nombreCajero;

    public NombreDeCajeroActualizado(CajeroId cajeroId, NombreCajero nombreCajero){
        super("ventarepuestos.venta.nombredecajeroactualizado");
        this.cajeroId = cajeroId;
        this.nombreCajero = nombreCajero;
    }

    public CajeroId cajeroId(){
        return cajeroId;
    }

    public NombreCajero nombreCajero(){
        return nombreCajero;
    }
    
}
