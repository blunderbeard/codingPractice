package SoloLearn;

import java.util.Scanner;

public class cheerCreator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int yard = sc.nextInt();

        if(yard>10){
            System.out.println("High Five");
        }
        else if(yard<1){
            System.out.println("shh");
        }
        else if(yard>1 && yard<=10){
            for(int x=1;x<=yard;x++){
                System.out.print("Ra!");
            }
        }
    }
}
