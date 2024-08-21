package seguimiento4.ejercicio6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        while ( true ) {
            System.out.println("\nMenú de Biblioteca:");
            System.out.println("1. Agregar libro");
            System.out.println("2. Eliminar libro");
            System.out.println("3. Buscar libro por título");
            System.out.println("4. Buscar libro por autor");
            System.out.println("5. Listar libros");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Titulo: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("ISBN: ");
                    String ISBN = scanner.nextLine();
                    System.out.print("Año de Publicación: ");
                    int añoPublicacion = scanner.nextInt();

                    Libro libro = new Libro(titulo, autor, ISBN, añoPublicacion);
                    biblioteca.agregarLibro(libro);
                    break;

                case 2:
                    System.out.print("Introduce el ISBN del libro a eliminar: ");
                    String isbnEliminar = scanner.nextLine();
                    biblioteca.eliminarLibro(isbnEliminar);
                    break;

                case 3:
                    System.out.print("Introduce el título del libro a buscar: ");
                    String tituloBuscar = scanner.nextLine();
                    Libro libroBuscado = biblioteca.buscarLibroPorTitulo(tituloBuscar);
                    if (libroBuscado != null) {
                        System.out.println("Libro encontrado: " + libroBuscado);
                    } else {
                        System.out.println("Libro no encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Introduce el autor a buscar: ");
                    String autorBuscar = scanner.nextLine();
                    ArrayList<Libro> librosPorAutor = biblioteca.buscarLibroPorAutor(autorBuscar);
                    if (!librosPorAutor.isEmpty()) {
                        System.out.println("Libros encontrados:");
                        for (Libro l : librosPorAutor) {
                            System.out.println(l);
                        }
                    } else {
                        System.out.println("No se encontraron libros de ese autor.");
                    }
                    break;

                case 5:
                    biblioteca.listarLibros();
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}