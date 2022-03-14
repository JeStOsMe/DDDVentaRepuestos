package com.example.ventarepuestos.venta;

import java.util.HashSet;
import java.util.Objects;

import com.example.ventarepuestos.venta.events.CajeroAsociado;
import com.example.ventarepuestos.venta.events.CategoriaDeRepuestoActualizada;
import com.example.ventarepuestos.venta.events.CelularDeCajeroActualizado;
import com.example.ventarepuestos.venta.events.ClienteAsociado;
import com.example.ventarepuestos.venta.events.FechaDeVentaCambiada;
import com.example.ventarepuestos.venta.events.LineaDeRepuestoActualizada;
import com.example.ventarepuestos.venta.events.MarcaDeRepuestoActualizada;
import com.example.ventarepuestos.venta.events.NombreDeCajeroActualizado;
import com.example.ventarepuestos.venta.events.NombreDeRepuestoActualizado;
import com.example.ventarepuestos.venta.events.RepuestoAgregado;
import com.example.ventarepuestos.venta.events.ValorDeVentaCambiado;
import com.example.ventarepuestos.venta.events.VendedorAsociado;
import com.example.ventarepuestos.venta.events.VentaCreada;

import co.com.sofka.domain.generic.EventChange;

public class VentaChange extends EventChange{

    public VentaChange(Venta venta){
        
        apply((VentaCreada event) -> {
            venta.fecha = event.fecha();
            venta.repuestos = new HashSet<>();
        });

        apply((ClienteAsociado event) -> {
            venta.clienteId = event.clienteId();
        });

        apply((VendedorAsociado event) -> {
            venta.vendedorId = event.vendedorId();
        });

        apply((CajeroAsociado event) -> {
            venta.cajeroId = event.cajeroId();
        });

        apply((CategoriaDeRepuestoActualizada event) -> {
            var repuesto = venta.getRepuestoPorId(event.repuestoId()).orElseThrow();
            repuesto.ActualizarCategoria(event.categoria());
        });

        apply((CelularDeCajeroActualizado event) -> {
            venta.ActualizarCelularDeCajero(event.cajeroId(), event.celular());
        });

        apply((FechaDeVentaCambiada event) -> {
            venta.cambiarFechaDeVenta(event.fecha());
        });

        apply((LineaDeRepuestoActualizada event) -> {
            venta.ActualizarLineaDeRepuesto(event.repuestoId(), event.linea());
        });

        apply((MarcaDeRepuestoActualizada event) -> {
            venta.ActualizarMarcaDeRepuesto(event.repuestoId(), event.marca());
        });

        apply((NombreDeCajeroActualizado event) -> {
            venta.ActualizarNombreDeCajero(event.cajeroId(), event.nombreCajero());
        });

        apply((NombreDeRepuestoActualizado event) -> {
            venta.ActualizarNombreDeRepuesto(event.repuestoId(), event.nombreRepuesto());
        });

        apply((RepuestoAgregado event) -> {
            
            venta.repuestos.add(new Repuesto(
                event.repuestoId(),
                event.nombre(),
                event.categoria(), 
                event.marca(),
                event.linea()));
        });

        apply((ValorDeVentaCambiado event) -> {
            venta.cambiarValorDeVenta(event.dinero());
        });


    }
    
}
