package models;

public class Models {
    public double promediateNumbers(String numbers) {
        double promedy = 0;
        int []array = new int[numbers.length()];
        for (int i = 0; i < numbers.length(); i++) {
            array[i]=numbers.charAt(i);
        promedy+=array[i];
        }
        return promedy;
    }
}
