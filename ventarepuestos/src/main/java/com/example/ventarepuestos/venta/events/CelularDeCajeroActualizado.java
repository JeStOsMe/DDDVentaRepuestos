package com.example.ventarepuestos.venta.events;

import com.example.ventarepuestos.venta.values.CajeroId;
import com.example.ventarepuestos.venta.values.CelularCajero;

import co.com.sofka.domain.generic.DomainEvent;

public class CelularDeCajeroActualizado extends DomainEvent{
    
    private final CajeroId cajeroId;
    private final CelularCajero celular;

    public CelularDeCajeroActualizado(CajeroId cajeroId, CelularCajero celular){
        super("ventarepuestos.venta.celulardecajeroactualizado");
        this.cajeroId = cajeroId;
        this.celular = celular;
    }

    public CajeroId cajeroId(){
        return cajeroId;
    }

    public CelularCajero celular(){
        return celular;
    }
}
