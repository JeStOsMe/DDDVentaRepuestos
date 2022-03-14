package com.example.ventarepuestos.venta.values;

import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class CategoriaRepuesto implements ValueObject<String>{

    private final String value;

    public CategoriaRepuesto(String value){
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("La categoría no puede estar vacía");
        }

        if(this.value.length() <= 5){
            throw new IllegalArgumentException("La categoría debe contener mínimo 5 caracteres");
        }
    }
    
    public String value(){
        return value;
    }
    
}
