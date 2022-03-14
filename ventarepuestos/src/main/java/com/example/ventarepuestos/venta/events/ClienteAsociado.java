package com.example.ventarepuestos.venta.events;

import com.example.ventarepuestos.cliente.values.ClienteId;

import co.com.sofka.domain.generic.DomainEvent;

public class ClienteAsociado extends DomainEvent{
    
    private final ClienteId clienteId;

    public ClienteAsociado(ClienteId clienteId){
        super("ventarepuestos.venta.clienteasociado");
        this.clienteId = clienteId;
    }

    public ClienteId clienteId(){
        return clienteId;
    }
}
