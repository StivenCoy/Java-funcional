package PuntoCinco;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.BinaryOperator;

public class Operador {
    public static void main(String[] args) {
        BinaryOperator<BigDecimal> binaryOperator = (x, y) -> x.divide(y,2, RoundingMode.HALF_UP) ;
        BigDecimal resultado = binaryOperator.apply(new BigDecimal(8),new BigDecimal(9));
        System.out.println("El resultado es "+ resultado);
    }
}
