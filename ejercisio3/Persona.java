
package ejercisio3;


public  abstract class Persona {
    private String Nombre;
    private String NIF;

    public Persona(String Nombre, String NIF) {
        this.Nombre = Nombre;
        this.NIF = NIF;
    }

    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }
    
}
