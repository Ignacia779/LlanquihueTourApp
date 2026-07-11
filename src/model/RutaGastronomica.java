package model;

public class RutaGastronomica extends ServicioTuristico {
    private String especialidad;

    public RutaGastronomica(String especialidad) {
        this.especialidad = especialidad;
    }

    public RutaGastronomica(String nombre, int precio, String especialidad) {
        super(nombre, precio);
        this.especialidad = especialidad;
    }
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println(" | Tipo: Gastronomico | Especialidad:" + especialidad);
    }

}
