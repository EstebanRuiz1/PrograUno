package test;

import java.util.Scanner;

public class Test {

        public static void main(String[] args) {
            System.out.println("Cual va a ser la longitud del juego ");
        }
            Scanner scanner = new Scanner(System.in);//pollo
            int num2, num1 = 0, picas = 0, fijas = 0, vidas= 1;
            int longitude  = scanner.nextInt();
            int[] userOne = new int[longitude];
            int[] userTwo = new int[longitude];
        public void fillList(){
            for (int i = 0; i < longitude; i++) {
            System.out.println("ingrese el "+i+" numero de la lista");
                userOne[i+= scanner.nextInt();
            }
            for (int i = 0; i < longitude; i++) {
                System.out.println("ingrese el "+i+" numero de la lista de adivinanza");
                userTwo[i]=scanner.nextInt();
            }
        }
    public void setFijas(int[] userOne, int[] userTwo){
        int fijas=0;
        for (int i = 0; i <userOne.length; i++) {
            if (userOne[i]==userTwo[i]){
                fijas++;
            }
        }
        System.out.println("Hay actualmente "+ fijas+" Fijas");
    }
}
