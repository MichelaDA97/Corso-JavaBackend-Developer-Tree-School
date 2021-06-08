package esercitazione1;

import java.util.Scanner;

public class OperatoriAritmetici {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Inserisci un numero:");
        int a = sc.nextInt();
        System.out.println ("Inserisci un secondo numero:");
        int b = sc.nextInt();
        computeValues (a,b);

    }


    private static void computeValues (int a, int b) {
        System.out.println (a+b);
        System.out.println (a-b);
        System.out.println (a*b);
        System.out.println (a/b);
        System.out.println (a%b);

    }
}
