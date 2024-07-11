import java.util.ArrayList;

public class Biblioteca {

    // Atributos
    private ArrayList<Libro> libros;

    // Constructor
    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public Biblioteca(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    // Métodos
    // Agregar libro
    public void agregarLibro(Libro libro) {
        this.libros.add(libro);
    }

    // Descuentos
    public void descuento() {
        for (Libro libro : libros) {
            double precio = libro.getPrecio();
            if (precio >= 200000) {
                libro.setPrecio(precio - (precio * 0.20));
            } else if (precio >= 50000) {
                libro.setPrecio(precio - (precio * 0.10));
            }
        }
    }

    // Listar libros
    public void listarLibros() {
        System.out.println("Libros en la biblioteca:");

        for (Libro libro : libros) {
            System.out.println("Título: " + libro.getTitulo() + ", Autor: " + libro.getAutor() +
                    ", Año de Publicación: " + libro.getYearPublicacion() +
                    ", Precio: " + libro.getPrecio());

    // Buscar libro
    public Libro buscarLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }
}
