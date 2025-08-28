package com.tiendaventas;

import com.tienda.productos.producto;
import java.math.BigDecimal;
import java.util.List;

public class Facturas {
    private List<producto> productos;

    public Facturas(List<producto> productos) {
        this.productos = productos;
    }

    public BigDecimal calcularTotal() {
        BigDecimal total = BigDecimal.ZERO;
        for (producto producto : productos) {
            total = total.add(producto.getPrecio());
        }
        return total;
    }

    public void imprimirFactura() {
        System.out.println("===== FACTURA =====");
        for (producto producto : productos) {
            System.out.println("- " + producto);
        }
        System.out.println("Total a pagar: $" + calcularTotal().setScale(2, BigDecimal.ROUND_HALF_UP));
        System.out.println("¡Gracias por comprar en TiendaVirtual! 🛍️");
    }
}
