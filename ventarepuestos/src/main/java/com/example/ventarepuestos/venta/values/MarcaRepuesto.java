package com.example.ventarepuestos.venta.values;

import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class MarcaRepuesto implements ValueObject<String>{

    private final String value;

    public MarcaRepuesto(String value){
        this.value = Objects.requireNonNull(value);

        if(this.value.isBlank()){
            throw new IllegalArgumentException("El campo de marca no puede estar vacío");
        }

        if(this.value.length() < 5){
            throw new IllegalArgumentException("La marca debe tener al menos 5 caracteres");
        }
    }

    public String value(){
        return value;
    }
    
}
