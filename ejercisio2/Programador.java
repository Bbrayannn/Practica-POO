
package ejercisio2;


public class Programador extends Empleado {
    private int lineasDeCodigo;
    private String lenguajeDominante;

    public Programador(int lineasDeCodigo, String lenguajeDominante, String nombre, String dni, int edad, boolean casado, double salario) {
        super(nombre, dni, edad, casado, salario);
        this.lineasDeCodigo = lineasDeCodigo;
        this.lenguajeDominante = lenguajeDominante;
    }
    

    public Programador() {
        super();
        this.lineasDeCodigo = 0;
        this.lenguajeDominante = "";
    }
      public double calculaSalario() {
          
        return (10*lineasDeCodigo);
    }

    @Override
    public String toString() {
        return "Programador{" + "lineasDeCodigo=" + lineasDeCodigo + ", lenguajeDominante=" + lenguajeDominante + '}';
    }
      
      
}

