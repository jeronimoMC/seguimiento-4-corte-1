package seguimiento4.ejercicio6;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado: " + libro);
    }

    public void eliminarLibro(String ISBN) {
        libros.removeIf(libro -> libro.getISBN().equals(ISBN));
        System.out.println("Libro con ISBN " + ISBN + "eliminado");
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        for(Libro libro : libros) {
            if(libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public ArrayList<Libro> buscarLibroPorAutor(String autor) {
        ArrayList<Libro> librosPorAutor = new ArrayList<>();
        for(Libro libro : libros) {
            if(libro.getAutor().equalsIgnoreCase(autor)) {
                librosPorAutor.add(libro);
            }
        }
        return librosPorAutor;
    }

    public void listarLibros() {
        if(libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca");
        } else {
            for(Libro libro : libros) {
                System.out.println(libro);
            }
        }
    }
}