package Presenter;

import models.Models;
import views.IOManager;

/**
 * @author Carlos Hernado Lozano
 * @author Esteban Ruiz
 * @author Jose Misael Paez
 */
public class Presenter {
    IOManager io = new IOManager(); //Crea objetos para las otras clases
    Models mo = new Models();

    public void init() {        
        int longitude = io.getLongitude();
        io.showLongitude(longitude);
        int lives = 7;
        mo.convertIntToByte(io.getBase(), longitude);
        do for (int i = 0; i <= lives; i++) {
            mo.convertAdivinatorByte(io.getAdivinator(), longitude);
            mo.verifyPicas(longitude);
            mo.verifyFijas(longitude);
            --lives;
            io.showLives(lives);
        } while (lives > 0 && mo.checkNoRepeated(longitude) == true);
        io.showEndGame();

    }
}
