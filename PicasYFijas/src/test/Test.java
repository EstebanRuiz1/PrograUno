package test;

import java.util.Scanner;

public class Test {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int num2, num1 = 0, picas = 0, fijas = 0, vidas= 1;
            int[] Num = new int[4];
            int[] Num1 = new int[4];
            System.out.println(" PICAS Y FIJAS");
            System.out.println();
            System.out.println("Intrucciones: Usted debe adivinar un numero de 4 digitos. Tiene 20 oportunidades, en las que se le irá informando el número de picas y fijas ");
            System.out.println("Picas: Número correcto en posicion incorrecta");
            System.out.println("Fijas: Número correcto en posicion correcta");
            System.out.println();

            System.out.println("ADIVINE EL NÚMERO DE 4 DÍGITOS");

            num2 = (int) (Math.random() * 9);

            for (int p = 0; p < 20; p++) {
                for (int i = 0; i < 4; i++) {
                    System.out.println();
                    System.out.println("Ingrese el Dígito "+(i+1));
                    Num[i] = scanner.nextInt();
                    Num1[i] = num2;
                }
                for (int i = 0; i < 4; i++) {
                    System.out.print(Num[i] + " ");
                }
                System.out.println();
                for (int i = 0; i < 4; i++) {
                    System.out.print(Num1[i] + " ");
                }
                for (int i = 0; i < Num1.length; i++) {
                    if (Num[i] == Num1[i]) {
                        fijas = fijas+ 1;

                    }
                }

                for (int k : Num) {
                    for (int i : Num1) {
                        if (k == i) {
                            picas = picas + 1;
                        }
                    }
                }

                System.out.println();
                System.out.println("Fijas: "+fijas);
                System.out.println("Picas: "+picas);
                System.out.println("VIDAS :"+vidas);
                if (Num == Num1) {
                    System.out.println("GANASTE !!!");
                    System.exit(0);
                }
                else {
                    vidas = vidas-1;
                }

                if (vidas == 0) {
                    System.out.println("Lo sentimos perdió. El numero era: "+num1);
                    System.exit(0);

                }
            }
            System.out.println("Te equivocaste de opción.\n");
        }
}
