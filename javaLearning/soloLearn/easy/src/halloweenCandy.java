package SoloLearn;

import java.util.Scanner;

public class halloweenCandy
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int houses = input.nextInt();

            System.out.println(Math.round(Math.ceil(2.0/houses*100)));
    }
}