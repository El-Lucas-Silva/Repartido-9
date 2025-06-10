package Ejercicio4;

public class PagoBilletera extends MetodoPago {

    private String email;

    public PagoBilletera(String titular, String email) {
        super(titular);
        this.email = email;
    }

    @Override
    void procesarPago(double monto){
        System.out.println("Titular: "+ this.titular);
        System.out.println("Email: "+ this.email);
        System.out.println("Monto: "+ monto);
    }
}
