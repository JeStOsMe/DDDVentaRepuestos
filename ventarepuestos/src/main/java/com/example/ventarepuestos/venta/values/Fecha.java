package com.example.ventarepuestos.venta.values;

import java.util.Date;
import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class Fecha implements ValueObject<Date>{
    private final Date value;

    public Fecha(Date value){
        this.value = Objects.requireNonNull(value);
    }

    public Date value(){
        return value;
    }
}
