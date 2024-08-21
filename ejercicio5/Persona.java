package seguimiento4.ejercicio5;

public class Persona {
    private String nombre;
    private int id;
    private String contacto;

    public Persona(String nombre, int id, String contacto){
        this.nombre = nombre;
        this.id = id;
        this.contacto = contacto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String getContacto() {
        return contacto;
    }
}