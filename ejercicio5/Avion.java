package seguimiento4.ejercicio5;
import java.util.ArrayList;

public class Avion {
    private String modelo;
    private int capacidad;
    private ArrayList<Asiento> listaAsientos;

    public Avion(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.listaAsientos = new ArrayList<>();
        for(int i = 1; i <= capacidad; i++){
            listaAsientos.add(new Asiento(i, "Economica", "Disponible"));
        }
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public Asiento getAsientos(int numero) {
        return listaAsientos.get(numero - 1);
    }
}