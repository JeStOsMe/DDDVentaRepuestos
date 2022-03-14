package com.example.ventarepuestos.venta.values;

import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class LineaRepuesto implements ValueObject<String>{

    private final String value;

    public LineaRepuesto(String value){
        this.value = Objects.requireNonNull(value);

        if(this.value.isBlank()){
            throw new IllegalArgumentException("El campo línea no puede estar vacío");
        }

        if(this.value.length() < 5){
            throw new IllegalArgumentException("La línea del repuesto no puede ser menor de 5 caracteres");
        }
    }

    public String value(){
        return value;
    }
    
}
