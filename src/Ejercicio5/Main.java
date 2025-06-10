package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        EntradaGeneral g1 = new EntradaGeneral("75", 17);
        EntradaVIP VIP1 = new EntradaVIP("65", 27);

        System.out.println(g1.validarEntrada());
        System.out.println(VIP1.validarEntrada());
    }
}
