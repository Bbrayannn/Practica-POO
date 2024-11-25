package ejercisio6;

public class prueba {

    public static void main(String[] args) {
        camiones[] camiones = new camiones[3];
        camiones[0] = new camiones(20, 3, 1555, "bmw");

        camiones[1] = new camiones(25, 2, 2000, "b");
        camiones[2] = new camiones(22, 4, 22555, "h");
        System.out.println("venta final del camion");
        for ( camiones camion:camiones){
            System.out.println(camion.precioVenta());
        }
    }

}
