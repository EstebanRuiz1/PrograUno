package models;

import java.util.Scanner;

public class Models {
    Scanner scanner = new Scanner(System.in);
    int[] arrayTwo;
    int[] arrayOne;

    public void convertIntToByte(int base, int longitude) {
        arrayOne = new int[longitude];
        String stringBase = Integer.toString(base);
        for (int i = 0; i < stringBase.length(); i++) {
            arrayOne[i] = stringBase.charAt(i) - '0';
        }
    }

    /**
     * @param adivinator
     * @return convierte la cadena de String a Byte
     */

    public void convertAdivinatorByte(int adivinator, int longitude) {
        arrayTwo = new int[longitude];
        String stringAd = Integer.toString(adivinator);
        for (int i = 0; i < stringAd.length(); i++) {
            arrayTwo[i] = stringAd.charAt(i) - '0';
        }
    }

    /**
     * @todo Esta vaina checa que no haya numeros repetidos dentro del primer array, que es el array base
     * Si encuentra debería salirse del codigo
     * @param longitude
     * @return trueOrFalse
     */
    public boolean checkNoRepeated(int longitude) {
        boolean booleanData = true;
        for (int i = 0; i < longitude; i++) {
            for (int j = 0; j < longitude; j++) {
                if (arrayOne[i] == arrayOne[j]) {
                    booleanData = false;
                }
            }
        }
        return booleanData;
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
        System.out.println("Fijas " + fijas);
        return fijas;
    }

    /**
     * @param longitude la longitud de
     * @return picas la cantidad de picas
     */
    public int verifyPicas(int longitude) { //Verificar picas
        int picas = 0;
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
            arrayOne[i] = scanner.nextInt();
        }
    }
}