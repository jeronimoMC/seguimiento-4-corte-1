package seguimiento4.ejercicio2;

public class Sala {
    private int numeroSala;
    private int capacidadSala;
    private Asiento[][] listaAsientos;

    public Sala(int numeroSala, int capacidadSala) {
        this.numeroSala = numeroSala;
        this.capacidadSala = capacidadSala;
        this.listaAsientos = new Asiento[capacidadSala][capacidadSala];
        inicializarAsientos();
    }

    private void inicializarAsientos() {
        for(int i = 0; i < capacidadSala; i++){
            for (int j = 0; j < capacidadSala; j++){
                listaAsientos[i][j] = new Asiento(i, j);
            }
        }
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public int getCapacidadSala() {
        return capacidadSala;
    }

    public Asiento getAsiento(int fila, int columna) {
        return listaAsientos[fila][columna];
    }
}