package seguimiento4.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Prueba____________________");
        Cliente persona = new Cliente("Jeronimo Rodriguez", 1092455987, "Calle 42 #25-35");
        System.out.println(persona.getNombre() + " ID: " + persona.getId() + " Direccion: " + persona.getDireccion());

        Sala sala3 = new Sala(3, 50);

        Funcion pelicula1 = new Funcion("Coraline", "8 pm", sala3, 12000);
        System.out.println("Estreno: " + pelicula1.getPelicula() + " Sala " + pelicula1.getSala().getNumeroSala() + " a las " + pelicula1.getHoraInicio() + " con un valor por boleta de " + pelicula1.getPrecioEntrada() + "$");
        System.out.println("Prueba____________________");

        Sala sala1 = new Sala(1, 10);
        Funcion funcion1 = new Funcion("Transformers", "6 pm", sala1, 10000);

        Cliente cliente = new Cliente("Jeronimo Rodriguez", 1092455987, "Calle 42 #25-35");
        Asiento asiento1 = sala1.getAsiento(1, 1);
        asiento1.reservar();

        List<Asiento> asientosReservados = new ArrayList<>();
        asientosReservados.add(asiento1);

        Reserva reserva = new Reserva(cliente, funcion1, asientosReservados);
        cliente.setHistorialReservas(reserva);

        System.out.println("Cliente: " + reserva.getCliente().getNombre());
        System.out.println("Pelicula: " + reserva.getFuncion().getPelicula());
        System.out.println("Asiento Reservado: Fila " + asiento1.getFila() + " Columna " + asiento1.getColumna());
    }
}