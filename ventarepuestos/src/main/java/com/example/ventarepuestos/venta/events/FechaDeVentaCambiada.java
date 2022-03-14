package com.example.ventarepuestos.venta.events;

import com.example.ventarepuestos.venta.values.Fecha;

import co.com.sofka.domain.generic.DomainEvent;

public class FechaDeVentaCambiada extends DomainEvent{

    private final Fecha fecha;

    public FechaDeVentaCambiada(Fecha fecha){
        super("ventarepuestos.venta.fechadeventacambiada");
        this.fecha = fecha;
    }

    public Fecha fecha(){
        return fecha;
    }
    
}
