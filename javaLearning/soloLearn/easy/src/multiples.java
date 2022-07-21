import java.util.Scanner;


public class multiples {



    public static void main(String[] args) {
        int x;
        int y;
        int sum;


        Scanner input = new Scanner(System.in);

        int inputVal = input.nextInt();

        if(inputVal >=3 && inputVal <5){
            System.out.println(3);
        } else if (inputVal ==5) {
            System.out.println(3+5);
        }
        else if(inputVal >5) {
           x = (inputVal-1) /3;
           y = (inputVal-1) /5;
           sum = getMultiples(x,y);

           System.out.println(sum);
        }
    }

    public static int getMultiples(int a,int b){
        int sum = 0;

     //   System.out.println(a);
     //   System.out.println(b);

        for(int x=1; x<=a; x++) {
            if (3*x%5>0) {
                sum = sum + (3 * x);
            }
        }
        a = sum;
    //    System.out.println(a);
        sum = 0;

        for(int x=1; x<=b; x++) {
            sum = sum + (5*x);
        }
        b = sum;
     //   System.out.println(b);

         return a+b;
    }
}
