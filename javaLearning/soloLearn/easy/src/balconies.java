//package SoloLearn;

import java.util.Arrays;
import java.util.Scanner;

public class balconies
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String houseA = input.next();
        String houseB = input.next();

        String [] arrOfHouseA = houseA.split(",",2);
           int heightA = Integer.parseInt(arrOfHouseA[0]);
           int widthA = Integer.parseInt(arrOfHouseA[1]);

        String [] arrOfHouseB = houseB.split(",",2);
           int heightB = Integer.parseInt(arrOfHouseB[0]);
           int widthB = Integer.parseInt(arrOfHouseB[1]);

        if (heightA*widthA>heightB*widthB){
            System.out.println("Apartment A");
        } else if (heightA*widthA<heightB*widthB) {
            System.out.println("Apartment B");
        }
    }
}