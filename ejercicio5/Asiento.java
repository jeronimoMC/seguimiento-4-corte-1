package seguimiento4.ejercicio5;

public class Asiento {
    private int numero;
    private String clase;
    private String estado;

    public Asiento(int numero, String clase, String estado) {
        this.numero = numero;
        this.clase = clase;
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public String getClase() {
        return clase;
    }

    public String getEstado() {
        return estado;
    }

    public void reservar(){
        if(estado.equals("Disponible")) {
            estado = "Reservado";
        }
    }

    public void ocupar(){
        if(estado.equals("Reservado")){
            estado = "Ocupado";
        }
    }
}