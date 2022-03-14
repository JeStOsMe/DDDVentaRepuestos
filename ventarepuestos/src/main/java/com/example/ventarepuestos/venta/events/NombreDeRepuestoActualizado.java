package com.example.ventarepuestos.venta.events;

import com.example.ventarepuestos.venta.values.NombreRepuesto;
import com.example.ventarepuestos.venta.values.RepuestoId;

import co.com.sofka.domain.generic.DomainEvent;

public class NombreDeRepuestoActualizado extends DomainEvent{

    private final RepuestoId repuestoId;
    private final NombreRepuesto nombreRepuesto;

    public NombreDeRepuestoActualizado(RepuestoId repuestoId, NombreRepuesto nombreRepuesto){
        super("ventarepuestos.venta.nombrederepuestoactualizado");
        this.repuestoId = repuestoId;
        this.nombreRepuesto = nombreRepuesto;
    }

    public RepuestoId repuestoId(){
        return repuestoId;
    }

    public NombreRepuesto nombreRepuesto(){
        return nombreRepuesto;
    }
    
}
