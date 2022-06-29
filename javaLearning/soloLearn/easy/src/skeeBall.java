package SoloLearn;

import java.util.Scanner;
public class skeeBall
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int playerTickets = input.nextInt();
        int gunPoints = input.nextInt();

        int ptConvert = playerTickets / 12;

        if(ptConvert >= gunPoints){
            System.out.println("Buy it!");
        }
        else {
            System.out.println("Try again");
        }

    }
}