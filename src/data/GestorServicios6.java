package data;

import model.*;

public class GestorServicios6 {
    public void mostrarServicios() {
        RutaGastronomica6 ruta1 = new RutaGastronomica6(5, "Rio Rahue", 4);
        RutaGastronomica6 ruta2 = new RutaGastronomica6(2, "Ruta de los cafes del Volcan", 3);
        RutaGastronomica6 ruta3 = new RutaGastronomica6(6, "Sabores del lago Llanquihue", 6);

        PaseoLacuestre6 paseo1 = new PaseoLacuestre6("Lancha", "Estrella del sur", 2);
        PaseoLacuestre6 paseo2 = new PaseoLacuestre6("Velero", "Aurora del sur", 3);
        PaseoLacuestre6 paseo3 = new PaseoLacuestre6("Bote de Pesca", "Horizonte Andino", 4);

        ExcursionCultural6 excursion1= new ExcursionCultural6("Mirador", "Osorno", 2);
        ExcursionCultural6 excursion2 = new ExcursionCultural6("Museo Andino", "Historia del Sur", 5);
        ExcursionCultural6 excursion3= new ExcursionCultural6("Parque Natural", "Parque Aventura Petrohue", 4);

        System.out.println(ruta1.toString());
        System.out.println(ruta2.toString());
        System.out.println(ruta3.toString());
        System.out.println(paseo1.toString());
        System.out.println(paseo2.toString());
        System.out.println(paseo3.toString());
        System.out.println(excursion1.toString());
        System.out.println(excursion2.toString());
        System.out.println(excursion3.toString());

    }
}
