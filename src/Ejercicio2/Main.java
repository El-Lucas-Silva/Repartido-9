package Ejercicio2;

public class Main {
    public static void main(String[] args) {
    Figura f1 [] = new Figura [2];

    f1[0] = new Circulo(15);
    f1[1] = new Rectangulo(7,4);

    for (int i = 0 ; i < f1.length ; i++) {
        System.out.println(f1[i].calcularArea());
    }
    }
}
