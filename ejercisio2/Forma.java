package ejercisio2;

public abstract class Forma {

    String nombre;
   
    String color;
    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    public Forma(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
