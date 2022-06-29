package SoloLearn;

import java.util.Scanner;

public class hovercraft {

    public static void main(String[] args) {

            int maxCraft = 10;
             int cost = 2000000;
           int profit = 3000000;
        int insurance = 1000000;
        int backOrder;

        Scanner input = new Scanner(System.in);
        int customers = input.nextInt();

        if (customers>maxCraft) {
            backOrder=customers-10;
            customers=10;
        }

        if((customers*profit)>(maxCraft*cost+insurance)){
            System.out.println("Profit");
        }
        else if((customers*profit)<(maxCraft*cost+insurance)){
            System.out.println("Loss");
        }
        else {
            System.out.println("Broke Even");
        }
    }
}
