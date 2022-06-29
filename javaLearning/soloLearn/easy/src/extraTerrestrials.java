package SoloLearn;

import java.util.Scanner;

public class extraTerrestrials {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String engrish = sc.nextLine();
        char elonMusk = 0;

        for (int x = 1; x <= engrish.length(); x++) {
            elonMusk = engrish.charAt(engrish.length()-x);
            System.out.print(elonMusk);
        }
    }

}
