import java.util.Scanner;

public class guardFlamingos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int length = input.nextInt()*2;
        int width = input.nextInt()*2;

        System.out.println((length+width)/2);
    }
}
