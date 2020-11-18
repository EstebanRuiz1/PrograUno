package src.Models;

public class Models {
    public int compareSeconds(int hours, int minutes, int seconds, int finalHours, int finalMinutes, int finalSeconds) {
    return (((hours * 3600) + (minutes * 60) + seconds) - (finalSeconds + (finalMinutes * 60) + (finalHours * 3600)));
    }
    //Se añade el metodo para comparar horas
    public void compareHours(int hours, int minutes, int seconds, int finalHours, int finalMinutes, int finalSeconds ){
        int rHours = hours-finalHours;
        int rMin = minutes-finalMinutes;
        int rSeconds = seconds-finalSeconds;
        System.out.println(rHours+rMin+rSeconds);
    }
}
