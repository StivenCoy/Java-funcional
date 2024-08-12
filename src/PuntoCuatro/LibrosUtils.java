package PuntoCuatro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class LibrosUtils {


    public static void main(String[] args) {
        Supplier<List<Libro>> libros = () -> {
            List<Libro> listaLibros = new ArrayList<>();
            listaLibros.add(new Libro("El Quijote", "Miguel de Cervantes",8.0));
            listaLibros.add(new Libro("Cien años de soledad", "Gabriel García Márquez",9.0));
            listaLibros.add(new Libro("Donde el viento da la vuelta", "Laura Esquivel",6.0));
            listaLibros.add(new Libro("1984", "George Orwell",5.9));
            listaLibros.add(new Libro("Matar a un ruiseñor", "Harper Lee",8.8));
            return listaLibros;
        };

        Predicate<Libro> recomendado = libro -> libro.getPuntaje() >= 7.0;

        Consumer<List<Libro>> librosConsumer = consumer -> {
            UnaryOperator<Libro> unaryOperator = libro -> {
                if(recomendado.test(libro)){
                    System.out.println("El libro "+ libro.getNombre() + " es recomendado :)");
                }
                return libro;
            };
            consumer.replaceAll(unaryOperator);
        };
        List<Libro> libroList = libros.get();
         librosConsumer.accept(libroList);
    }
}
