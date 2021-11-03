package org.bedu.java.jse.basico.sesion03.postwork01;

import java.util.Scanner;

public class Lector {
    public short ReturnMenuOption() {
        short menuOption;
        System.out.println("Elige una opcion del menu: ");
        Scanner sc = new Scanner(System.in);
        menuOption = sc.nextShort();
        return menuOption;

        // return sc.nextShort(); //reemplazaria lineas 7, 9 y 10
    }
}
