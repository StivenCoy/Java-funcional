package PuntoSiete;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class OperadorFecha {

    public static void printDate(LocalDate date){
        System.out.printf("La fecha es %d de %d del %d.%n",
                date.getDayOfMonth(), date.getMonthValue(), date.getYear());
    }
    static <T> List<T> getDate(T... elements){
        return Arrays.asList(elements);
    }

    public static void main(String[] args) {
        List<LocalDate> dates = getDate(LocalDate.now().minusDays(10),LocalDate.now(),
                LocalDate.now().minusMonths(6), LocalDate.now().minusYears(1));
        dates.forEach(OperadorFecha::printDate);
    }
}
