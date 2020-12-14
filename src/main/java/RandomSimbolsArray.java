import java.util.Arrays;
import java.util.Random;
import java.lang.Math;

public class RandomSimbolsArray {

    //comment for commin
    public static void main(String[] args) {

        int count = 0;
        int[] randomSimbols = new int[15];
        for (int i = 0; i < randomSimbols.length; i++) {
            randomSimbols[i] = ((int) (Math.random()*10));

        }
        System.out.print(Arrays.toString(randomSimbols));
        System.out.println();

        for (int i = 0; i < randomSimbols.length; i++) {


            if (randomSimbols[i] % 2 == 0 &&  randomSimbols[i] != 0) {
                count++;
            }

            for (int j = 1; j < randomSimbols.length - i; j++) {

                if (randomSimbols[j - 1] > randomSimbols[j]) {
                    int tmp = randomSimbols[j - 1];
                    randomSimbols[j - 1] = randomSimbols[j];
                    randomSimbols[j] = tmp;

                }

            }


        }
        System.out.print("Count odd symbols - " + count);

        System.out.println();

        System.out.println(Arrays.toString(randomSimbols));


    }


}









