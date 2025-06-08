package Ejercicio3;

public class EmpleadoTiempoCompleto implements Empleado,TrabajadorExtra {

    private int salarioBase;
    private int licenciaPendiente;

    public EmpleadoTiempoCompleto(int salarioBase, int licenciaPendiente) {
        this.salarioBase = salarioBase;
        this.licenciaPendiente = licenciaPendiente;
    }

    @Override
    public void calcularSalario(){
        System.out.println("Salario: "+ this.salarioBase);
    }

    @Override
    public void solicitarLicencias(int dias){
        if ((this.licenciaPendiente + dias) <= 10) {
            System.out.println("La licencia fue aprobada.");
        } else {
            System.out.println("La licencia fue denegada");
        }
    }

    @Override
    public void calcularHorasExtra(int horas){
        System.out.println("Horas Extra: "+ ((this.salarioBase / 160) * horas * 1.5)+this.salarioBase);
    }

    public void tomarVacaciones(int vacaciones){
        System.out.println("Cantidad de días de vacaciones tomados: "+ vacaciones);
    }
}
