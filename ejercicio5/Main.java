package seguimiento4.ejercicio5;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Avion avion = new Avion("Boeing 747", 100);
        Vuelo vuelo = new Vuelo("AB123", "Nueva York - Bogota", new Date(), "10:00", "14:00", avion);
        Pasajero pasajero = new Pasajero("Jeronimo Rodriguez", 1092455, "jero@gmail.com");

        Asiento asiento = avion.getAsientos(1);
        asiento.reservar();

        Reserva reserva = new Reserva(pasajero, vuelo, asiento);
        pasajero.agregarReserva(reserva);

        System.out.println("Reserva realizada para el pasajero: " + reserva.getPasajero().getNombre());
        System.out.println("Vuelo: " + reserva.getVuelo().getNumeroVuelo());
        System.out.println("Asiento: " + reserva.getAsiento().getNumero());
    }
}