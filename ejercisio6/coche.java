
package ejercisio6;


public class coche extends vehiculo {
    int puertas;

    public coche(int puertas, int precio, String marca) {
        super(precio, marca);
        this.puertas = puertas;
    }

    @Override
    public int precioVenta() {
        return (int) (precio*1.6);
    }

   

   
  
    
}
