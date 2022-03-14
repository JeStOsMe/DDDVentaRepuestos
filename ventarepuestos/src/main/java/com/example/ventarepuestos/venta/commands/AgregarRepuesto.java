package com.example.ventarepuestos.venta.commands;

import com.example.ventarepuestos.venta.values.CategoriaRepuesto;
import com.example.ventarepuestos.venta.values.LineaRepuesto;
import com.example.ventarepuestos.venta.values.MarcaRepuesto;
import com.example.ventarepuestos.venta.values.NombreRepuesto;
import com.example.ventarepuestos.venta.values.RepuestoId;
import com.example.ventarepuestos.venta.values.VentaId;

import co.com.sofka.domain.generic.Command;

public class AgregarRepuesto extends Command{

    private final VentaId ventaId;
    private final RepuestoId repuestoId;
    private final NombreRepuesto nombre;
    private final CategoriaRepuesto categoria;
    private final MarcaRepuesto marca;
    private final LineaRepuesto linea;

    public AgregarRepuesto(VentaId ventaId,
                            RepuestoId entityId, 
                            NombreRepuesto nombre, 
                            CategoriaRepuesto categoria,
                            MarcaRepuesto marca,
                            LineaRepuesto linea)
    {
        this.ventaId = ventaId;
        this.repuestoId = entityId;
        this.nombre = nombre;
        this.categoria = categoria;
        this.marca = marca;
        this.linea = linea;
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

    public CategoriaRepuesto getCategoria() {
        return categoria;
    }

    public MarcaRepuesto getMarca() {
        return marca;
    }

    public LineaRepuesto getLinea() {
        return linea;
    }

    
    
}
