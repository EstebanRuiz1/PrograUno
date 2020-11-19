package test;

import models.Models;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        Models models = new Models();
        System.out.println("Ingrese la Hora");
        boolean result = models.validateDate(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("Su fecha es: "+result);
    }
}
