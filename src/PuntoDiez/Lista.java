package PuntoDiez;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lista {
    public static void main(String[] args) {
        List<Optional<String>> listaNombres = Arrays.asList(
                Optional.of("Estiben"),
                Optional.empty(),
                Optional.of("Carlos"),
                Optional.empty(),
                Optional.of("Jhon"),
                Optional.empty(),
                Optional.of("Sara"),
                Optional.empty(),
                Optional.of("Julio")
        );
        listaNombres.stream()
                .filter(Optional::isPresent)
                .map(Optional::get)
                .forEach(System.out::println);
    }

}
