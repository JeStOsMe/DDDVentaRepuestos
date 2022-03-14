package com.example.ventarepuestos.venta.events;

import com.example.ventarepuestos.venta.values.CajeroId;

import co.com.sofka.domain.generic.DomainEvent;

public class CajeroAsociado extends DomainEvent{
    
    private final CajeroId cajeroId;

    public CajeroAsociado(CajeroId cajeroId){
        super("ventarepuestos.venta.cajeroasociado");
        this.cajeroId = cajeroId;
    }

    public CajeroId cajeroId(){
        return cajeroId;
    }

}
