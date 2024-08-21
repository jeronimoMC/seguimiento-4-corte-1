package seguimiento4.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

class Tren {
    private String numero;
    private String ruta;
    private List<Vagon> listaVagones;

    public Tren(String numero, String ruta) {
        this.numero = numero;
        this.ruta = ruta;
        this.listaVagones = new ArrayList<>();
    }

    public String obtenerNumero() {
        return numero;
    }

    public String obtenerRuta() {
        return ruta;
    }

    public void agregarVagon(Vagon vagon) {
        listaVagones.add(vagon);
    }

    public Vagon obtenerVagon(String tipo) {
        for (Vagon vagon : listaVagones) {
            if (vagon.obtenerTipo().equals(tipo)) {
                return vagon;
            }
        }
        return null;
    }
}
