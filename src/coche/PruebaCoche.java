package coche;



public class PruebaCoche {

    public static void main(String[] args) {
        Coche c = new Coche("OPEL", "INSIGNIA");
        try{
        c.acelerar(180);
        }catch(ExcesoVelovidadExcepcion e){
            System.out.println(e.getMessage());
        }
    }
}
