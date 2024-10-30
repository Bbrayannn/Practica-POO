
package ejercisio3;


public class cuentaAhorro extends Cuenta {
    private int saldoMinimo;

    public cuentaAhorro(Persona cliente, long numeroCuenta, int saldoMinimo) {
        super(cliente, numeroCuenta);
        this.saldoMinimo = saldoMinimo;
    }


    

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = (int) saldoMinimo;
    }

    @Override
    public String toString() {
        return "cuentaAhorro{" + "saldoMinimo=" + saldoMinimo + '}';
    }

    @Override
    public void retirar(double x) {
        if (x>0 && x>getSaldo()&& x>saldoMinimo){
        super.retirar(x); 
            System.out.println("Retiro no valido");
    }else{
            System.out.println("retiro valido");
        }
   
}
}
