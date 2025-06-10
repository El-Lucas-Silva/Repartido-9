package Ejercicio5;

public class EntradaGeneral extends Entrada{

    public EntradaGeneral(String numeroEntrada, int horaAcceso){
        super(numeroEntrada, horaAcceso);
    }

    boolean validarEntrada() {
        if (this.horaAcceso >= 10 && this.horaAcceso <= 22){
            return true;
        } else {
            return false;
        }
    }
}
