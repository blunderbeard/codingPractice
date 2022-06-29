package SoloLearn;

import java.util.Scanner;

public class paintCosts {

    public static void main(String[] args) {

        int numPaints;
        double mats = 40.00;
        double paint = 5.00;
        double tax = 0.1;
        double preTax;

        Scanner input = new Scanner(System.in);
        numPaints = input.nextInt();

        preTax = (numPaints*paint)+mats;

   //     System.out.println(preTax);
        System.out.println(Math.round((preTax*tax)+preTax));
    }
}




