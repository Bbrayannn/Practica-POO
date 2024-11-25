package ejercisicioParcial2;

import Ecepciones.CuotaGarajeNegativaException;
import Ecepciones.MatriculaInvalidaException;

public abstract class Vehiculo {

    private String placa;
    String marca;
    double precio;
    private int cilindraje;
    double impuestoCirculacion;
    double cuotaMesGaraje;

    public static final double CUOTA_BASE = 100;

    public Vehiculo(String marca, double precio, int cilindraje) {
        this.marca = marca;
        this.precio = precio;
        this.cilindraje = cilindraje;
        this.placa = null;
        this.cuotaMesGaraje = CUOTA_BASE;
        calcularImpuestoCirculacion();
    }

    public void calcularImpuestoCirculacion() {
        this.impuestoCirculacion = this.precio * 0.02;
    }

    public boolean matricular(String matricula) throws MatriculaInvalidaException {
        if (matricula.length() == 6) {
            this.placa = matricula;
            return true;
        } else {
            throw new MatriculaInvalidaException("La matrícula debe tener exactamente 6 caracteres.");
        }
    }

    public void setCuotaMesGaraje(double cuotaMesGaraje) throws CuotaGarajeNegativaException {
        if (cuotaMesGaraje < 0) {
            throw new CuotaGarajeNegativaException("La cuota mensual no puede ser negativa.");
        }
        this.cuotaMesGaraje = cuotaMesGaraje;
    }

    public double getCuotaMesGaraje() {
        return cuotaMesGaraje;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public double getImpuestoCirculacion() {
        return impuestoCirculacion;
    }

    @Override
    public String toString() {
        return "Vehículo [Marca=" + marca + ", Placa=" + placa + ", Precio=" + precio + ", Cilindraje=" + cilindraje + "]";
    }

}
