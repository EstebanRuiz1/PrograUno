package models;

public class Models {
    public void getOption(int option, int data) {
        switch (option){
            case 1:
                this.doCelsiusFarenheit(data);
                break;
            case 2:
                this.doFarenheitCelsius(data);
                break;
            case 3:
                this.doKelvinFarenheit(data);
                break;
            case 4:
                this.doFarenheitKelvin(data);
                break;
            case 5:
                this.doCelsiusKelvin(data);
                break;
            case 6:
                this.doKelvinRankine(data);
                break;
            case 7:
                this.doReaumurKelvin(data);
                break;
            default:
                throw new IllegalStateException("Este valor no se encuentra dentro del rango " );
        }
    }

    private void doReaumurKelvin(int data) {
        double converted = (data-32);
    }

    private void doKelvinRankine(int data) {
        double converted = (data-32);
    }

    private void doCelsiusKelvin(int data) {
        double converted = (data+273.15);
    }

    private void doFarenheitKelvin(int data) {
        double converted = (data-32)*(5/9)+273.15;
    }

    private void doKelvinFarenheit(int data) {
        double converted = (data-273.15)*(9/5)+32;
    }
    private void doFarenheitCelsius(int data) {
        double converted = (data-32)*5/9;
        System.out.println("F a C"+data+converted);
    }
    private void doCelsiusFarenheit(int data) {
        double converted = (data*(9/5)+32);
        System.out.println("C a F"+data+converted);
    }
}
