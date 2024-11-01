
package ejercisio1;


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
    public void MuestraPais() {
        System.out.println("pais"+pais);
    }

    @Override
    public void MUestraFechaCaducidad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
