package ejercisio4;

public class Prueba {

    public static void main(String[] args) {

        Persona persona1;
        persona1 = new Persona("vae", "23423442") {
        };
        Persona persona2;
        persona2=new Persona("sapo","48756238"){
        };
        
        Cuenta cuenta1 = new Cuenta(persona1, 10001);
        cuentaAhorro cuentaAhorro = new cuentaAhorro(persona1, 10003, 100);

        cuenta1.ingresar(1000);
        cuenta1.retirar(300);
        cuentaAhorro.ingresar(2000);
        cuentaAhorro.retirar(1900);
        System.out.println("Cuenta 1 - Saldo: " + cuenta1.getSaldo());
        System.out.println("Cuenta Ahorro - " + cuentaAhorro);
    }
}
