import java.util.Scanner;

public class kaleidoscopes {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int scopes = input.nextInt();
        double cost = 5.00;
        double discount = 0.1;
        double tax = 0.07;

        if(scopes==1){
            System.out.println((cost * tax) + cost);
        }
        else {
            cost = cost*scopes;
         // System.out.println(cost);
            double x = (cost-(cost*discount));
            System.out.printf("%.2f",((tax*x))+x);
        }
    }
}
