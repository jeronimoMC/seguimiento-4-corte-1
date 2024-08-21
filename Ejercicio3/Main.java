package seguimiento4.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        // Crear algunos datos de ejemplo
        Tren tren1 = new Tren("123", "Ciudad A - Ciudad B");
        Vagon vagon1 = new Vagon("Clase Económica", 50);
        tren1.agregarVagon(vagon1);

        Viaje viaje1 = new Viaje("2024-08-20", "08:00", "12:00", tren1);

        Cliente cliente1 = new Cliente("Juan Pérez", "123456789", "Calle Falsa 123");

        // Buscar un asiento en el tren y reservarlo
        Asiento asientoReservado = vagon1.obtenerAsiento(1);
        if (asientoReservado != null && asientoReservado.obtenerEstado().equals("disponible")) {
            asientoReservado.reservar();
        }

        // Comprar el boleto
        Boleto boleto1 = new Boleto(cliente1, viaje1, asientoReservado);
        cliente1.agregarCompra(boleto1);

        // Mostrar detalles del boleto
        System.out.println("Boleto comprado por: " + boleto1.obtenerCliente().obtenerNombre());
        System.out.println("Viaje: " + boleto1.obtenerViaje().obtenerFecha() + " " +
                boleto1.obtenerViaje().obtenerHoraSalida() + " - " +
                boleto1.obtenerViaje().obtenerHoraLlegada());
        System.out.println("Asiento: " + boleto1.obtenerAsiento().obtenerNumero() +
                " (" + boleto1.obtenerAsiento().obtenerEstado() + ")");
    }
}