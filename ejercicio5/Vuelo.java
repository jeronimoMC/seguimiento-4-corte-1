package seguimiento4.ejercicio5;
import java.util.Date;

public class Vuelo {
    private String numeroVuelo;
    private String ruta;
    private Date fecha;
    private String horaSalida;
    private String horaLlegada;
    private Avion avion;

    public Vuelo (String numeroVuelo, String ruta, Date fecha, String horaSalida, String horaLlegada, Avion avion) {
        this.numeroVuelo = numeroVuelo;
        this.ruta = ruta;
        this.fecha = fecha;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.avion = avion;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public String getRuta() {
        return ruta;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public Avion getAvion() {
        return avion;
    }
}