package Ejercicio4;

public abstract class MetodoPago {

    protected String titular;

    public MetodoPago(String titular) {
        this.titular = titular;
    }

    abstract void procesarPago(double monto);
}
