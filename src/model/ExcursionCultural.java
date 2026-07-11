package model;

public class ExcursionCultural extends ServicioTuristico {
    private String lugarTuristico;

    public ExcursionCultural(String lugarTuristico) {
        this.lugarTuristico = lugarTuristico;
    }

    public ExcursionCultural(String nombre, int precio, String lugarTuristico) {
        super(nombre, precio);
        this.lugarTuristico = lugarTuristico;
    }

    public String getLugarTuristico() {
        return lugarTuristico;
    }

    public void setLugarTuristico(String lugarTuristico) {
        this.lugarTuristico = lugarTuristico;
    }
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println(" | Tipo: Cultural | Lugar: " + lugarTuristico);

    }
}

