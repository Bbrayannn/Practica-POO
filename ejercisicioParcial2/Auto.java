
package ejercisicioParcial2;


public class Auto extends Vehiculo {
    boolean tieneRadio;
    boolean tieneNavegador;

    public Auto(boolean tieneRadio, boolean tieneNavegador, String marca, double precio, int cilindraje) {
        super(marca, precio, cilindraje);
        this.tieneRadio = tieneRadio;
        this.tieneNavegador = tieneNavegador;
    }

    public boolean isTieneRadio() {
        return tieneRadio;
    }

    public void setTieneRadio(boolean tieneRadio) {
        this.tieneRadio = tieneRadio;
    }

    public boolean isTieneNavegador() {
        return tieneNavegador;
    }

    public void setTieneNavegador(boolean tieneNavegador) {
        this.tieneNavegador = tieneNavegador;
    }

    @Override
    public void impuestoCirculacion() {
        
    }
    

    @Override
    public void VehiculoGaraje() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
