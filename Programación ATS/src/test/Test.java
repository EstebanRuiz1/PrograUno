package test;

import javax.swing.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Notas de un estudiante
        /**
         * @todo Permite hacer un calculador de notas
         * @return nota final
         *
         */
        /*float participacion, primerExamen, segundoExamen, examenFinal, notaFinal;
        System.out.println("digite la nota de participación:");
        participacion = sc.nextFloat();
        System.out.println("Digite la nota de primer examen:");
        primerExamen = sc.nextFloat();
        System.out.println("Digite la nota del segundo examen parcial: ");
        segundoExamen = sc.nextFloat();
        System.out.println("digite la nota del examen final: ");
        examenFinal = sc.nextFloat();

        participacion *= 0.10f;
        primerExamen *= 0.25f;
        segundoExamen *= 0.25f;
        examenFinal *= 0.40f;
        notaFinal = participacion+primerExamen+segundoExamen+examenFinal;
        System.out.println(notaFinal);*/

        //Calcular el cuadrado de una suma
        /**
         * @params Calcula el cuadrado de una suma
         * @return Suma cuadrada calculada
         */
        /*int firstNumber;
        int secondNumber;
        double result;
        System.out.println("Ingrese su primer numero");
        firstNumber = sc.nextInt();
        System.out.println("Ingrese su segundo numero");
        secondNumber = sc.nextInt();
        result = Math.pow(firstNumber, 2)+ Math.pow(secondNumber,2)+2*firstNumber*secondNumber;
        System.out.println(result);*/

        //Calcular fechas
        /*int hours, weeks, days, totalHours;
        System.out.println("Ingrese las horas");
        hours = sc.nextInt();
        weeks = hours / 168;
        days = hours % 168 / 24;
        totalHours = hours % 24;
        System.out.println("Semanas: " + weeks + " Dias: " + days + " Horas " + totalHours);*/

        //Arreglos n.n
        int datas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo: "));
        int[] array= new int[datas];
        for (int i = 0; i < datas; i++) {
            array[i ] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento " + (i+1) + " del arreglo"));
        }


    }
}
