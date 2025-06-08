import Ejercicio1.Auto;

public class Main {
    public static void main(String[] args) {
        Auto Corsa = new Auto(0);
        Corsa.acelerar(100);
        Corsa.arrancar();
        Corsa.acelerar(50);
        Corsa.acelerar(80);
        Corsa.frenar();
    }
}