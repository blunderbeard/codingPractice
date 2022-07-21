import java.util.Scanner;

public class landHo {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int lineOfPeople= input.nextInt()+1;

           System.out.println((lineOfPeople/20)*20+10);
    }
}
