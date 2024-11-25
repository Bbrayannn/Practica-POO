package ejercisicioParcial2;




import Ecepciones.VehiculoNoEncontradoException;
import java.util.Scanner;

public class Menu {
  private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
      // Creamos el garaje
        Garaje garaje = new Garaje("Valle", "Cali", "Calle 10", "123456789", "garaje@empresa.com", "Juan", 10);

        while (true) {
            System.out.println("--- Menú de Gestión de Garaje ---");
            System.out.println("1. Alquilar un espacio");
            System.out.println("2. Buscar vehículo");
            System.out.println("3. Consultar ingresos mensuales");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el salto de línea

            try {
                switch (opcion) {
                    case 1:
                        alquilarEspacio(garaje);
                        break;
                    case 2:
                        buscarVehiculo(garaje);
                        break;
                    case 3:
                        consultarIngresos(garaje);
                        break;
                    case 4:
                        System.out.println("Saliendo del programa.");
                        return;
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static void alquilarEspacio(Garaje garaje) {
        System.out.println("--- Alquilar un espacio ---");
        System.out.print("Ingrese la marca del vehículo: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese el precio del vehículo: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese el cilindraje del vehículo: ");
        int cilindraje = scanner.nextInt();
        scanner.nextLine();  // Limpiar el salto de línea

        System.out.println("Seleccione el tipo de vehículo:");
        System.out.println("1. Auto");
        System.out.println("2. Moto");
        System.out.println("3. Camión");
        System.out.println("4. Camioneta");
        System.out.print("Seleccione una opción: ");
        int tipoVehiculo = scanner.nextInt();
        scanner.nextLine();  // Limpiar el salto de línea

        Vehiculo vehiculo = null;

        switch (tipoVehiculo) {
            case 1:
                System.out.print("¿Tiene radio? (true/false): ");
                boolean tieneRadio = scanner.nextBoolean();
                System.out.print("¿Tiene navegador? (true/false): ");
                boolean tieneNavegador = scanner.nextBoolean();
                vehiculo = new Auto(marca, precio, cilindraje, tieneRadio, tieneNavegador);
                break;
            case 2:
                System.out.print("¿Tiene sidecar? (true/false): ");
                boolean tieneSidecar = scanner.nextBoolean();
                vehiculo = new Moto(marca, precio, cilindraje, tieneSidecar);
                break;
            case 3:
                System.out.print("Ingrese la carga máxima del camión (kg): ");
                double cargaMaxima = scanner.nextDouble();
                vehiculo = new Camion(marca, precio, cilindraje, cargaMaxima);
                break;
            case 4:
                System.out.print("¿Tiene aire acondicionado? (true/false): ");
                boolean tieneAireAcondicionado = scanner.nextBoolean();
                vehiculo = new Camioneta(marca, precio, cilindraje, tieneAireAcondicionado);
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        try {
            vehiculo.matricular("ABC123");  // Usamos una matrícula ejemplo para simplificar
            if (garaje.alquilarEspacio(vehiculo)) {
                System.out.println("¡Espacio alquilado exitosamente!");
            }
        } catch (Exception e) {
            System.out.println("Error al alquilar el espacio: " + e.getMessage());
        }
    }

    private static void buscarVehiculo(Garaje garaje) {
        System.out.print("Ingrese la matrícula del vehículo: ");
        String matricula = scanner.nextLine();
        try {
            Vehiculo vehiculo = garaje.buscarVehiculo(matricula);
            System.out.println("Vehículo encontrado: " + vehiculo.getMarca() + " - " + vehiculo.getPlaca());
        } catch (VehiculoNoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void consultarIngresos(Garaje garaje) {
        double ingresos = garaje.calcularIngresos();
        System.out.println("Los ingresos mensuales del garaje son: $" + ingresos);
    }
}
