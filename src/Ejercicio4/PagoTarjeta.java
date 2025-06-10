package Ejercicio4;

public class PagoTarjeta extends MetodoPago {

    private String numeroTarjeta;

    public PagoTarjeta(String titular, String numeroTarjeta) {
        super(titular);
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    void procesarPago (double monto){
        System.out.println("Titular: "+ this.titular);
        System.out.println("Numero de tarjeta: "+ this.numeroTarjeta);
        System.out.println("Monto: "+ monto);
    }
}
