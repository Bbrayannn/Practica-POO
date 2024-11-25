package ejercisicioParcial2;

public class Moto extends Vehiculo {

    boolean tieneSidecar;

    public Moto(boolean tieneSidecar, String marca, double precio, int cilindraje) {
        super(marca, precio, cilindraje);
        this.tieneSidecar = tieneSidecar;
    }

    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public void calcularimpuestoCirculacion() {
           
         if (tieneSidecar) {
            
        }
    }

   


    @Override
    public void VehiculoGaraje() {
        double cuotaMesGaraje1 = this.cuotaMesGaraje * 1.50;
    }

}


