package SoloLearn;

import java.util.Scanner;

public class ballParkOrders
{
    public static void main(String[] args) {
        String[] foodArr = new String[]{"Nachos","Pizza","Cheeseburger","Water","Coke"};
        double[] priceArr =new double[] {6.00,6.00,10.00,4.00,5.00};
        double total = 0.00;
        double rate = 7.0/100.0;

        Scanner sc = new Scanner(System.in);

        for(int y = 0; y < 4; y++)
        {
            String tokens = sc.next();

            for(int x = 0; x < foodArr.length; x++) {

                if(tokens.equals(foodArr[x])){
                    total = total + priceArr[x];
                    break;
                }
                else if(!tokens.equals(foodArr[x]) && x==4) {
                    total = total + priceArr[4];
                }
            }
        }

        System.out.println((total*rate)+total);
    }
}