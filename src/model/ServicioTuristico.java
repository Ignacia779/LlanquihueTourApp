package model;

public class ServicioTuristico {
    protected String nombre;
    protected int precio;

    public ServicioTuristico() {
    }

    public ServicioTuristico(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void mostrarInformacion(){
        System.out.println("Servicio: " + nombre + "| Precio: $" + precio);
    }
}
