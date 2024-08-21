package seguimiento4.ejercicio4;

public class Main {
    public static void main(String[] args) {
        GestorProductos gestor = new GestorProductos();

        // Crear productos
        Producto producto1 = new Producto("Laptop", "Laptop de alta gama", 1500.00, 10);
        ProductoPerecedero productoPerecedero1 = new ProductoPerecedero("Leche", "Leche fresca", 1.50, 50, "2024-09-01");

        // Agregar productos
        gestor.agregarProducto(producto1);
        gestor.agregarProducto(productoPerecedero1);

        // Mostrar productos
        System.out.println("Lista de productos:");
        gestor.mostrarProductos();

        // Modificar un producto
        gestor.modificarProducto("Laptop", 1400.00, 8);
        System.out.println("\nDespués de modificar el producto 'Laptop':");
        gestor.mostrarProductos();

        // Eliminar un producto
        gestor.eliminarProducto("Leche");
        System.out.println("\nDespués de eliminar el producto 'Leche':");
        gestor.mostrarProductos();
    }
}