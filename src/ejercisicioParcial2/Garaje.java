package ejercisicioParcial2;

import Ecepciones.EspaciosAgotadosException;
import Ecepciones.VehiculoNoEncontradoException;
import java.util.ArrayList;
import java.util.List;

public class Garaje {
  private String departamento;
    private String ciudad;
    private String direccion;
    private String telefono;
    private String email;
    private String administrador;
    private int espacios;
    private ArrayList<Vehiculo> vehiculos;

    public Garaje(String departamento, String ciudad, String direccion, String telefono, String email, String administrador, int espacios) {
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.administrador = administrador;
        this.espacios = espacios;
        this.vehiculos = new ArrayList<>();
    }

    public boolean alquilarEspacio(Vehiculo vehiculo) throws EspaciosAgotadosException {
        if (vehiculos.size() < espacios) {
            vehiculos.add(vehiculo);
            return true;
        } else {
            throw new EspaciosAgotadosException("No hay espacios disponibles en el garaje.");
        }
    }

    public Vehiculo buscarVehiculo(String matricula) throws VehiculoNoEncontradoException {
        for (Vehiculo v : vehiculos) {
            if (v.getPlaca().equals(matricula)) {
                return v;
            }
        }
        throw new VehiculoNoEncontradoException("Vehículo con matrícula " + matricula + " no encontrado.");
    }

    public double calcularIngresos() {
        double ingresos = 0;
        for (Vehiculo v : vehiculos) {
            ingresos += v.getCuotaMesGaraje();
        }
        return ingresos;
    }
}


