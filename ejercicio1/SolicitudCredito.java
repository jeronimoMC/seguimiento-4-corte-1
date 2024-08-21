package seguimiento4.ejercicio1;

public class SolicitudCredito {
    private Cliente cliente;
    private String tipoCredito; // "personal" o "hipotecario"
    private double monto;
    private int plazo; // en meses
    private double tasaInteres;

    public SolicitudCredito(Cliente cliente, String tipoCredito, double monto, int plazo, double tasaInteres) {
        this.cliente = cliente;
        this.tipoCredito = tipoCredito;
        this.monto = monto;
        this.plazo = plazo;
        this.tasaInteres = tasaInteres;
    }

    public Cliente obtenerCliente() {
        return cliente;
    }

    public String obtenerTipoCredito() {
        return tipoCredito;
    }

    public double obtenerMonto() {
        return monto;
    }

    public int obtenerPlazo() {
        return plazo;
    }

    public double obtenerTasaInteres() {
        return tasaInteres;
    }
}
