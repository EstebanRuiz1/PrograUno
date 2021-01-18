package Test;

import Models.Models;

public class Test {
    public static void main(String[] args) {
        Models mo = new Models();
        double num, media = 0;
        double[] beanLongitude = new double[]{2.48, 2.95, 4.62, 4.32, 4.40, 4.72, 3.28, 4.16, 1.93, 4.40, 1.30, 4.27, 2.76, 4.21, 3.62, 1.41, 1.62, 3.54, 3.51, 4.30, 3.95, 3.51, 3.20, 4.64, 3.93, 4.75, 3.96, 2.85, 3.27, 3.00, 2.17, 1.82, 3.56, 4.02, 1.34, 3.12, 2.61, 2.85, 2.42, 4.22, 3.13, 4.56, 4.40, 1.49, 1.81, 4.79, 1.36, 4.24, 3.54,};
        double[] beanDiameter = new double[]{2.48, 2.95, 4.62, 4.32, 4.40, 4.72, 3.28, 4.16, 1.93, 4.40, 1.30, 4.27, 2.76, 4.21, 3.62, 1.41, 1.62, 3.54, 3.51, 4.30, 3.95, 3.51, 3.20, 4.64, 3.93, 4.75, 3.96, 2.85, 3.27, 3.00, 2.17, 1.82, 3.56, 4.02, 1.34, 3.12, 2.61, 2.85, 2.42, 4.22, 3.13, 4.56, 4.40, 1.49, 1.81, 4.79, 1.36, 4.24, 3.54,};
        for (int i = 0; i < 49; i++) {
            beanLongitude[i] = (Math.random() * 1.50) + 0.5;
            num = beanLongitude[i];
            System.out.printf("%.2f%n", num);

        }
        System.out.println("Largo de los frijoles:");
        double mediaFinal = mo.calculatePromedy(beanLongitude);
        System.out.printf("Media %.2f %n", mediaFinal);
        double sd = mo.standardDeviation(beanLongitude, mo.calculatePromedy(beanLongitude));
        String str = Double.toString(sd);
        System.out.printf("Desviacion estandar %.2f%n", sd);

        System.out.println("\nDiametro de los frijoles:");
        double mediaFinalDiameter = mo.calculatePromedy(beanDiameter);
        System.out.printf("Media %.2f %n", mediaFinal);
        double sdDiameter = mo.standardDeviation(beanDiameter, mo.calculatePromedy(beanDiameter));
        String strDiameter = Double.toString(sdDiameter);
        System.out.printf("Desviacion estandar %.2f", sdDiameter);
    }
}
