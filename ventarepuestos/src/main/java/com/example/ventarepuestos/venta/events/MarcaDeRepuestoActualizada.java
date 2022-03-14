package com.example.ventarepuestos.venta.events;

import com.example.ventarepuestos.venta.values.MarcaRepuesto;
import com.example.ventarepuestos.venta.values.RepuestoId;

import co.com.sofka.domain.generic.DomainEvent;

public class MarcaDeRepuestoActualizada extends DomainEvent{

    private final RepuestoId repuestoId;
    private final MarcaRepuesto marca;

    public MarcaDeRepuestoActualizada(RepuestoId repuestoId, MarcaRepuesto marca){
        super("ventarepuestos.venta.marcaderepuestoactualizada");
        this.repuestoId = repuestoId;
        this.marca = marca;
    }

    public RepuestoId repuestoId(){
        return repuestoId;
    }

    public MarcaRepuesto marca(){
        return marca;
    }
    
}
