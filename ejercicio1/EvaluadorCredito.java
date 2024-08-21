package seguimiento4.ejercicio1;

public class EvaluadorCredito {

    public static void evaluarCredito(Credito credito) {
        SolicitudCredito solicitud = credito.obtenerSolicitudCredito();

        // Simple lógica para aprobar o rechazar un crédito basado en los ingresos y el historial crediticio.
        if (solicitud.obtenerTipoCredito().equals("personal")) {
            if (solicitud.obtenerCliente().obtenerIngresos() > 10000 && solicitud.obtenerCliente().obtenerHistorialCrediticio().equals("bueno")) {
                credito.aprobar();
            } else {
                credito.rechazar();
            }
        } else if (solicitud.obtenerTipoCredito().equals("hipotecario")) {
            CreditoHipotecario creditoHipotecario = (CreditoHipotecario) credito;
            if (solicitud.obtenerCliente().obtenerIngresos() > 20000 && creditoHipotecario.obtenerPropiedad().obtenerValor() > solicitud.obtenerMonto()) {
                credito.aprobar();
            } else {
                credito.rechazar();
            }
        }
    }
}
