package model;

public class ExcursionCultural6 extends ServicioTuristico6 {
    private String lugarHistorico;

    public ExcursionCultural6() {
    }

    public ExcursionCultural6(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }

    public ExcursionCultural6(String lugarHistorico, String nombre, int duracionHoras) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    public String getLugarHistorico() {
        return lugarHistorico;
    }

    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }

    @Override
    public String toString() {
        return "ExcursionCultural{" +
                "nombre='" + nombre + '\'' +
                ", duracionHoras=" + duracionHoras +
                "lugarHistorico='" + lugarHistorico + '\'' +
                '}';
    }
}
