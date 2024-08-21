package seguimiento4.ejercicio2;

public class Persona {
    private String nombre;
    private int id;
    private String direccion;

    public Persona(String nombre, int id, String direccion){
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String getDireccion() {
        return direccion;
    }
}