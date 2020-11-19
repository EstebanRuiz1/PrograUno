package test;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        System.out.println("Cual va a ser la longitud del juego ");
        this.allMethods();

    }
    Scanner scanner = new Scanner(System.in);
    int num2, num1 = 0, picas = 0, fijas = 0, vidas= 1;
    int longitude  = scanner.nextInt();
    int[] arrayOne = new int[longitude];
    int[] arrayTwo = new int[longitude];

    public void allMethods(){
        this.fillArrays();
        this.checkPicas();
        this.selectFijasYPicas(int[] arrayOne, int[] arrayTwo);
    }
    public void fillArrays(){
        for (int i = 0; i < longitude; i++)
            arrayOne[i]= scanner.nextInt();
        for (int i = 0; i <longitude; i++){
            arrayTwo[i]=scanner.nextInt();
        }
        public void checkPicas(){
            int pica=0;
            for (int i = 0; i < longitude; i++) {
                if (arrayOne[i]==arrayTwo[i])
                    pica++;
            }
        }
        public void selectFijasYPicas(int[]arrayOne , int[]arrayTwo){
            int fijas=0;
            for (int i = 0; i < arrayOne.length; i++) { //Aca salen las fijas
                if(arrayOne[i] == arrayTwo[i]){fijas++;        //Aca salen las fijas
                }
                int picas=0;
                for (int k = 0; k < arrayOne.length ; k++) {    //Aca salen las picas
                    int value = arrayOne[i];
                    for (int j = 0; j < arrayTwo.length; j++) {
                        if(value == arrayTwo[i])picas++;

                    }
                }
            }

}
