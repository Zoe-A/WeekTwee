package week2;

import java.util.Arrays;

public class LottoGenerator {

    public static int berekenRandomGetal (int min, int max){
        int randy = min + (int) (Math.random() * (max - min));
        return randy;
    }

    public static void main(String[] args) {
    int max = 1;
    int min = 45;


    int a = berekenRandomGetal(min, max);
    int b = berekenRandomGetal(min, max);
    int c = berekenRandomGetal(min, max);


    int[] getallen = {a, b, c};
     for (int y : getallen){
          System.out.println(y);
     }


    }
}
