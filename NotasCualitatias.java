/* se pide una calificasion entre 0 y 5 y el programa debe devolver:
mensaje de error: si la nota no esta en el rangol requerido 
*/
package POO2024a;
import java.util.Scanner;


public class NotasCualitatias {
    public static void main(String[] args) {
        float nota;
        Scanner sc= new Scanner(System.in);
        System.out.print("ingrese su nota ");
        nota = sc.nextFloat();
        if (nota<0){
            System.out.println("error no procesa notas negativas");
        }
        //else if ((nota>0)&&(nota<3)){
        else if (nota<=4)
            System.out.println("nota insuficiente");
        else if (nota<=5)
            System.out.println("nota superior");
        //else if (nota>5)
        else 
            System.out.println("error nota mayor a 5");
        
            
        }

    }
    

