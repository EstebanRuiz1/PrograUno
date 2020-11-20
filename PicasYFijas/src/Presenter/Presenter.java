package Presenter;

import models.Models;
import views.IOManager;

/**
 * @author Carlos Hernado Lozano
 * @author Esteban Ruiz
 * @author Jose Misael Paez
 * TODO: Agregen a los otros dos que me da pereza
 */
public class Presenter {
    IOManager io = new IOManager();
    Models mo = new Models();

    public void init() {
        int longitude= io.getLongitude();       
        mo.setArrayBase(io.getFillNumbers());

    }
}
