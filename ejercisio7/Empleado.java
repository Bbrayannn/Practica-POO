
package ejercisio7;


public class Empleado {
    private static int numeroEmpleados=0;
    static int length;
    private  String nombre;
    private int telefono;

    public Empleado(String nombre, String telefono) {
        this.nombre = nombre;
     
        numeroEmpleados++;
    }

    public Empleado(int telefono) {
        this.telefono = telefono;
    }
    
      public static int getNumeroEmpleados() {
        return numeroEmpleados;
    }
    public static int getnuemroEmpleados() {
        return numeroEmpleados;
        
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
}
