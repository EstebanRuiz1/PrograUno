package views;

import java.util.Scanner;

public class IOManager {
    Scanner sc = new Scanner(System.in);
    public static final String MESSAGE_GET_LONGITUDE = "Bienvenido, ingrese la longitud de su juego";
    public static final String MESSAGE_GET_FIRST_ARRAY = "Ingrese la serie de numeros a adivinar";
    public static final String MESSAGE_GET_SECOND_ARRAY = "Ingrese la serie de numeros para adivinar";

    public int getLongitude() {
        System.out.println(MESSAGE_GET_LONGITUDE);
        return sc.nextInt();
    }

    public void showLives(int lives) {
        System.out.println("Vidas restantes: "+lives);
    }

    public void showEndGame() {
        System.out.println("Oh oh te has quedado sin vidas");
    }
}
