package test;
import models.Models;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Models models = new Models();
        System.out.println("Ingrese de que quiere convertir\n" +
                "1. Convertir una temperatura en grados Celsius (C°) a grados Fahrenheit (F°).\n" +
                "2. Convertir una temperatura en grados Fahrenheit (F°) a grados Celsius (C°).\n" +
                "3. Convertir una temperatura en grados Kelvin (K°) a grados Fahrenheit (F°).\n" +
                "4. Convertir una temperatura en grados Fahrenheit (F°) a grados Kelvin(K°).\n" +
                "5. Convertir una temperatura en grados Celsius (C°) a grados Kelvin (K°).\n" +
                "6. Convertir una temperatura en grados Kelvin(K°) a grados Rankine(Ra°).\n" +
                "7. Convertir una temperatura en grados Réaumur (Re°) a grados Kelvin (K°).\n");
        models.getOption(sc.nextInt(), sc.nextInt());
    }
}
