package esercitazione1_1;

import java.util.Scanner;

public class SommaArmonica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inserisci n: ");
        double n = sc.nextDouble();
        SumArmonic(n);
        //System.out.println(SumArmonic(n));

    }

    public static void SumArmonic(double n) {  //al posto di void double
        double ris = 0;

        for (double i = 1; i <= n; i++) {
            ris = ris + (1 / i);
        }
        //return ris;
        System.out.println("Il risultato è: " + ris);

    }

}