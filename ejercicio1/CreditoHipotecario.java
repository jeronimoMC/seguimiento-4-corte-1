package seguimiento4.ejercicio1;

public class CreditoHipotecario extends Credito {
    private Propiedad propiedad;

    public CreditoHipotecario(SolicitudCredito solicitudCredito, Propiedad propiedad) {
        super(solicitudCredito);
        this.propiedad = propiedad;
    }

    public Propiedad obtenerPropiedad() {
        return propiedad;
    }
}