package com.example.ventarepuestos.venta.values;

import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class Dinero implements ValueObject<String>{

    private final String value;

    public Dinero(String value){
        this.value = Objects.requireNonNull(value);

        if (this.value.isBlank()){
            throw new IllegalArgumentException("El valor del dinero no puede estar vacío");
        }

        if (Double.parseDouble(this.value) < 0){
            throw new IllegalArgumentException("El valor no puede ser negativo");
        }
    }

    public String value(){
        return value;
    }
    
}
