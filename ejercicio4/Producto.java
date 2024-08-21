package seguimiento4.ejercicio4;

class Producto {
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;

    public Producto(String nombre, String descripcion, double precio, int stock) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerDescripcion() {
        return descripcion;
    }

    public double obtenerPrecio() {
        return precio;
    }

    public int obtenerStock() {
        return stock;
    }

    public void modificarStock(int nuevoStock) {
        this.stock = nuevoStock;
    }

    public void modificarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}
