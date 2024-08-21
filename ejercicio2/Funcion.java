package seguimiento4.ejercicio2;

public class Funcion {
    private String pelicula;
    private String horaInicio;
    private Sala sala;
    private double precioEntrada;

    public Funcion(String pelicula, String horaInicio, Sala sala, double precioEntrada) {
        this.pelicula = pelicula;
        this.horaInicio = horaInicio;
        this.sala = sala;
        this.precioEntrada = precioEntrada;
    }

    public String getPelicula() {
        return pelicula;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public Sala getSala() {
        return sala;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }
}