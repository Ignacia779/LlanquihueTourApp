package model;

public class Empleado extends Persona {

    private String cargo;

    public Empleado(String rut, String nombre, Direccion direccion, String cargo) {
        // Uso de super(...) para invocar el constructor de la superclase [7]
        super(rut, nombre, direccion);
        this.cargo = cargo;
    }
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    @Override
    public String toString() {
        return super.toString() + " | Cargo: " + cargo;
    }
}
