package ejercisio9;

public class vivienda {

    String calle;
    double precio;
     int superdicieEnMetros;

    public vivienda(String calle, int superdicieEnMetros) {
        this.calle = calle;
        this.superdicieEnMetros = superdicieEnMetros;
    }
    public  int calcularPrecio(){
      return superdicieEnMetros*1000;
}
}


