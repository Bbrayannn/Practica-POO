
package ejercisio10;


public class AlfombraCuadrada extends Alfombra {
    int lado;

    public AlfombraCuadrada(int lado, String color, int precioMetro) {
        super(color, precioMetro);
        this.lado = lado;
    }

  
   

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calculaPrecio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double calculaSuperficie() {
        return lado*lado;
    }
    
}
