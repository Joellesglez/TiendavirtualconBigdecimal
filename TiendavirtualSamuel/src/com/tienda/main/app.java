package com.tienda.main;

import com.tienda.productos.producto;
import com.tiendaventas.Facturas;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class app {
    public static void main(String[] args) {
        producto p1 = new producto("Camisa", new BigDecimal("25.50"));
        producto p2 = new producto("Pantalón", new BigDecimal("40.00"));
        producto p3 = new producto("Zapatos", new BigDecimal("60.75"));

        List<producto> productos = Arrays.asList(p1, p2, p3);

        Facturas factura = new Facturas(productos);
        factura.imprimirFactura();
    }
}

