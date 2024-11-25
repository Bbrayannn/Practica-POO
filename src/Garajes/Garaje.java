
package Garajes;

import Ecepciones.EspaciosInsuficientesException;
import Ecepciones.ExcesoCamionesPermitidosException;
import Ecepciones.ExcesoMotosPermitidasException;
import Ecepciones.MatriculaDuplicadaException;
import ejercisicioParcial2.Vehiculo;
import java.util.ArrayList;


public class Garaje {
      private String departamento, ciudad, direccion, telefono, email, administrador;
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

    public boolean agregarVehiculo(Vehiculo vehiculo) throws MatriculaDuplicadaException, ExcesoMotosPermitidasException, ExcesoCamionesPermitidosException, EspaciosInsuficientesException {
        // Verificar matrícula duplicada
        for (Vehiculo v : vehiculos) {
            if (v.getPlaca().equals(vehiculo.getPlaca())) {
                throw new MatriculaDuplicadaException("El vehículo ya está registrado en este garaje.");
            }
        }

        // Validar límites de motos y camiones
        int totalMotos = 0, totalCamiones = 0;
        for (Vehiculo v : vehiculos) {
            if (v.getClass().getSimpleName().equals("Moto")) totalMotos++;
            if (v.getClass().getSimpleName().equals("Camion")) totalCamiones++;
        }

        if (vehiculo.getClass().getSimpleName().equals("Moto") && totalMotos >= (espacios * 0.2)) {
            throw new ExcesoMotosPermitidasException("No se pueden agregar más motos.");
        }

        int limiteCamiones = (espacios < 100) ? 10 : 20;
        if (vehiculo.getClass().getSimpleName().equals("Camion") && totalCamiones >= limiteCamiones) {
            throw new ExcesoCamionesPermitidosException("No se pueden agregar más camiones.");
        }

        // Validar espacio disponible
        if (vehiculos.size() >= espacios) {
            throw new EspaciosInsuficientesException("No hay espacios disponibles en el garaje.");
        }

        // Agregar vehículo
        vehiculos.add(vehiculo);
        return true;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public int getEspaciosDisponibles() {
        return espacios - vehiculos.size();
    }
}
