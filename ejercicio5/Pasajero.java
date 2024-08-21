package seguimiento4.ejercicio5;
import java.util.ArrayList;

public class Pasajero extends Persona {
    private ArrayList<Reserva> historialReservas;

    public Pasajero(String nombre, int id, String contacto) {
        super(nombre, id, contacto);
        this.historialReservas = new ArrayList<>();
    }

    public ArrayList<Reserva> getHistorialReservas() {
        return historialReservas;
    }

    public void agregarReserva(Reserva reserva) {
        historialReservas.add(reserva);
    }
}