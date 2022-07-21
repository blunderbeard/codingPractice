import java.util.Scanner;

public class numberOfOnes {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int lonelyNum = input.nextInt();

        System.out.println(Integer.bitCount(lonelyNum));
    }

}
