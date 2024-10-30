package ejercisio7;

import java.util.Scanner;

public class prueba {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empleado[] empleados = new Empleado[4];
        for (int i = 0; i < Empleado.length; i++) {
            System.out.println("ingrese el nombre del empleado"+(i+1));
            String nombre = scanner.nextLine();
            System.out.println("ingrese el nombre del empleado"+(i+1));
            String telefono = scanner.nextLine();
           empleados[i] = new Empleado (nombre,telefono); 

            System.out.println("Numero total de empleados" + Empleado.getNumeroEmpleados());
            System.out.println("\nDatos de los empleados:");
            for (Empleado emp : empleados) {
                System.out.println("Nombre: " + emp.getNombre() + ", ID: " + emp.getNombre());
            }
        }
    }
}
