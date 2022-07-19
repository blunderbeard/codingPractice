import java.util.Scanner;

public class easterEggs {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int total = input.nextInt();
        int basketA = input.nextInt();
        int basketB = input.nextInt();

        if(basketA+basketB==total){
            System.out.println("Candy Time");
        }
        else {
            System.out.println("Keep Hunting");
        }
    }
}
