package Test;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        System.out.println("Cual va a ser la longitud del juego ");
        Scanner scanner = new Scanner(System.in);
        int picas = 0, fijas = 0;
        int longitude = scanner.nextInt();
        int[] arrayOne = new int[longitude];
        int[] arrayTwo = new int[longitude];
        for (int i = 0; i < longitude; i++) {
            System.out.println("Ingrese el numero " + i + " de los numeros a adivinar");
            arrayOne[i] = scanner.nextInt();
        }
        for (int i = 0; i < longitude; i++) {
            System.out.println("ingrese el numero " + i + " de los numeros adivinadores");
            arrayTwo[i] = scanner.nextInt();
        }
        //Verifica si son fijas
        for (int i = 0; i < longitude; i++) {
                if (arrayTwo[i] == arrayOne[i]) {
                    fijas += 1;
            }
        }
        System.out.println("Dijitos fijos " + fijas);
        //Verificar picasfdshjklfasdkhljsdfajklfsdkjañlkñljfa
        for (int i = 0; i < longitude; i++) {
            for (int j = 0; j < longitude; j++) {
                if (arrayTwo[i] == arrayOne[j]&&arrayTwo[i]!=arrayOne[i]) {
                    picas += 1;
                }
            }
        }
        System.out.println("Picas " + picas);

        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] == arrayTwo[i]) fijas++;
            for (int k = 0; k < arrayOne.length; k++) {
                int value = arrayOne[i];
                for (int j = 0; j < arrayTwo.length; j++) if (value == arrayTwo[i]) picas++;
            }
        }

    scanner.close();
    }


}
