package runner;

import models.Models;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        Models mod = new Models();
        System.out.println("ingrese su cadena");
        String chain = sc.nextLine();
        mod.encrypt(chain);
    }
}
