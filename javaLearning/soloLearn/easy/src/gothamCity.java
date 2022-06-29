package SoloLearn;

import java.util.Scanner;

public class gothamCity {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int criminals = input.nextInt();

        if (criminals<5){
            System.out.println("I got this!");
        }
        else if (criminals>=5 && criminals<=10){
            System.out.println("Help me Batman");
        }
        else {
            System.out.println("Good Luck out there!");
        }

    }
}
