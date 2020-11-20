package models;

import java.util.Scanner;

public class Models {
    Scanner scanner = new Scanner(System.in);
    int[] arrayTwo;
    int[] arrayOne;

    public void setArrayBase(int longitude) {
        System.out.println("Cual va a ser la longitud del juego ");
        arrayOne = new int[longitude];
        arrayTwo = new int[longitude];
        for (int i = 0; i < longitude; i++) {
            System.out.println("ingrese el numero " + i + " de los numeros adivinadores");
            arrayTwo[i] = scanner.nextInt();
        }
        for (int i = 0; i < longitude; i++) {
            System.out.println("ingrese el numero "+i+" de los numeros ");
        }
        System.out.println("Ingrese el numero a jugar   ");
    }

    /**
     * @param longitude entra la longitud del array weno
     * @return retorna las fijas del array
     */

    public int verifyFijas(int longitude) {
        int fijas = 0;
        for (int i = 0; i < longitude; i++) {
            if (arrayTwo[i] == arrayOne[i]) {
                fijas++;
            }
        }
        System.out.println("Dijitos fijos " + fijas);
        return fijas;
    }

    /**
     * @param longitude la longitud de 
     * @return picas la cantidad de picas
     */
    public int verifyPicas(int longitude) { //Verificar picas
        int picas=0;
        for (int i = 0; i < longitude; i++) {
            for (int j = 0; j < longitude; j++) {
                if (arrayTwo[i] == arrayOne[j] && arrayTwo[i] != arrayOne[i]) {
                    picas++;
                }
            }
        }
        System.out.println("Picas " + picas);
        return picas;
    }

    public void baseNumbers(int longitude) {
        for (int i = 0; i < longitude; i++) {
            System.out.println("Ingrese el numero " + i + " de los numeros a adivinar");
            arrayOne[i] = scanner.nextInt();
        }
    }
}