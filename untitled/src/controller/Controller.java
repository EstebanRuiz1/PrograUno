package controller;

import models.Models;
import views.IOManager;

public class Controller {
    IOManager io = new IOManager();
    Models mo = new Models();
    public void init() {
        mo.convertOctalToDecimal(io.getOctalNumber());

    }
}
