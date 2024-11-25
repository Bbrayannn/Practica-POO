package Garajes;


import java.util.ArrayList;
import java.util.Scanner;

public class GestionRedGarajes {

    private static ArrayList<Garaje> redGarajes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("12--- Menú de Gestión de la Red de Garajes ---");
            System.out.println("1. Crear Garaje");
            System.out.println("2. Agregar Vehículo");
            System.out.println("3. Retirar Vehículo");
            System.out.println("4. Generar Informes");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            try {
                switch (opcion) {
                    case 1 ->
                        crearGaraje();

                    case 2 ->
                        agregarVehiculo();

                    case 3 ->
                        retirarVehiculo();

                    case 4 ->
                        generarInformes();

                    case 5 ->
                        System.out.println("Saliendo del sistema...");

                    default ->
                        System.out.println("Opción inválida.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (opcion != 5);
    }

    private static void crearGaraje() {
        System.out.print("Ingrese el departamento: ");
        String departamento = scanner.nextLine();
        System.out.print("Ingrese la ciudad: ");
        String ciudad = scanner.nextLine();
        System.out.print("Ingrese la dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Ingrese el teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Ingrese el email: ");
        String email = scanner.nextLine();
        System.out.print("Ingrese el administrador: ");
        String administrador = scanner.nextLine();
        System.out.print("Ingrese el número de espacios: ");
        int espacios = scanner.nextInt();

        Garaje garaje = new Garaje(departamento, ciudad, direccion, telefono, email, administrador, espacios);
        redGarajes.add(garaje);
        System.out.println("¡Garaje creado exitosamente!");
    }

    private static void agregarVehiculo() {
        // Similar implementación, guiando al usuario por pasos y llamando a los métodos necesarios.
    }

    private static void retirarVehiculo() {
        // Implementación para retirar un vehículo de un garaje.
    }

    private static void generarInformes() {
        // Generar informes de ocupación y recaudación.
    }
}
