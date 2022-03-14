package com.example.ventarepuestos.venta.commands;

import com.example.ventarepuestos.venta.values.LineaRepuesto;
import com.example.ventarepuestos.venta.values.RepuestoId;
import com.example.ventarepuestos.venta.values.VentaId;

import co.com.sofka.domain.generic.Command;

public class ActualizarLineaDeRepuesto extends Command{

    private final VentaId ventaId;
    private final RepuestoId repuestoId;
    private final LineaRepuesto linea;

    public ActualizarLineaDeRepuesto(VentaId ventaId, RepuestoId repuestoId, LineaRepuesto linea){
        this.ventaId = ventaId;
        this.repuestoId = repuestoId;
        this.linea = linea;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public RepuestoId getRepuestoId() {
        return repuestoId;
    }

    public LineaRepuesto getLinea() {
        return linea;
    }

    
    
}
