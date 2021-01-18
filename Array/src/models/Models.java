package models;

public class Models {
    /**
     *
     * @param array
     * @return sumatoria
     */
    public int sumatory(int array []){
        int summary=0, total = 0;
        int []sumatory=new int[array.length];
        for (int i = 0; i < array.length; i++) {
            summary += array[i]; // Incrementamos el acumulador
            sumatory[i]= summary;

        }
        for (int i = 0; i < array.length; i++) {
            total += sumatory[i];
        }
        return total;
    }
}
