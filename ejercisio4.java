
package POO2024a;

import java.util.Scanner;
public class ejercisio4 {
    public static void main(String[] args) {
        int n1;
        int n2;
        int suma;
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un numero:");
        n1= sc.nextInt();
        System.out.print("Escribe otro numero:");
        n2= sc.nextInt();
        
        
                suma=n1+n2;

        System.out.println(n1+" "+"mas"+" "+ n2 +"es"+" "+suma);
    }

}