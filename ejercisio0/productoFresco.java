package ejercisio0;

public class productoFresco extends Producto implements iDatos {

    private String fechaEnvasado;
    private String pais;

    public productoFresco(String fechaEnvasado, String pais, String Fechacaducidad, int lote) {
        super(Fechacaducidad, lote);
        this.fechaEnvasado = fechaEnvasado;
        this.pais = pais;
    }

    public productoFresco(String Fechacaducidad, int lote) {
        super(Fechacaducidad, lote);
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "productoFresco{" + "fechaEnvasado=" + fechaEnvasado + ", pais=" + pais + "]" + " " + super.toString();
    }

    @Override
    public boolean verificarFechacaducidad(int fechaActual) {
        System.out.println("Metodo desarrollado en productoFresco");
        return true;
    };

    @Override
    public void MuestraPais() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void MUestraFechaCaducidad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
