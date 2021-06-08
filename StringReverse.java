package esercitazione1_1;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci stringa:");
        String a = sc.nextLine();
        stringReverse(a);
    }

    static void stringReverse(String a) {
        int i;
        for (i = a.length()-1; i>=0; i--) {
            System.out.print(a.charAt(i));
        }
    }
}