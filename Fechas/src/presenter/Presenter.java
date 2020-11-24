package presenter;

import models.Models;
import views.IOManager;

public class Presenter {
    IOManager io = new IOManager();
    Models mo = new Models();

    public void init() {
        int option = io.getOption();
        do {
            switch (option) {
                case 1:
                    firstOption();
                    break;
                case 2:
                    secondOption();
                    break;
                case 3:
                    thirdOption();
                    break;
                case 4:
                    fourOption();
                    break;
            }

        } while (option != 4);
    }

    public void firstOption() {

    }
    private void secondOption() {

    }
    private void thirdOption(){

    }
    private  void fourOption(){

    }
}

