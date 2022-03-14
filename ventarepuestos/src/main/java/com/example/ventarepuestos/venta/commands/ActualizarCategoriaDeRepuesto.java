package com.example.ventarepuestos.venta.commands;

import com.example.ventarepuestos.venta.values.CategoriaRepuesto;
import com.example.ventarepuestos.venta.values.RepuestoId;
import com.example.ventarepuestos.venta.values.VentaId;

import co.com.sofka.domain.generic.Command;

public class ActualizarCategoriaDeRepuesto extends Command{
    private final VentaId ventaId;
    private final RepuestoId repuestoId;
    private final CategoriaRepuesto categoria;

    public ActualizarCategoriaDeRepuesto(VentaId ventaId, 
                                        RepuestoId repuestoId, 
                                        CategoriaRepuesto categoria)
    {
        this.ventaId = ventaId;
        this.repuestoId = repuestoId;
        this.categoria = categoria;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public RepuestoId getRepuestoId() {
        return repuestoId;
    }

    public CategoriaRepuesto getCategoria() {
        return categoria;
    }

    
}
