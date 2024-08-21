package seguimiento4.ejercicio2;

public class Asiento {
    private int fila;
    private int columna;
    private String estado;

    public Asiento(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        this.estado = "Disponible";
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public String getEstado(){
        return estado;
    }

    public void reservar() {
        this.estado = "Reservado";
    }

    public void ocupar() {
        this.estado = "Ocupado";
    }
}