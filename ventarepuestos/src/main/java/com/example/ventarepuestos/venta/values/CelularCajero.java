package com.example.ventarepuestos.venta.values;

import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class CelularCajero implements ValueObject<String>{

    private final String value;

    public CelularCajero(String value){
        this.value = Objects.requireNonNull(value);

        if(this.value.isBlank()){
            throw new IllegalArgumentException("El campo de celular no puede estar vacío");
        }

        if(this.value.length() < 10){
            throw new IllegalArgumentException("La cantidad de dígitos debe ser mínimo de 10");
        }
    }

    public String value(){
        return value;
    }
    
}
