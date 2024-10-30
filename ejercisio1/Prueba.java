package ejercisio1;

public class Prueba  {

    private static Object ejercisio1;
    public static void main(String[] args) {
       
        ejercisio1.Cuadrado cuadrado = new ejercisio1.Cuadrado(5,"v","s");
        System.out.println("area cuadrado" + cuadrado.calcularArea());
        System.out.println("Perimetro del cuadrado" + cuadrado.calcularPerimetro());

        ejercisio1.Triangulo triangulo = new ejercisio1.Triangulo(5,4,5,4,3,"rojo","cd");
        System.out.println("Triangulo");
        System.out.println("area" + triangulo.calcularArea());
        System.out.println("perimetro" + triangulo.calcularPerimetro());
  
        
    }

   
}
