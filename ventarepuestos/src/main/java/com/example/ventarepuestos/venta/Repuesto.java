package com.example.ventarepuestos.venta;

import com.example.ventarepuestos.venta.values.CategoriaRepuesto;
import com.example.ventarepuestos.venta.values.LineaRepuesto;
import com.example.ventarepuestos.venta.values.MarcaRepuesto;
import com.example.ventarepuestos.venta.values.NombreRepuesto;
import com.example.ventarepuestos.venta.values.RepuestoId;

import co.com.sofka.domain.generic.Entity;

public class Repuesto extends Entity<RepuestoId>{

    private final RepuestoId repuestoId;
    private final NombreRepuesto nombre;
    private final CategoriaRepuesto categoria;
    private final MarcaRepuesto marca;
    private final LineaRepuesto linea;

    public Repuesto(RepuestoId entityId, 
                    NombreRepuesto nombre, 
                    CategoriaRepuesto categoria,
                    MarcaRepuesto marca,
                    LineaRepuesto linea)
    {
        super(entityId);
        this.repuestoId = entityId;
        this.nombre = nombre;
        this.categoria = categoria;
        this.marca = marca;
        this.linea = linea;
    }

    public RepuestoId repuestoId(){
        return repuestoId;
    }

    public NombreRepuesto nombre(){
        return nombre;
    }

    public CategoriaRepuesto categoria(){
        return categoria;
    }

    public MarcaRepuesto marca(){
        return marca;
    }

    public LineaRepuesto linea(){
        return linea;
    }
    
}
