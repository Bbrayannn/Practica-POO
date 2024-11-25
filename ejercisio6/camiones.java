
package ejercisio6;


public class camiones extends vehiculo{
    int remolque;
    int ejes;

    public camiones(int remolque, int ejes, int precio, String marca) {
        super(precio, marca);
        this.remolque = remolque;
        this.ejes = ejes;
    }

    @Override
    public int precioVenta() {
     return (int) (precio*1.6*ejes); 
    }

  

 
    
}
