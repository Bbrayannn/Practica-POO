
package ejercisio9;


public class prueba {
    public static void main(String[] args) {
        vivienda vivienda1 = new vivienda("calle",3000); 
        piso piso1 = new piso (4,7,"cali",45);
        Adosado Adosado1 = new Adosado("cali",123);
        chalet chalet1 = new chalet(434,false,"bosa",1233);
        System.out.println("presio de la vivienda"+vivienda1.calcularPrecio());
        System.out.println("presio del piso"+piso1.calcularPrecio());
        System.out.println("presio del adosado "+Adosado1.calcularPrecio());
        System.out.println("presio chalet "+chalet1.calcularPrecio());
    }
}
