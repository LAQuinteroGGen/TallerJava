//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        // Añadir libros a la biblioteca
        biblioteca.agregarLibro(new Libro("Libro 1", "Autor 1", 2020, 60000));
        biblioteca.agregarLibro(new Libro("Libro 2", "Autor 2", 2018, 250000));
        biblioteca.agregarLibro(new Libro("Libro 3", "Autor 3", 2021, 30000));

        // Aplicar descuentos
        biblioteca.aplicarDescuentos();

        // Listar libros
        biblioteca.listarLibros();

        // Buscar libros
        Libro libroEncontrado = biblioteca.buscarLibroPorTitulo("Libro 2");
        if (libroEncontrado != null) {
            System.out.println("Libro encontrado: " + libroEncontrado.getTitulo());
        } else {
            System.out.println("Libro no encontrado.");
        }
    }
}