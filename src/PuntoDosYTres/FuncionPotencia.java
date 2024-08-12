package PuntoDosYTres;

import java.util.function.Function;
import java.util.function.Predicate;

public class FuncionPotencia {
    public static void main(String[] args) {
        Function<Double, Double> value = x -> x * x;
        double total = value.apply(4.0);
        System.out.println("potencia de 8  es :"+ total);

        Predicate<Double> isPar  = x -> x % 2 == 0;
        boolean isParValue = isPar.test(total);
        System.out.println("La potencia es par : " + isParValue + "\nLa potencia es impar : "+ !isParValue);


    }
}
