import java.util.Objects;
import java.util.Scanner;

public class izzyTheIguana {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
          int count = 0;
          String snacks = input.nextLine();

          String[] arrOfSnacks = snacks.split(" ");

        for (String arrOfSnack : arrOfSnacks) {
            if (Objects.equals(arrOfSnack, "Lettuce")) {
                count += 5;
            } else if (Objects.equals(arrOfSnack, "Mango")) {
                count += 9;
            } else if (Objects.equals(arrOfSnack, "Carrot")) {
                count += 4;
            }
        }
          if(count>=10) {
              System.out.println("Come on Down!");
          }
          else {
              System.out.println("Time to wait");
          }
    }
}
