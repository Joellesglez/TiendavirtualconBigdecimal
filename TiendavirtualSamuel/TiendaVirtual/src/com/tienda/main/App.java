public class App {
    public static void main(String[] args) {
        // Crear instancias de Producto
        Producto producto1 = new Producto("Laptop", 1200.00, 5);
        Producto producto2 = new Producto("Smartphone", 800.00, 10);

        // Crear una factura
        Factura factura = new Factura(1, "2023-10-01");
        
        // Agregar productos a la factura
        factura.agregarProducto(producto1);
        factura.agregarProducto(producto2);

        // Mostrar el total de la factura
        System.out.println("Total de la factura: " + factura.calcularTotal());
    }
}