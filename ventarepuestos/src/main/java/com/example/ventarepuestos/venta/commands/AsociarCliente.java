package com.example.ventarepuestos.venta.commands;

import com.example.ventarepuestos.cliente.values.ClienteId;
import com.example.ventarepuestos.venta.values.VentaId;

public class AsociarCliente {
    
    private final VentaId ventaId;
    private final ClienteId clienteId;

    public AsociarCliente(VentaId ventaId, ClienteId clienteId){
        this.ventaId = ventaId;
        this.clienteId = clienteId;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    

}
