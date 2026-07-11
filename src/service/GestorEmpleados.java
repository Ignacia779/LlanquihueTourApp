package service;

import model.Direccion;
import model.Empleado;
import model.Registrable;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorEmpleados {

    private ArrayList<Registrable> listaEmpleados;

    //Constructor
    public GestorEmpleados(){
        listaEmpleados = new ArrayList<>();
    }

    public void agregar(Registrable r){
        listaEmpleados.add(r);
    }

    public void mostrarTodos(){
        for (Registrable r : listaEmpleados){
            System.out.println(r.mostrarResumen());
        }
    }



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
        for (Registrable r : listaEmpleados){
            System.out.println(r.mostrarResumen());
        }
        System.out.println("--------------------------");
    }

    public void buscarPorCargo(String tipo){
        System.out.println("\n---RESULTADOS PARA EL CARGO: " + tipo + "---");
        listaEmpleados.stream()
                .filter(registrable ->registrable instanceof Empleado)
                .map(registrable -> (Empleado) registrable)
                .filter(e -> e.getCargo().equalsIgnoreCase(tipo))
                .forEach(empleado -> System.out.println(empleado.mostrarResumen()));
    }
}

