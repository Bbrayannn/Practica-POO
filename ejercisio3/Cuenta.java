package ejercisio3;

public class Cuenta {

    private long numeroCuenta;
    private double saldo;
    private Persona Cliente;

   public Cuenta(Persona cliente, long numeroCuenta) {
        this.Cliente = cliente;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
    }

   
   

    public long getNumerocuenta() {
        return numeroCuenta;
    }

    public void setNumerocuenta(long numerocuenta) {
        this.numeroCuenta = numerocuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return Cliente;
    }

    public void setCliente(Persona Cliente) {
        this.Cliente = Cliente;
    }

    public void ingresar(double x) {
        if (x > 0) {
            saldo += x;
            System.out.println("Ingreso exitoso.nuevo saldo" + saldo);

        } else {
            System.out.println("La cantidad a ingresar debe ser positiva");
        }
    }

    public  void retirar(double x) {
        if (x>0 && x<saldo){
            saldo -=x;
            System.out.println("retiro exitoso");
        }else{
            System.out.println("saldo insuficieste"); 
        }

    }

}
