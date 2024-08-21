package seguimiento4.ejercicio1;

public class Main {
    public static void main(String[] args) {
        // Crear un cliente
        Cliente cliente = new Cliente("Juan Perez", "12345678", "Calle Falsa 123", "bueno", 15000);

        // Crear una solicitud de crédito personal
        SolicitudCredito solicitudPersonal = new SolicitudCredito(cliente, "personal", 5000, 12, 0.05);

        // Crear un crédito y evaluarlo
        Credito creditoPersonal = new Credito(solicitudPersonal);
        EvaluadorCredito.evaluarCredito(creditoPersonal);
        System.out.println("Estado del crédito personal: " + creditoPersonal.obtenerEstado());

        // Crear una propiedad
        Propiedad propiedad = new Propiedad("Avenida XYZ", 100000);

        // Crear una solicitud de crédito hipotecario
        SolicitudCredito solicitudHipotecaria = new SolicitudCredito(cliente, "hipotecario", 80000, 240, 0.03);

        // Crear un crédito hipotecario y evaluarlo
        CreditoHipotecario creditoHipotecario = new CreditoHipotecario(solicitudHipotecaria, propiedad);
        EvaluadorCredito.evaluarCredito(creditoHipotecario);
        System.out.println("Estado del crédito hipotecario: " + creditoHipotecario.obtenerEstado());
    }
}
