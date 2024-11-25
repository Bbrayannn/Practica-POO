package ejercisicioParcial2;

public class Camion extends Vehiculo {

    private double cargaMaxima;

    public Camion(String marca, double precio, int cilindraje, double cargaMaxima) {
        super(marca, precio, cilindraje);
        this.cargaMaxima = cargaMaxima;
        calcularImpuestoCirculacion();
    }

    @Override
    public void calcularImpuestoCirculacion() {
        super.calcularImpuestoCirculacion();
        if (cargaMaxima > 5000) {
            impuestoCirculacion += precio * 0.03; // Un 3% adicional si es un camión grande
        }
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

}
