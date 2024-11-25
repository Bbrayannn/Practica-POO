
package ejercisio10;


public  abstract class Alfombra implements Alfombras {
    
    
    
    private String color;
    private int precioMetro;

    public Alfombra(String color, int precioMetro) {
        this.color = color;
        this.precioMetro = precioMetro;
    }
    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecioMetro() {
        return precioMetro;
    }

    public void setPrecioMetro(int precioMetro) {
        this.precioMetro = precioMetro;
    }

    @Override
    public abstract double calculaPrecio();

    @Override
    public abstract double calculaSuperficie();
    
    
    
}
