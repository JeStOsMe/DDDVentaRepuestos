package com.example.ventarepuestos.venta.events;

import com.example.ventarepuestos.vendedor.values.VendedorId;

import co.com.sofka.domain.generic.DomainEvent;

public class VendedorAsociado extends DomainEvent{

    private final VendedorId vendedorId;

    public VendedorAsociado(VendedorId vendedorId){
        super("ventarepuestos.venta.vendedorasociado");
        this.vendedorId = vendedorId;
    }

    public VendedorId vendedorId(){
        return vendedorId;
    }
    
}
