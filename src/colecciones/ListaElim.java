package colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ListaElim {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("hola");
        lista.add("buena");
        lista.add("saludos");
        lista.add("hola");
        lista.add("buena");
        lista.add("saludos");
        lista.add("hola");
        lista.add("buena");
        lista.add("saludos");
        for (String st : lista) {
            System.out.println(st);

        }
        System.out.println("-------------------");
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals("hola")) {
                lista.remove(i);
            }
            for (String st : lista) {
                System.out.println(st);

            }
            System.out.println("-----------------------");
            lista.clear();
            lista.add("hola");
            lista.add("buena");
            lista.add("saludos");
            lista.add("hola");
            lista.add("buena");
            lista.add("saludos");
            lista.add("hola");
            lista.add("buena");
            lista.add("saludos");
            Iterator<String> it = lista.iterator();
            while (it.hasNext());
            String s = it.next();
            if (s.equals("hola")) {
                it.remove();
                System.out.println("-------------------");
                for (String st : lista) {
                    System.out.println(st);

                }

            }
        }

    }
}
