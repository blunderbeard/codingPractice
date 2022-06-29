package SoloLearn;

import java.util.Scanner;

public class jungleCamping {
    public static void main(String[] args) {
        String[] animalArr = new String[]{"Lion", "Tiger", "Snake", "Bird"};
        String[] noiseArr = new String[]{"Grr", "Rawr", "Ssss", "Chirp"};


        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String aniSound = sc.next();

            for (int x = 0; x < animalArr.length; x++) {

                if (aniSound.equals(noiseArr[x])) {
                    System.out.print(animalArr[x]+" ");

                    break;
                }
            }
        }
    }
}