import java.util.Scanner;

public class landHo {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int lineOfPeople= input.nextInt()+1;

       if(lineOfPeople<=16){
           System.out.println(10);
       }
       else {
           System.out.println(lineOfPeople%16);
       }
    }
}
