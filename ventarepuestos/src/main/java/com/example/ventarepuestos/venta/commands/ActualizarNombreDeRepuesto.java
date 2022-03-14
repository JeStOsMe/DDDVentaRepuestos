package com.example.ventarepuestos.venta.commands;

import com.example.ventarepuestos.venta.values.NombreRepuesto;
import com.example.ventarepuestos.venta.values.RepuestoId;
import com.example.ventarepuestos.venta.values.VentaId;

import co.com.sofka.domain.generic.Command;

public class ActualizarNombreDeRepuesto extends Command{

    private final VentaId ventaId;
    private final RepuestoId repuestoId;
    private final NombreRepuesto nombre;

    public ActualizarNombreDeRepuesto(VentaId ventaId, RepuestoId repuestoId, NombreRepuesto nombre){
        this.ventaId = ventaId;
        this.repuestoId = repuestoId;
        this.nombre = nombre;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public RepuestoId getRepuestoId() {
        return repuestoId;
    }

    public NombreRepuesto getNombre() {
        return nombre;
    }

    
    
}
