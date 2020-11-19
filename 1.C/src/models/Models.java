package models;

public class Models {
    public boolean validateDate(int hour, int minute, int second){
        boolean boolHour = false, boolMin = false, boolSec = false, boolFinal;
        if (hour>=0&&hour<=23) boolHour = true;
        if (minute>=0&&minute<=60)boolMin=true;
        if (second>=0&&second<=60)boolSec=true;
        boolFinal= (boolMin && boolHour && boolSec);
        return boolFinal;
    }
}
