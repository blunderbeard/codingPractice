import java.util.Objects;
import java.util.Scanner;

public class isogramDetector {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        String isogram = input.nextLine();
        String[] strArr = isogram.split("");
        Boolean a = true;


        for(int x = 0;x<strArr.length;x++){
            for(int y = 1;y<strArr.length;y++){
                if(Objects.equals(strArr[x], strArr[y]) && x != y){
                      a = false;
                }
            }
        }
        System.out.println(a);
    }
}
