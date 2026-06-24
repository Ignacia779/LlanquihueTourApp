package model;

public class PaseoLacuestre extends ServicioTuristico {
    private String tipoEmbarcacion;

    public PaseoLacuestre() {
    }

    public PaseoLacuestre(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    public PaseoLacuestre( String tipoEmbarcacion, String nombre, int duracionHoras) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    @Override
    public String toString() {
        return "PaseoLacuestre{" +
                "nombre='" + nombre + '\'' +
                ", duracionHoras=" + duracionHoras +
                ", tipoEmbarcacion='" + tipoEmbarcacion + '\'' +
                '}';
    }
}
