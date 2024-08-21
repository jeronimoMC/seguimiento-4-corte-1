package seguimiento4.ejercicio2;

import java.util.List;

public class Reserva {
    private Cliente cliente;
    private Funcion funcion;
    private List<Asiento> listaAsientos;

    public Reserva(Cliente cliente, Funcion funcion, List<Asiento> listaAsientos){
        this.cliente = cliente;
        this.funcion = funcion;
        this.listaAsientos = listaAsientos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public List<Asiento> getListaAsientos() {
        return listaAsientos;
    }
}