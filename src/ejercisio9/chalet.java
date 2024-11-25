
package ejercisio9;


public class chalet extends vivienda {
    int numParcelas;
     public boolean comPiscina =false;
   

    public chalet(int numParcelas, boolean comPiscina, String calle, int superdicieEnMetros) {
        super(calle, superdicieEnMetros);
        this.numParcelas = numParcelas;
        this.comPiscina = comPiscina;
    }

    @Override
    public int calcularPrecio() {   
        return superdicieEnMetros*1300;
    }
 
    
}
