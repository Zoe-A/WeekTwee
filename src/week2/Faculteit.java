package week2;

import java.util.Scanner;

public class Faculteit {
    public static void main(String[] args) {

    int n ;

    System.out.print("Geef een getal waarvan je de faculteit wil berekenen. ");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();

    /* als result en verm gedefinieerd ald double dan eindigd uitkomst op "8E9". Waarom?*/

    long result = n;
    long verm = n - 1;

    while (0 < verm){
         result = result*verm;
         verm--;
    }

    System.out.println("De faculteit van "+ n + " is "+ result);

    }
}
