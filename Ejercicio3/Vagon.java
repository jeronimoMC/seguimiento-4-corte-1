package seguimiento4.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

class Vagon {
    private String tipo;
    private int capacidad;
    private List<Asiento> listaAsientos;

    public Vagon(String tipo, int capacidad) {
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.listaAsientos = new ArrayList<>();
        for (int i = 1; i <= capacidad; i++) {
            listaAsientos.add(new Asiento(i, "disponible"));
        }
    }

    public String obtenerTipo() {
        return tipo;
    }

    public int obtenerCapacidad() {
        return capacidad;
    }

    public Asiento obtenerAsiento(int numero) {
        for (Asiento asiento : listaAsientos) {
            if (asiento.obtenerNumero() == numero) {
                return asiento;
            }
        }
        return null;
    }
}