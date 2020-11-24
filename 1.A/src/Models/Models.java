package src.Models;

public class Models {

    //Se añade el metodo para comparar horas
    public void compareHours(int hours, int minutes, int seconds, int finalHours, int finalMinutes, int finalSeconds ){
        int rHours = 3600* (hours-finalHours);
        int rMin = 60*(minutes-finalMinutes);
        int rSeconds = seconds-finalSeconds;
        System.out.println(rHours+rMin+rSeconds);
    }
}
