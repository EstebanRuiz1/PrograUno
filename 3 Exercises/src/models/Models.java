package models;

public class Models {
    public void getOption(int option, int data) {
        switch (option){
            case 1:
                this.doCelsiusFarenheit(data);
                break;
            case 2:
                //this.doFarenheitCelsius(data);
                break;
            case 3:
                break;
            case 4:
                break;        
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                throw new IllegalStateException("Este valor no se encuentra dentro del rango " );
        }
    }

    private void doFarenheitCelsius(int data) {
        double converted = ((data*(9/5))+32);
        System.out.println("F a C"+data+converted);
    }
    private void doCelsiusFarenheit(int data) {
        double converted = data-32 (5/9);
        System.out.println("C a F"+data+converted);
    }
}
