
package POO2024a;

/*crear u  programa que pide un nombre por scanner y escribe en consola +"buenas tardes, Sr XX)+"
(evidentemente,sustituyendio XX por el nombre que se escribe en la cosola)
*/
import java.util.Scanner;
public class ejercisio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("ingresa tu nombre");       
        String UserName= sc.nextLine();
        System.out.println("buenas tardes, sr"+UserName);
    }
    
}
