package seguimiento4.ejercicio5;

public class Reserva {
    private Pasajero pasajero;
    private Vuelo vuelo;
    private Asiento asiento;

    public Reserva(Pasajero pasajero, Vuelo vuelo, Asiento asiento) {
        this.pasajero = pasajero;
        this.vuelo = vuelo;
        this.asiento = asiento;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public Asiento getAsiento() {
        return asiento;
    }
}