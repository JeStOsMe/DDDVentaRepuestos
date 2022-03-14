package com.example.ventarepuestos.venta.events;

import com.example.ventarepuestos.venta.values.LineaRepuesto;
import com.example.ventarepuestos.venta.values.RepuestoId;

import co.com.sofka.domain.generic.DomainEvent;

public class LineaDeRepuestoActualizada extends DomainEvent{

    private final RepuestoId repuestoId;
    private final LineaRepuesto linea;

    public LineaDeRepuestoActualizada(RepuestoId repuestoId, LineaRepuesto linea){
        super("ventarepuestos.venta.lineaderepuestoactualizada");
        this.repuestoId = repuestoId;
        this.linea = linea;
    }

    public RepuestoId repuestoId(){
        return repuestoId;
    }

    public LineaRepuesto linea(){
        return linea;
    }
    
}
