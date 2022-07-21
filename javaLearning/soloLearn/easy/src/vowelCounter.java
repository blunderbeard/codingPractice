import java.util.Scanner;

public class vowelCounter {



    public static void main(String[] args) {

        String[] vowelArr= {"A","E","I","O","U"};
        int count = 0;

        Scanner input = new Scanner(System.in);

        String word = input.nextLine().toUpperCase();
        String[] StringArr = word.split("");

          for(String x : StringArr){
              for(String y : vowelArr) {
                  if (x.contains(y)) {
                      count = count + 1;
                  }
              }
        }
          System.out.println(count);
    }
}
