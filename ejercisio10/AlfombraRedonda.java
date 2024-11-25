
package ejercisio10;


public class AlfombraRedonda extends Alfombra {
    int radio;

    public AlfombraRedonda(int radio, String color, int precioMetro) {
        super(color, precioMetro);
        this.radio = radio;
    }

  

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public double calculaPrecio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double calculaSuperficie() {
        return Math.PI*Math.pow(radio, 2);
    }
    
}
