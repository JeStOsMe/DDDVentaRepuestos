package com.example.ventarepuestos.venta.values;

import co.com.sofka.domain.generic.Identity;

public class RepuestoId extends Identity{

    public RepuestoId(){

    }

    public RepuestoId(String id){
        super(id);
    }

    public static RepuestoId of(String id){
        return new RepuestoId(id);
    }
    
}
