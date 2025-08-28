# Tienda Virtual

Este proyecto es una aplicación de tienda virtual que permite gestionar productos y generar facturas de compra.

## Estructura del Proyecto

El proyecto tiene la siguiente estructura de archivos:

```
TiendaVirtual/
└── src/
    └── com/
        └── tienda/
            ├── productos/
            │   └── Producto.java
            ├── ventas/
            │   └── Factura.java
            └── main/
                └── App.java
```

### Descripción de Archivos

- **src/com/tienda/productos/Producto.java**: Define la clase `Producto`, que representa un producto en la tienda. Contiene propiedades como `nombre`, `precio` y `cantidad`, junto con métodos para acceder y modificar estas propiedades.

- **src/com/tienda/ventas/Factura.java**: Define la clase `Factura`, que representa una factura de compra. Incluye propiedades como `numeroFactura`, `fecha`, y una lista de productos. También tiene métodos para agregar productos a la factura y calcular el total.

- **src/com/tienda/main/App.java**: Es el punto de entrada de la aplicación. Contiene el método `main`, que inicializa la aplicación, crea instancias de `Producto` y `Factura`, y simula una compra.

## Instrucciones para Ejecutar el Proyecto en IntelliJ IDEA

1. Asegúrate de que la estructura de carpetas esté correctamente configurada.
2. Instala el SDK de Java si aún no lo has hecho.
3. Crea un nuevo proyecto en IntelliJ IDEA y selecciona la carpeta `TiendaVirtual` como raíz del proyecto.
4. Asegúrate de que el archivo `App.java` esté configurado como el archivo principal para ejecutar la aplicación.
5. Compila y ejecuta el proyecto desde IntelliJ IDEA.