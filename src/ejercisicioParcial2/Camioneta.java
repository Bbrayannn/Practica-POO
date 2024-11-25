package ejercisicioParcial2;

public class Camioneta extends Vehiculo {

   private boolean tieneAireAcondicionado;
   
public Camioneta(String marca, double precio, int cilindraje, boolean tieneAireAcondicionado) {
        super(marca, precio, cilindraje);
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        calcularImpuestoCirculacion();
    }

    @Override
    public void calcularImpuestoCirculacion() {
        super.calcularImpuestoCirculacion();
         if (tieneAireAcondicionado) {
            impuestoCirculacion += precio * 0.01;
        }
    }
 public boolean tieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }
}
