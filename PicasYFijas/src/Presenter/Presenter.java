package Presenter;

import models.Models;
import views.IOManager;

/**
 * @author Carlos Hernado Lozano
 * @author Esteban Ruiz
 * @author Jose Misael Paez
 */
public class Presenter {
    IOManager io = new IOManager();
    Models mo = new Models();

    public void init() {
        int longitude = io.getLongitude();
        int lives = 7;
        do {
            for (int i = 0; i <= lives; i++) {
                mo.setArrayBase(longitude);
                mo.verifyPicas(longitude);
                mo.verifyFijas(longitude);
                lives--;
                io.showLives(lives);
            }

        } while (lives > 0);
        io.showEndGame();

    }
}
