package seguimiento4.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona{
    private List<Reserva> historialReservas;

    public Cliente(String nombre, int id, String direccion){
        super(nombre, id, direccion);
        this.historialReservas = new ArrayList<>();
    }

    public List<Reserva> getHistorialReservas() {
        return historialReservas;
    }

    public void setHistorialReservas(Reserva reserva) {
        historialReservas.add(reserva);
    }
}