package presenter;

import models.Models;
import views.IOManager;

public class Presenter {
    IOManager io = new IOManager();
    Models mo = new Models();

    public void init() {
        io.showMenu();
        int option = io.getOption();
        do {
            switch (option) {
                case 1:
                    firstOption();
                    init();
                    break;
                case 2:
                    secondOption();
                    init();
                    break;
                case 3:
                    thirdOption();
                    init();
                    break;
                case 4:
                    fourOption();
                    break;
            }

        } while (option != 4);
    }

    public void firstOption() {
        int year = io.getInt();
        int month = io.getInt();
        int day = io.getInt();
        mo.validateDates(year, month, day);

    }
    private void secondOption() {
        mo.verifyMinorDate();
    }
    private void thirdOption(){
        
    }
    private  void fourOption(){

    }
}

