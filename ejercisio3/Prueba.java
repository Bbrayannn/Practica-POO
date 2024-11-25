package ejercisio3;

public class Prueba {

    public static void main(String[] args) {

        Empleado empleado = new Empleado("Juan", "1435", 45, true, 300.0);
        System.out.println("Datos de empleado");
        System.out.println(empleado);
        System.out.println("Clasificasio" + empleado.Clasifica());
        empleado.subiralario(10);
        System.out.println("Salario despues de aumento" + empleado);

        Programador programador = new Programador(10,"java","brayan","afrvvfd",22,false,33.0);
        System.out.println("\nDatos del Programador:");
        System.out.println(programador);
        System.out.println("Salario calculado: " + programador.calculaSalario());
    }
}
