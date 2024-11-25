
package ejercisio1;


public abstract class Producto {
    private String FechaCaducidad;
    private int lote;

    public Producto(String Fechacaducidad, int lote) {
        this.FechaCaducidad = Fechacaducidad;
        this.lote = lote;
    }

    public String getFechacaducidad() {
        return FechaCaducidad;
    }

    public void setFechacaducidad(String Fechacaducidad) {
        this.FechaCaducidad = Fechacaducidad;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    @Override
    public String toString() {
        return "Producto{" + "Fechacaducidad=" + FechaCaducidad + ", lote=" + lote + '}';
    }
    public abstract boolean verificarFechacaducidad(int fechaActual);
    
    public static void main(String[] args) {
        System.out.println("Pais de productos general");
    }
    
}

      
