package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        PagoBilletera b1 = new PagoBilletera("Lucas", "lucasdavid4@gmail.com");
        PagoTarjeta t1 = new PagoTarjeta("Samuel", "7823");

        b1.procesarPago(89);
        System.out.println("--------------------");
        t1.procesarPago(56);
    }
}
