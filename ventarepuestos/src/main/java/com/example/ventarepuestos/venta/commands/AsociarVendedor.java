package com.example.ventarepuestos.venta.commands;

import com.example.ventarepuestos.vendedor.values.VendedorId;
import com.example.ventarepuestos.venta.values.VentaId;

public class AsociarVendedor {

    private final VentaId ventaId;
    private final VendedorId vendedorId;

    public AsociarVendedor(VentaId ventaId, VendedorId vendedorId){
        this.ventaId = ventaId;
        this.vendedorId = vendedorId;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    
    
}
