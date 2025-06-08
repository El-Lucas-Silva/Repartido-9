package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        EmpleadoTiempoCompleto e1 = new EmpleadoTiempoCompleto(21000, 5);

        e1.calcularSalario();
        e1.solicitarLicencias(5);
        e1.solicitarLicencias(6);
        e1.calcularHorasExtra(10);
        e1.tomarVacaciones(15);
    }
}
