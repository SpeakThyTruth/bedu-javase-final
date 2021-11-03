package org.bedu.java.jse.basico.sesion02.postwork01;


import java.util.Scanner;

public class ListaOpcionesSelect {
    public static void main(String[] args) {
        short seleccionOpcion;
        String OpcionSeleccionada;
        System.out.println("Marca con el número indicado la opcion que quieras elegir: ");
        System.out.println("1. Crear nueva lista de tareas\n" +
                "2. Ver listas de tareas\n" +
                "3.Ver tareas de lista\n" +
                "4.Actualizar lista de tareas\n" +
                "5.Eliminar lista de tareas ");
        Scanner sc = new Scanner(System.in);
        seleccionOpcion = sc.nextShort();

       // seleccionOpcion = 1;
        switch (seleccionOpcion) {
            case 1:
                System.out.println("La opcion seleccionada es: 1 Crear nueva lista de tareas");
                break;
            case 2:
                System.out.println("La opcion seleccionada es: 2 Ver lista de tareas");
                break;
            case 3:
                System.out.println("La opcion seleccionada es: 3 Ver tareas de lista");
                break;
            case 4:
                System.out.println("La opcion seleccionada es: 4 Actualizar lista de tareas");
                break;
            case 5:
                System.out.println("La opcion seleccionada es: 5 Eliminar lista de tareas");
                break;
        }

        //System.out.println("La opcion seleccionada fue: " + seleccionOpcion);
        System.out.println("En construccion");


    }
}
