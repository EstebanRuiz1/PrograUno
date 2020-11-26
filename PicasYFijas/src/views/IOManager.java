package views;

import java.util.Scanner;

public class IOManager {

    private final String MESSAGE_GET_LONGITUDE = "Bienvenido, ingrese la longitud de su juego";
    private final String MESSAGE_LONGITUDE_STATUS = "La longitud ingresada fue de: ";
    private final String MESSAGE_LIVES_LEFT = "Vidas restantes:";
    private final String MESSAGE_ENDGAME = "Oh oh te has quedado sin vidas";
    private final String MESSAGE_GETBASE = "Ingrese la cadena base";
    private final String MESSAGE_GET_GUESS = "Ingrese el numero que se va a usar para adivinar";
    Scanner sc = new Scanner(System.in);

    public int getLongitude() {
        System.out.println(MESSAGE_GET_LONGITUDE);
        return sc.nextInt();
    }

    public void showLongitude(int longitude) {
        System.out.println(MESSAGE_LONGITUDE_STATUS + longitude+"\n");
    }

    public void showLives(int lives) {
        System.out.println(MESSAGE_LIVES_LEFT+ lives);
    }

    public void showEndGame() {
        System.out.println(MESSAGE_ENDGAME);
    }

    public int getBase() {
        System.out.println(MESSAGE_GETBASE);
        return sc.nextInt();
    }

    public int getAdivinator() {
        System.out.println(MESSAGE_GET_GUESS);
        return sc.nextInt();
    }
}
