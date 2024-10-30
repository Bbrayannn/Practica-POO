
package ejercisio0;


public class productoCongelado implements iDatos {
    private int fechaEnvasado;
    private String pais;
    private double temperaturaMantenimiento;

    public productoCongelado(int fechaEnvasado, String pais, double temperaturaMantenimiento) {
        this.fechaEnvasado = fechaEnvasado;
        this.pais = pais;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }

    public int getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(int fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getTemperaturaMantenimiento() {
        return temperaturaMantenimiento;
    }

    public void setTemperaturaMantenimiento(double temperaturaMantenimiento) {
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }

    @Override
    public String toString() {
        return "productoCongelado{" + "fechaEnvasado=" + fechaEnvasado + ", pais=" + pais + ", temperaturaMantenimiento=" + temperaturaMantenimiento + '}'+super.toString();
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
