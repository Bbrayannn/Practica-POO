package ejercisio5;

public class cocheMatricula extends Coche {

    int aniomatriculacion;
    int mesmatrivculacion;
    double impuestoMstricula;

        

    public cocheMatricula(String matricula, String dniTitular, double precio) {
        super("3543", "342543f", 12000);
        this.matricula[0] = matricula;
        this.dniTitular = dniTitular;
        this.precio = precio;
        calculaImpuestoMatriculacion();
    }
    private void calculaImpuestoMatriculacion(){
        this.impuestoMstricula=this.precio/20;
        if (tieneMasde10Anios()){
            this.impuestoMstricula +=100;
        }
    }
    private boolean tieneMasDe10Anios(){
        return false;
    }

    private boolean tieneMasde10Anios() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getAniomatriculacion() {
        return aniomatriculacion;
    }

    public void setAniomatriculacion(int aniomatriculacion) {
        this.aniomatriculacion = aniomatriculacion;
    }

    public int getMesmatrivculacion() {
        return mesmatrivculacion;
    }

    public void setMesmatrivculacion(int mesmatrivculacion) {
        this.mesmatrivculacion = mesmatrivculacion;
    }

    public double getImpuestoMstricula() {
        return impuestoMstricula;
    }

    public void setImpuestoMstricula(double impuestoMstricula) {
        this.impuestoMstricula = impuestoMstricula;
    }
    
    
}


