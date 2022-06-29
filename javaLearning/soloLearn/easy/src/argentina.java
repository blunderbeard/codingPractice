package SoloLearn;

import java.util.Scanner;

public class argentina {

    public static void main(String[] args) {

        int peso;
        int dollar;

        Scanner input = new Scanner(System.in);
        peso = input.nextInt();
        dollar = input.nextInt();

        int pesToCent = (peso * 2)/100;

        if (pesToCent>dollar){
            System.out.println("Dollars");
        }
        else if (pesToCent<dollar){
            System.out.println("Pesos");
        }
        else {
            System.out.println("Doesnt Matter");
        }

    }
}
