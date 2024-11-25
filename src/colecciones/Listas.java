package colecciones;

import java.util.ArrayList;
import java.util.List;

public class Listas {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("hola");
        lista.add("buena");
        lista.add("saludos");
        for (String st : lista) {
            System.out.println(st);
        }
        System.out.println("----------------");

        lista.add(1, "hello");
        for (String st : lista) {
            System.out.println(st);
        }
        System.out.println("----------------");
        /* sale error porque se esta buscando algo que no esta en la lista 
        lista.add(6, "hello");
        for (String st : lista) {
            System.out.println(st);
        }
         
        System.out.println("----------------");
         */

        lista.set(2, "good");
        for (String st : lista) {
            System.out.println(st);
        }
        System.out.println("----------------");
        lista.remove(0);
        for (String st : lista) {
            System.out.println(st);

        }
    }

}
