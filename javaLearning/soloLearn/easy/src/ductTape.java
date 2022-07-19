import java.util.Scanner;

public class ductTape {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int height = input.nextInt();
        int width = input.nextInt();

        int total = (int) Math.ceil((height*width)*12/60.0);

        System.out.println(total);
    }
}
