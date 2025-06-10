package Ejercicio5;

public abstract class Entrada {

    protected String numeroEntrada;
    protected int horaAcceso;

    public Entrada(String numeroEntrada, int horaAcceso) {
        this.numeroEntrada = numeroEntrada;
        this.horaAcceso = horaAcceso;
    }

    abstract boolean validarEntrada();

    void mostrarDatos(){
        System.out.println("Numero de entrada: "+ this.numeroEntrada);
        System.out.println("Hora de acceso: "+ this.horaAcceso);
    }
}
