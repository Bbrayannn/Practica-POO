package ejercisio0;

public class productoRefrigerados extends Producto implements iDatos {

    private int codigo;
    private int fechaEnbasado;
    private int temperaturaRecomendada;
    private int pais;

    public productoRefrigerados(int codigo, int fechaEnbasado, int temperaturaRecomendada, int pais, String Fechacaducidad, int lote) {
        super(Fechacaducidad, lote);
        this.codigo = codigo;
        this.fechaEnbasado = fechaEnbasado;
        this.temperaturaRecomendada = temperaturaRecomendada;
        this.pais = pais;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getFechaEnbasado() {
        return fechaEnbasado;
    }

    public void setFechaEnbasado(int fechaEnbasado) {
        this.fechaEnbasado = fechaEnbasado;
    }

    public int getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public void setTemperaturaRecomendada(int temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public int getPais() {
        return pais;
    }

    public void setPais(int pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "productoRefrigerados{" + "codigo=" + codigo + ", fechaEnbasado=" + fechaEnbasado + ", temperaturaRecomendada=" + temperaturaRecomendada + ", pais=" + pais + '}' + super.toString();
    }

    @Override
    public boolean verificarFechacaducidad(int fechaActual) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void MuestraPais() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void MUestraFechaCaducidad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
