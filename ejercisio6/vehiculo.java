
package ejercisio6;


public abstract class vehiculo {
    int precio;
    String marca;

    public vehiculo(int precio, String marca) {
        this.precio = precio;
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    

    public abstract int precioVenta();
}
