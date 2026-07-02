package service;

import model.Direccion;
import model.Empleado;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorEmpleados {

    private ArrayList<Empleado> listaEmpleados = new ArrayList<>();

    public void cargarDesdeArchivo(String ruta){
        try {
            File archivo = new File(ruta);
            Scanner lector = new Scanner(archivo);

            while (lector.hasNextLine()){
                String[] datos = lector.nextLine().split(";");

                if (datos.length == 6){
                    Direccion dir = new Direccion(datos[2], datos[3], datos[4]);

                    Empleado emp = new Empleado(datos[0], datos[1], dir, datos[5]);

                    listaEmpleados.add(emp);
                }
            }
            lector.close();
        } catch (Exception e) {
           System.out.println("Error en la carga: " + e.getMessage());
        }
    }

    public void mostrarTodo(){
        for (Empleado e : listaEmpleados){
            System.out.println(e);
        }
    }
    public void buscarPorCargo(String tipo){
        System.out.println("Resultados para el cargo: " + tipo);
        listaEmpleados.stream()
                .filter(e -> e.getCargo().equalsIgnoreCase(tipo))
                .forEach(System.out::println);
    }
}

