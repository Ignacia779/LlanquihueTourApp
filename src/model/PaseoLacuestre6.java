package model;

public class PaseoLacuestre6 extends ServicioTuristico6 {
    private String tipoEmbarcacion;

    public PaseoLacuestre6() {
    }

    public PaseoLacuestre6(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    public PaseoLacuestre6(String tipoEmbarcacion, String nombre, int duracionHoras) {
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
