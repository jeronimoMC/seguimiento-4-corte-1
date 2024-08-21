package seguimiento4.ejercicio4;

class ProductoPerecedero extends Producto {
    private String fechaVencimiento;

    public ProductoPerecedero(String nombre, String descripcion, double precio, int stock, String fechaVencimiento) {
        super(nombre, descripcion, precio, stock);
        this.fechaVencimiento = fechaVencimiento;
    }

    public String obtenerFechaVencimiento() {
        return fechaVencimiento;
    }

    @Override
    public String toString() {
        return "ProductoPerecedero{" +
                "nombre='" + obtenerNombre() + '\'' +
                ", descripcion='" + obtenerDescripcion() + '\'' +
                ", precio=" + obtenerPrecio() +
                ", stock=" + obtenerStock() +
                ", fechaVencimiento='" + fechaVencimiento + '\'' +
                '}';
    }
}
