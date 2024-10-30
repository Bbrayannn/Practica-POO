package ejercisio4;

public class Coche {

    private String marca;
    String color;
    int km;
    double precio;
    private double factor_contaminacion;
    private int anio;
    String[] matricula;
    String dniTitular;


    public Coche(String marca, String color, int km) {
        this.marca = marca;
        this.color = color;
        this.km = km;
        this.precio = precio;
        this.factor_contaminacion = factor_contaminacion;
        this.anio = anio;
        this.dniTitular = dniTitular;
    }




    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getFactor_contaminacion() {
        return factor_contaminacion;
    }



    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String[] getMatricula() {
        return matricula;
    }

    public void setMatricula(String[] matricula) {
        this.matricula = matricula;
    }

    String getDniTitular() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

 
    

}
