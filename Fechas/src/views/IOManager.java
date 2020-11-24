package views;

import java.util.Scanner;

public class IOManager {
    Scanner sc = new Scanner(System.in)

    public void showMenu() {
        System.out.println("Bienvenido, ingrese la opción que necesite: ");
        System.out.println("1. Para determinar si la fecha ingresada es valida" +
                "2. Determine cual de las 2 fechas que va a ingresar es menor" +
                "3. Determine la diferencia de años entre dos fechas" +
                "4. Para salir del programa");
    }

    public byte getOption() {
        System.out.println("Ingrese la opción");
        return sc.nextByte();
    }

    public void showOne(boolean result) {
        System.out.println("La fecha es: " + result);
    }

    public void showTwo(int date) {
        System.out.println("La fecha menor es la: " + date);
    }

    public void showThree(int difference) {
        System.out.println("La diferencia de fechas es: " + difference);
    }
}
