package com.example.ventarepuestos.venta.events;

import com.example.ventarepuestos.venta.values.Fecha;

import co.com.sofka.domain.generic.DomainEvent;

public class VentaCreada extends DomainEvent{
    private final Fecha fecha;

    public VentaCreada(Fecha fecha){
        super("ventarepuestos.venta.ventacreada");
        this.fecha = fecha;
    }

    public Fecha fecha(){
        return fecha;
    }
}
