package com.tienda.ventas;

import com.tienda.productos.Producto;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Factura {
    private int numeroFactura;
    private Date fecha;
    private List<Producto> productos;

    public Factura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
        this.fecha = new Date();
        this.productos = new ArrayList<>();
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio() * producto.getCantidad();
        }
        return total;
    }
}