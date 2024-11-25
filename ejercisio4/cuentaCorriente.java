package ejercisio4;

public class cuentaCorriente extends Cuenta {

    private int maximoRetirable;

    public cuentaCorriente(Persona cliente, long numeroCuenta, int maximoRetirable) {
        super(cliente, numeroCuenta);
        this.maximoRetirable = maximoRetirable;
    }

   

    public int getMaximoRetirable() {
        return maximoRetirable;
    }

    public void setMaximoRetirable(int maximoRetirable) {
        this.maximoRetirable = maximoRetirable;
    }

    @Override
    public String toString() {
        return "cuentaCorriente{" + "maximoRetirable=" + maximoRetirable + '}';
    }

    @Override
    public void retirar(double x) {
        if (x > 0 && x <= getSaldo() && x <= maximoRetirable) {
            super.retirar(x);

            System.out.println("retiro exitoso.nuevo saldo" + getSaldo());

        } else {
            System.out.println("Saldo insuficiente");
        }

    }
}
