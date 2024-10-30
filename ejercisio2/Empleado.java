package ejercisio2;

public class Empleado {

    private String nombre;
    private String dni;
    private int edad;
    private boolean casado;
    private double salario;

    public Empleado(String nombre, String dni, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }

    public Empleado() {
        this.nombre = "";
        this.dni = "";
        this.edad = 0;
        this.casado = false;
        this.salario = 0.0;
    }

    public int Clasifica() {
        if (edad <= 21) {
            System.out.println("calsificasion:Principiante");
        } else if (edad >= 22 && edad <= 35) {
            System.out.println("Clasisficasion:intermedio");
        } else if (edad > 35) {
            System.out.println("Clasificasion:senior");
        } else {
            System.out.println("Edad no valida");
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + ", casado=" + casado + ", salario=" + salario + '}';
    }

    public Empleado(double salario) {
        this.salario = salario;
    }

    public void subiralario(int porcentaje) {
        salario += salario * porcentaje / 100.0;

    }

    public double getSalario() {
        return salario;
    }

}
