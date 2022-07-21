import java.util.Scanner;

public class zipCodeValidator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String zipCode = input.nextLine();

        System.out.println(zipCodeChecker(zipCode));
    }

    public static boolean zipCodeChecker(String x){
        boolean a = false;

        if (x.length()==5 && !x.contains(" ")) {
            char[] charArr = x.toCharArray();
            for(char y : charArr){
                if(Character.isDigit(y)) {
                    a = true;
                }
            }
        }
        else {
             a = false;
        }
        return a;
    }

}
