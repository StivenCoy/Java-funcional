package PuntoSeis;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ValidarEdad {

    @FunctionalInterface
    interface Quinfuction<T, U, V, W, X, R> {
        R apply(T t, U u, V v, W w, X x);
    }

    public static void main(String[] args) {
        Function<Integer,String> agregarCeros = x -> x < 10 ? "0"+x  : String.valueOf(x);

        Function<Boolean,String> agregarTextoEdad = x -> x ? " corresponde a la edad ingresada" : " no corresponde a la edad ingresada";

        BiFunction<Integer, Integer,Boolean> validarEdades = (edad, edadCalculada)-> edad.equals(edadCalculada);

        Quinfuction<String, Integer,Integer,Integer,Integer,String> validarEdad =
                (nombre,edad,dia,mes,año) ->
            "La fecha de nacimiento de "+ nombre +
                    agregarTextoEdad.apply(validarEdades.apply(edad, Period.between(LocalDate.parse(año + "-" + agregarCeros.apply(mes) + "-"
                            +agregarCeros.apply(dia)),LocalDate.now()).getYears()));
        System.out.println(validarEdad.apply("carlos",26,3,5,1998));

    }
}
