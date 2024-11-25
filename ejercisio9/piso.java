
package ejercisio9;


public class piso extends vivienda {
    int planta;
    int puerta;

    public piso(int planta, int puerta, String calle, int superdicieEnMetros) {
        super(calle, superdicieEnMetros);
        this.planta = planta;
        this.puerta = puerta;
    }

    @Override
    public int calcularPrecio() {
        return super.calcularPrecio(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
