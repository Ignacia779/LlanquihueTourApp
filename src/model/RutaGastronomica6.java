package model;

public class RutaGastronomica6 extends ServicioTuristico6 {
    private int numeroDeParadas;

    public RutaGastronomica6() {
    }

    public RutaGastronomica6(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    public RutaGastronomica6(int numeroDeParadas, String nombre, int duracionHoras) {
        super(nombre, duracionHoras); //llama al constructor de ServicioTuristico
        this.numeroDeParadas = numeroDeParadas;
    }

    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    @Override
    public String toString() {
        return "RutaGastronomica{" +
                ", nombre='" + nombre + '\'' +
                ", duracionHoras=" + duracionHoras +
                ", numeroDeParadas=" + numeroDeParadas +
                '}';
    }
}
