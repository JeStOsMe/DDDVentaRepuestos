package com.example.ventarepuestos.venta.events;

import com.example.ventarepuestos.venta.values.Dinero;

import co.com.sofka.domain.generic.DomainEvent;

public class ValorDeVentaCambiado extends DomainEvent {

    private final Dinero dinero;

    public ValorDeVentaCambiado(Dinero dinero){
        super("ventarepuestos.venta.valordeventacambiado");
        this.dinero = dinero;
    }

    public Dinero dinero(){
        return dinero;
    }
    
}
