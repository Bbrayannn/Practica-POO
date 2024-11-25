
package POO2024a;

import  java.util.Scanner;

public class ScannerEjemplo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("hola,como te llamas" );
        String nombre ;
        nombre=input.nextLine();
        System.out.println("me alegra conocerte"+nombre);
        System.out.println("ahora,cuentame cuantos años tines:");
     int edad=input.nextInt();
     System.out.println("me alegro,con"+edad+"años somos combatbles");
     System.out.println("disculpame, cuanto pesas exactamente?" );
      float peso = input.nextFloat();
      System.out.println("con tu peso "+peso+"kilos, estas en forma");
              int talla=0; // darle el primer valor a una variable
   
    }
}
