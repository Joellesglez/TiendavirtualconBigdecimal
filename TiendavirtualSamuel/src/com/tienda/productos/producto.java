package com.tienda.productos;

import java.math.BigDecimal;

public class producto {
    private String nombre;
    private BigDecimal precio;

    public producto(String nombre, BigDecimal precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return nombre + " - $" + precio.setScale(2, BigDecimal.ROUND_HALF_UP);
    }
}
