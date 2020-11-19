package test;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        System.out.println("Cual va a ser la longitud del juego ");
        Scanner scanner = new Scanner(System.in);
        int picas = 0, fijas = 0;
        int longitude  = scanner.nextInt();
        int[] arrayOne = new int[longitude];
        int[] arrayTwo = new int[longitude];
        for (int i = 0; i < longitude; i++) arrayOne[i] = scanner.nextInt();
        for (int i = 0; i < longitude; i++) arrayTwo[i] = scanner.nextInt();
        for (int i = 0; i < longitude; i++) {
            if (arrayOne[i] == arrayTwo[i])
                picas++;
        }
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] == arrayTwo[i]) fijas++;
            for (int k = 0; k < arrayOne.length; k++) {
                int value = arrayOne[i];
                for (int j = 0; j < arrayTwo.length; j++) if (value == arrayTwo[i]) picas++;
            }
        }
    }


}
