package model;

public class PaseoLacuestre extends ServicioTuristico {
    private String tipoEmbarcacion;

    public PaseoLacuestre() {
    }

    public PaseoLacuestre(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    public PaseoLacuestre(String nombre, int precio, String tipoEmbarcacion) {
        super(nombre, precio);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println(" | Tipo: Lacuestre | Embarcacion:" + tipoEmbarcacion);
    }
}
