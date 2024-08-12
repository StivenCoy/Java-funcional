package PuntoOcho;

public class Calculadora {
    private double total;

    public Calculadora(double total) {
        this.total = total;
        System.out.println("Valor con el que se desea iniciar la operacion es: " + total);
    }
    private Calculadora sumar(double valor){
        total += valor;
        System.out.println("El resultado de la suma es : " + total);
        return this;
    }
    private Calculadora restar(double valor){
        total -= valor;
        System.out.println("El resultado de la resta es : " + total);
        return this;
    }
    private Calculadora multiplicar(double valor){
        total *= valor;
        System.out.println("El resultado de la multiplicacion es : " + total);
        return this;
    }
    private Calculadora dividir(double valor){
        total /= valor;
        System.out.println("El resultado de la division es : " + total);
        return this;
    }

    public double getTotal() {
        return total;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(7);
        calculadora.sumar(20)
                .restar(2.5)
                .multiplicar(4.7)
                .dividir(2);
        System.out.println("Resultado de la operacion es: " + calculadora.getTotal());
    }
}
