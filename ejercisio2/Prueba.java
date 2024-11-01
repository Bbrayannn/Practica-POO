package ejercisio2;

public class Prueba  {

    private static Object ejercisio1;
    public static void main(String[] args) {
       
        ejercisio2.Cuadrado cuadrado = new ejercisio2.Cuadrado(5,"v","s");
        System.out.println("area cuadrado" + cuadrado.calcularArea());
        System.out.println("Perimetro del cuadrado" + cuadrado.calcularPerimetro());

        ejercisio2.Triangulo triangulo = new ejercisio2.Triangulo(5,4,5,4,3,"rojo","cd");
        System.out.println("Triangulo");
        System.out.println("area" + triangulo.calcularArea());
        System.out.println("perimetro" + triangulo.calcularPerimetro());
  
        
    }

   
}
