package seguimiento4.ejercicio4;

import java.util.ArrayList;
import java.util.List;

class GestorProductos {
    private List<Producto> productos;

    public GestorProductos() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(String nombre) {
        productos.removeIf(producto -> producto.obtenerNombre().equals(nombre));
    }

    public void modificarProducto(String nombre, double nuevoPrecio, int nuevoStock) {
        for (Producto producto : productos) {
            if (producto.obtenerNombre().equals(nombre)) {
                producto.modificarPrecio(nuevoPrecio);
                producto.modificarStock(nuevoStock);
            }
        }
    }

    public Producto buscarProducto(String nombre) {
        for (Producto producto : productos) {
            if (producto.obtenerNombre().equals(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
