
package POO2024a;

import java.util.Scanner;
public class ejersicio5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Escribe tu nombre:");
        String nombre = sc.nextLine();
        System.out.print("Escribe tu edad:");
        int a= sc.nextInt();
        
        System.out.println("Me llamo"+nombre+"y tengo"+a+"años");
    }
    
}
