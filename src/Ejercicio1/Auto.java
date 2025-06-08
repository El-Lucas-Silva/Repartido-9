package Ejercicio1;

public class Auto implements Vehiculo {

    private int velocidadActual;
    private boolean encendido;

    public Auto (int velocidadActual){
        this.velocidadActual = velocidadActual;
    }

    public boolean getEncendido(){
        return encendido;
    }

    public void setEncendido(boolean encendido){
    this.encendido = encendido;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    @Override
    public void arrancar(){
        if (getEncendido()) {
            System.out.println("El vehiculo ya se encuentra encendido");
        } else {
            setEncendido(true);
            System.out.println("El vehiculo arranco");
        }
    }

    @Override
    public void acelerar(int velocidad){
        if (getEncendido() == false){
            System.out.println("El vehiculo esta apagado, debes arrancar.");
        } else {
            setVelocidadActual(getVelocidadActual() + velocidad);
            System.out.println("El auto ha acelerado | Velocidad Actual: "+ getVelocidadActual() +"KMs");
        }
    }

    @Override
    public void frenar() {
        if (getVelocidadActual() == 0) {
            System.out.println("El auto no esta en movimiento, no hay necesidad de frenar.");
        } else {
            setVelocidadActual(0);
            System.out.println("El auto se ha frenado | Velocidad Actual: " + getVelocidadActual() + "KMs");
        }
    }
}
