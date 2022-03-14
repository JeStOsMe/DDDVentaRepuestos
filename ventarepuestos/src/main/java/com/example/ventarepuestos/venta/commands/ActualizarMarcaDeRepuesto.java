package com.example.ventarepuestos.venta.commands;

import com.example.ventarepuestos.venta.values.MarcaRepuesto;
import com.example.ventarepuestos.venta.values.RepuestoId;
import com.example.ventarepuestos.venta.values.VentaId;

import co.com.sofka.domain.generic.Command;

public class ActualizarMarcaDeRepuesto extends Command{

    private final VentaId ventaId;
    private final RepuestoId repuestoId;
    private final MarcaRepuesto marca;

    public ActualizarMarcaDeRepuesto(VentaId ventaId, RepuestoId repuestoId, MarcaRepuesto marca){
        this.ventaId = ventaId;
        this.repuestoId = repuestoId;
        this.marca = marca;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public RepuestoId getRepuestoId() {
        return repuestoId;
    }

    public MarcaRepuesto getMarca() {
        return marca;
    }

    
    
}
