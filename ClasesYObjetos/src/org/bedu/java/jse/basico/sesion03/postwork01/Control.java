package org.bedu.java.jse.basico.sesion03.postwork01;

public class Control {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Lector lector = new Lector();
        ListasTareas lt = new ListasTareas();
        boolean x = true;

        do{
            System.out.println("==MENU DE OPCIONES== ");
            menu.PrintMenu();
            switch (lector.ReturnMenuOption()) {
                case 1:
                    System.out.println(lt.CrearNuevaListaTareas());
                break;
                case 2:
                    System.out.println(lt.VerListasDeTareas());
                break;
                case 3:
                    System.out.println(lt.VerTareasDeLista());
                break;
                case 4:
                    System.out.println(lt.ActualizarListaDeTareas());
                break;
                case 5:
                    System.out.println(lt.EliminarListaDeTareas());
                break;
                case 6:
                    System.out.println(lt.Salir());
                x = false;
                    break;
                default:
                    System.out.println("Por favor elige una opcion valida del 1 al 5: ");
                    break;
            }
        } while(x);

      //  System.out.println("La opcion seleccionada es: " + lector.ReturnMenuOption());
    }
}
