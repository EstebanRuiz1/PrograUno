package Models;

public class Models {

    public double calculatePromedy(double beans[]){
        double mid = 0;
        for (int i = 0; i < beans.length; i++) {
            mid+=beans[i];
        }
        return mid/beans.length;
    }
    public double standardDeviation(double beans[], double average){
        double standard;
        double sum = 0;
        for (int i = 0; i < beans.length; i++) {
            sum += Math.pow(beans[i]-average,2);
        }
        return Math.sqrt(sum/(beans.length-1));
    }
}