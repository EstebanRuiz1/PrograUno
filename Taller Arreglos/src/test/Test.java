package test;

import models.Models;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Models mo = new Models();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los numeros que quiere promediar: ");
        String number = sc.nextLine();
        System.out.printf("Su promedio es: %.1f",mo.promediateNumbers(number));
    }
}
