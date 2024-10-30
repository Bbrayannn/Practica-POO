package ejercisio1;

public class Cuadrado extends Forma {

    private double lado;

    public Cuadrado(double lado, String nombre, String color) {
        super(nombre, color);
        this.lado = lado;
    }

 
   

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

}
