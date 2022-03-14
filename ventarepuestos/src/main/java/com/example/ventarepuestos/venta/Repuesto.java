package com.example.ventarepuestos.venta;

import java.util.Objects;

import com.example.ventarepuestos.venta.values.CategoriaRepuesto;
import com.example.ventarepuestos.venta.values.LineaRepuesto;
import com.example.ventarepuestos.venta.values.MarcaRepuesto;
import com.example.ventarepuestos.venta.values.NombreRepuesto;
import com.example.ventarepuestos.venta.values.RepuestoId;

import co.com.sofka.domain.generic.Entity;

public class Repuesto extends Entity<RepuestoId>{

    private RepuestoId repuestoId;
    private NombreRepuesto nombre;
    private CategoriaRepuesto categoria;
    private MarcaRepuesto marca;
    private LineaRepuesto linea;

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

    public void ActualizarNombreRepuesto(NombreRepuesto nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    public void ActualizarCategoria(CategoriaRepuesto categoria){
        this.categoria = Objects.requireNonNull(categoria);
    }

    public void ActualizarMarca(MarcaRepuesto marca){
        this.marca = Objects.requireNonNull(marca);
    }

    public void ActualizarLinea(LineaRepuesto linea){
        this.linea = Objects.requireNonNull(linea);
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
