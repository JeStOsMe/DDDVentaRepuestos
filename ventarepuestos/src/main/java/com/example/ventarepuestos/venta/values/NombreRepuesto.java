package com.example.ventarepuestos.venta.values;

import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class NombreRepuesto implements ValueObject<String>{

    private final String value;

    public NombreRepuesto(String value){
        this.value = Objects.requireNonNull(value);

        if(this.value.isBlank()){
            throw new IllegalArgumentException("El nombre del repuesto no puede estar vacío");
        }

        if(this.value.length() < 5){
            throw new IllegalArgumentException("Solo se admiten nombres de repuestos de al menos 5 caracteres");
        }
    }

    public String value(){
        return value;
    }
    
}
