import java.util.Scanner;

public class neverLand {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int neverAge = input.nextInt();
        int diffAge = input.nextInt();
        int sum = neverAge+diffAge;


        System.out.println("My twin is "+Integer.toString(sum)+" years old and they are "+Integer.toString(diffAge)+" years older than me");
    }
}
