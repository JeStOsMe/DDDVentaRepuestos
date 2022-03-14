package com.example.ventarepuestos.venta.values;

import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class NombreCajero implements ValueObject<String>{

    private final String value;

    public NombreCajero(String value){
        this.value = Objects.requireNonNull(value);

        if (this.value.isBlank()){
            throw new IllegalArgumentException("El nombre del cajero no puede estar vacío");
        }

        if(this.value.length() < 4){
            throw new IllegalArgumentException("Ingrese un nombre válido");
        }
    }

    public String value(){
        return value;
    }
    
}
