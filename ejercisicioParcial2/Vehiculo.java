package ejercisicioParcial2;

public abstract class Vehiculo {

    String placa;
    String marca;
    double precio;
    int cilindraje;
    double impuestoCirculacion;
    double cuotaMesGaraje ;

    public Vehiculo(String marca, double precio, int cilindraje) {
        this.marca = marca;
        this.precio = precio;
        this.cilindraje = cilindraje;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double getImpuestoCirculacion() {
        return impuestoCirculacion;
    }

    public void setImpuestoCirculacion(double impuestoCirculacion) {
        this.impuestoCirculacion = impuestoCirculacion;
    }

    public double getCuotaMesGaraje() {
        return cuotaMesGaraje;
    }

    public  void setCuotaMesGaraje(double cuotaMesGaraje) {
        this.cuotaMesGaraje = cuotaMesGaraje;
        if (cuotaMesGaraje < 0) {
            System.out.println("la cuota no puede ser negativa");
        } else {

        }
    }

    public  abstract void calcularimpuestoCirculacion(); {
    this.impuestoCirculacion=0.02*this.precio;
        
    }

    private boolean matricular(String matricula) {
        if (matricula != null && matricula.length() == 6) {
            this.placa= matricula;
            return true;
        }
        return true;
    }
    public abstract void  VehiculoGaraje();{
    double cuotaMesGaraje1= this.cuotaMesGaraje;
}
        
    

}
