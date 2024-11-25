package ejercisicioParcial2;

public class Moto extends Vehiculo {

    private boolean tieneSidecar;

    public Moto(String marca, double precio, int cilindraje, boolean tieneSidecar) {
        super(marca, precio, cilindraje);
        this.tieneSidecar = tieneSidecar;
        calcularImpuestoCirculacion();
    }

    @Override
    public void calcularImpuestoCirculacion() {
        super.calcularImpuestoCirculacion();
        if (tieneSidecar) {
            impuestoCirculacion += precio * 0.1;
            cuotaMesGaraje += cuotaMesGaraje * 0.5;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " (Moto) - Sidecar: " + tieneSidecar;

    }
    //pppp

}
