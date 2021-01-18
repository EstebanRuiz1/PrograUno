package models;

public class Models {
    public int convertOctalToDecimal(int octalNumber) {
        int decimal;
        do {
            decimal = octalNumber % 10;
        } while ((octalNumber % 10) != 0);
        return decimal;
    }
}
