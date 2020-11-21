package views;

import java.util.Scanner;

public class IOManager {
    Scanner sc = new Scanner(System.in);
    public static final String MESSAGE_GET_LONGITUDE = "Bienvenido, ingrese la longitud de su juego";

    public int getLongitude() {
        System.out.println(MESSAGE_GET_LONGITUDE);
        return sc.nextInt();
    }

    public void showLongitude(int longitude) {
        System.out.println("La longitud de tu juego es de: " + longitude);
    }

    public void showLives(int lives) {
        System.out.println("Vidas restantes: " + lives);
    }

    public void showEndGame() {
        System.out.println("Oh oh te has quedado sin vidas");
    }

    public int getBase() {
        System.out.println("Ingrese la cadena base");
        return sc.nextInt();
    }

    public int getAdivinator() {
        System.out.println("Ingrese el numero que se va a usar para adivinar");
        return sc.nextInt();
    }
}
