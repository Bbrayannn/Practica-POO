package ejercisio2;

public class Triangulo extends Forma {

    private int base;
    private int altura;
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(int base, int altura, double ladoA, double ladoB, double ladoC, String nombre, String color) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }



    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

   
  

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    @Override
    public double calcularPerimetro() {
       return ladoA + ladoB + ladoC;
    }

   

}
