
package ejercisio6;


public class furgonetas  extends vehiculo{
    int carga;

    public furgonetas(int carga, int precio, String marca) {
        super(precio, marca);
        this.carga = carga;
    }

    @Override
    public int precioVenta() {
       int precioventaini=(int) (precio*1.6);
        if (carga>10){
            precioventaini*=1.2;
        }
        return precioventaini;
       
    }



    
}
