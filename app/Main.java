package app;
import model.Direccion;
import model.Persona;
import model.Empleado;
import service.GestorEmpleados;

public class Main {

    public static void main(String[] args){

        //1. Crear direcciones
        Direccion dir1= new Direccion("Avenida Austral 120", "Osorno", "Los Lagos");
        Direccion dir2= new Direccion("Pasaje Andino 8", "Llanquihue", "Los Lagos");
        Direccion dir3= new Direccion("Calle del Lago 54", "Puerto Varas","Los Lagos");

        //2. Crear instancias de al menos 3 de personas
        Persona cliente = new Persona("12345678-9", "Fernanda López", dir1);
        Empleado guia = new Empleado("9875432-1", "Juan Pérez", dir2, "Guía de Montaña");
        Empleado administrativo = new Empleado("11222333-4", "Ana María", dir3, "Secretaria");

        GestorEmpleados gestor = new GestorEmpleados();
        gestor.cargarDesdeArchivo("proveedores.txt");
        gestor.mostrarTodo();

        System.out.println();
        gestor.buscarPorCargo("Secretaria");

        // 3. Mostrar resultados por consola usando toString() [5, 8]
      //System.out.println("--- DATOS DEL SISTEMA LLANQUIHUE TOUR ---");
       //System.out.println(cliente.toString());
      // System.out.println(guia.toString());
       // System.out.println(administrativo.toString());

    }
}
