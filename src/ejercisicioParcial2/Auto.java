package ejercisicioParcial2;

public class Auto extends Vehiculo {

    private boolean tieneRadio;
    private boolean tieneNavegador;

    public Auto(String marca, double precio, int cilindraje, boolean tieneRadio, boolean tieneNavegador) {
        super(marca, precio, cilindraje);
        this.tieneRadio = tieneRadio;
        this.tieneNavegador = tieneNavegador;
        calcularImpuestoCirculacion();
    }

    @Override
    public void calcularImpuestoCirculacion() {
        super.calcularImpuestoCirculacion();
        if (tieneRadio) {
            impuestoCirculacion += precio * 0.01;
        }
        if (tieneNavegador) {
            impuestoCirculacion += precio * 0.02;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " (Auto) - Radio: " + tieneRadio + ", Navegador: " + tieneNavegador;

    }

}
