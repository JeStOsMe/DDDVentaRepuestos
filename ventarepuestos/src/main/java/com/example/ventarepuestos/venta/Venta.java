package com.example.ventarepuestos.venta;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

import com.example.ventarepuestos.cliente.Cliente;
import com.example.ventarepuestos.cliente.values.ClienteId;
import com.example.ventarepuestos.vendedor.Vendedor;
import com.example.ventarepuestos.vendedor.values.VendedorId;
import com.example.ventarepuestos.venta.values.CajeroId;
import com.example.ventarepuestos.venta.values.CategoriaRepuesto;
import com.example.ventarepuestos.venta.values.CelularCajero;
import com.example.ventarepuestos.venta.values.Dinero;
import com.example.ventarepuestos.venta.values.Fecha;
import com.example.ventarepuestos.venta.values.LineaRepuesto;
import com.example.ventarepuestos.venta.values.MarcaRepuesto;
import com.example.ventarepuestos.venta.values.NombreCajero;
import com.example.ventarepuestos.venta.values.NombreRepuesto;
import com.example.ventarepuestos.venta.values.RepuestoId;
import com.example.ventarepuestos.venta.values.VentaId;

import co.com.sofka.domain.generic.AggregateEvent;

public class Venta extends AggregateEvent<VentaId>{

    protected Fecha fecha;
    protected Dinero dinero;
    protected Set<Repuesto> repuestos;
    protected Cliente clienteId;
    protected Vendedor vendedorId;
    protected Cajero cajeroId;

    public Venta(VentaId entityId, Fecha fecha){
        super(entityId);
        appendChange(new VentaCreada(fecha)).apply();
    }

    public void agregarRepuesto(RepuestoId entityId, 
                                NombreRepuesto nombre, 
                                CategoriaRepuesto categoria,
                                MarcaRepuesto marca,
                                LineaRepuesto linea)
    {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(categoria);
        Objects.requireNonNull(marca);
        Objects.requireNonNull(linea);

        appendChange(new RepuestoAgregado(entityId, nombre, categoria, marca, linea)).apply();
    }

    public void asociarCliente(ClienteId clienteId){
        appendChange(new ClienteAsociado(clienteId)).apply();
    }

    public void asociarVendedor(VendedorId vendedorId){
        appendChange(new VendedorAsociado(vendedorId)).apply();
    }

    public void asociarCajero(CajeroId cajeroId){
        appendChange(new CajeroAsociado(cajeroId)).apply();
    }

    public void ActualizarNombreDeRepuesto(RepuestoId repuestoId, NombreRepuesto nombre){
        appendChange(new NombreDeRepuestoActualizado(repuestoId, nombre)).apply();
    }

    public void ActualizarCategoriaDeRepuesto(RepuestoId repuestoId, CategoriaRepuesto categoria){
        appendChange(new CategoriaDeRepuestoActualizada(repuestoId, categoria)).apply();
    }

    public void ActualizarMarcaDeRepuesto(RepuestoId repuestoId, MarcaRepuesto marca){
        appendChange(new MarcaDeRepuestoActualizada(repuestoId, marca)).apply();
    }

    public void ActualizarLineaDeRepuesto(RepuestoId repuestoId, LineaRepuesto linea){
        appendChange(new LineaDeRepuestoActualizada(repuestoId, linea)).apply();
    }

    public Optional<Repuesto> getRepuestoPorId(RepuestoId entityId){
        return repuestos().
                stream().
                filter(repuesto -> repuesto.identity().equals(entityId)).
                findFirst();
    }

    public void ActualizarNombreDeCajero(CajeroId cajeroId, NombreCajero nombreCajero){
        appendChange(new NombreDeCajeroActualizado(cajeroId, nombreCajero)).apply();
    }

    public void actualizarCelularDeCajero(CajeroId cajeroId, CelularCajero celularCajero){
        appendChange(new CelularDeCajeroActualizado(cajeroId, celularCajero)).apply();
    }

    public Fecha fecha() {
        return fecha;
    }

    public Dinero dinero() {
        return dinero;
    }

    public Set<Repuesto> repuestos() {
        return repuestos;
    }

    public Cliente clienteId() {
        return clienteId;
    }

    public Vendedor vendedorId() {
        return vendedorId;
    }

    public Cajero cajeroId() {
        return cajeroId;
    }

}
