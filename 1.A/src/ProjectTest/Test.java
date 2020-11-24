package src.ProjectTest;

import src.Models.Models;

public class Test {
    public static void main(String[] args) {
        Models models = new Models();
        models.compareHours(2,3,4,5,6,7);
        models.compareHours(2,5,4,5,8,6);
        models.compareHours(8,5,4,5,8,4);
        models.compareHours(0,0,0,0,0,0);
        models.compareHours(-5,-5,-4,-7,5,8);

    }
}