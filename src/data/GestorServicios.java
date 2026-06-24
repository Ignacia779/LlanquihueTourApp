package data;

import model.*;

public class GestorServicios {
    public void mostrarServicios() {
        RutaGastronomica ruta1 = new RutaGastronomica(5, "Rio Rahue", 4);
        RutaGastronomica ruta2 = new RutaGastronomica(2, "Ruta de los cafes del Volcan", 3);
        RutaGastronomica ruta3 = new RutaGastronomica(6, "Sabores del lago Llanquihue", 6);

        PaseoLacuestre paseo1 = new PaseoLacuestre("Lancha", "Estrella del sur", 2);
        PaseoLacuestre paseo2 = new PaseoLacuestre("Velero", "Aurora del sur", 3);
        PaseoLacuestre paseo3 = new PaseoLacuestre("Bote de Pesca", "Horizonte Andino", 4);

        ExcursionCultural excursion1= new ExcursionCultural("Mirador", "Osorno", 2);
        ExcursionCultural excursion2 = new ExcursionCultural("Museo Andino", "Historia del Sur", 5);
        ExcursionCultural excursion3= new ExcursionCultural("Parque Natural", "Parque Aventura Petrohue", 4);

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
