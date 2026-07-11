package data;

import model.*;
import java.util.ArrayList;
import java.util.List;

public class GestorServicios {
    private List<ServicioTuristico> lista = new ArrayList<>();

    public void cargarServicos() {

        lista.add(new RutaGastronomica("Sabor Andino", 15000, "Cocina tradicional andina"));

        lista.add(new RutaGastronomica("Mar y Fuego", 27000, "Cocina Costera"));

        lista.add(new ServicioTuristico("Ruta del Sol", 10000));// Instancia base

        lista.add(new ServicioTuristico("Aventura Verde", 9500));

        lista.add(new PaseoLacuestre("Recorrido por Lago Llanquihue", 20000, "Catamarán"));

        lista.add(new PaseoLacuestre("Aventura en Kayak", 17500, "Kayak doble"));

        lista.add(new ExcursionCultural("Ruta patrimonial de Frutillar", 25000, "Teatro del Lago"));

        lista.add(new ExcursionCultural("Tour historico por Puerto Varas", 22000, "Museo Colonial Alemán"));

    }
    public List<ServicioTuristico> getLista() {
        return lista;
    }
}
