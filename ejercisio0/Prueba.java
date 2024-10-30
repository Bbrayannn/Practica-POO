package ejercisio0;

public class Prueba {

    public static void main(String[] args) {
        productoFresco pf = new productoFresco();
        ProductoRefrigerado pr = new ProductoRefrigerado();
        ProductoCongelado pc = new ProductoCongelado();

        pf.MuestraPais();
        pf.MuestraPais();
        pr.muestraPais();
        pc.muestraPais();

        Producto[] listaProducto = new Producto[4];

        listaProducto[0] = pf;
        listaProducto[1] = pr;
        listaProducto[2] = pc;

    }
}
