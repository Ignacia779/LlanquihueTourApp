package app;

import model.Direccion;
import model.Persona;
import model.Empleado;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class MainGUI {
    public static void main(String[] args){
        List<Object> lista = new ArrayList<>();
        int opcion = -1;

        while (opcion !=0){
            String input = JOptionPane.showInputDialog("Elige una opción:\n" +
                            "1) Ingresar Dirección\n" +
                            "2) Ingresar Persona\n" +
                            "3) Ingresar Empleado\n" +
                            "4) Mostrar todos\n" +
                            "0) Salir"
                    );

opcion= Integer.parseInt(input);

            if(opcion == 1) {
                // Dirección
                String calle = JOptionPane.showInputDialog("Ingresa la calle:");
                String ciudad = JOptionPane.showInputDialog("Ingresa la ciudad:");
                String region = JOptionPane.showInputDialog("Ingresa la región:");

                Direccion direccion = new Direccion(calle, ciudad, region);
                lista.add(direccion);
                JOptionPane.showMessageDialog(null, "Dirección creada:\n" + direccion.toString());

            } else if(opcion == 2) {
                // Persona
                String rut = JOptionPane.showInputDialog("Ingresa el RUT:");
                String nombre = JOptionPane.showInputDialog("Ingresa el nombre:");

                String calle = JOptionPane.showInputDialog("Ingresa la calle:");
                String ciudad = JOptionPane.showInputDialog("Ingresa la ciudad:");
                String region = JOptionPane.showInputDialog("Ingresa la región:");

                Direccion direccion = new Direccion(calle, ciudad, region);
                Persona persona = new Persona(rut, nombre, direccion);
                lista.add(persona);
                JOptionPane.showMessageDialog(null, "Persona creada:\n" + persona.toString());
            } else if(opcion == 3) {
                // Empleado
                String rut = JOptionPane.showInputDialog("Ingresa el RUT del empleado:");
                String nombre = JOptionPane.showInputDialog("Ingresa el nombre del empleado:");

                String calle = JOptionPane.showInputDialog("Ingresa la calle:");
                String ciudad = JOptionPane.showInputDialog("Ingresa la ciudad:");
                String region = JOptionPane.showInputDialog("Ingresa la región:");

                Direccion direccion = new Direccion(calle, ciudad, region);

                String cargo = JOptionPane.showInputDialog("Ingresa el cargo:");
                Empleado empleado = new Empleado(rut, nombre, direccion, cargo);
                lista.add(empleado);

                JOptionPane.showMessageDialog(null, "Empleado creado:\n" + empleado.toString());
            } else if(opcion == 4) {
                // Mostrar todos
                StringBuilder sb = new StringBuilder("Objetos creados:\n");
                for(Object obj : lista) {
                    sb.append(obj.toString()).append("\n");
                }
                JOptionPane.showMessageDialog(null, sb.toString());

            } else if(opcion == 0) {
                JOptionPane.showMessageDialog(null, "Saliendo del programa...");
            } else {
                JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        }
    }
}

