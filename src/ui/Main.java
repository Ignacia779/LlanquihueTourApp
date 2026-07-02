package ui;

import data.GestorServicios;
import model.ServicioTuristico;

public class Main{

    public static void main(String[] args) {
        GestorServicios gestor = new GestorServicios();
        gestor.cargarServicos();

        System.out.println("---CARGAR LA LISTA POLIMORFICO LLANQUIHUE TOUR---");

        for (ServicioTuristico s : gestor.getLista()){
            s.mostrarInformacion();
        }
    }
}

