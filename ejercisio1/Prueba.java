package ejercisio1;

public class Prueba implements iDatos {

    public static void main(String[] args) {
        productoFresco pf = new productoFresco("2006","mexico","2025",12);
        productoRefrigerados pr = new productoRefrigerados(232,23,43,"españa","2343",32);
        productoCongelado pc = new productoCongelado(2006,"bogota",32.7);

        pf.MuestraPais();
        pf.MuestraPais();
        pr.MuestraPais();
        pc.MuestraPais();

     
     

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
