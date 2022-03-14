package com.example.ventarepuestos.venta.events;

import com.example.ventarepuestos.venta.values.CategoriaRepuesto;
import com.example.ventarepuestos.venta.values.RepuestoId;

import co.com.sofka.domain.generic.DomainEvent;

public class CategoriaDeRepuestoActualizada extends DomainEvent{

    private final RepuestoId repuestoId;
    private final CategoriaRepuesto categoria;

    public CategoriaDeRepuestoActualizada(RepuestoId repuestoId, CategoriaRepuesto categoria){
        super("ventarepuestos.venta.categoriaderepuestosactualizada");
        this.repuestoId = repuestoId;
        this.categoria = categoria;
    }

    public RepuestoId repuestoId(){
        return repuestoId;
    }

    public CategoriaRepuesto categoria(){
        return categoria;
    }
    
}
