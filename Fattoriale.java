package esercitazione1_1;

import java.util.Scanner;

public class Fattoriale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inserisci numero: ");
        int n = sc.nextInt();
        System.out.println(fattoriale(n));

    }

    static private int fattoriale(int n) {

        if (n == 0) {
            return 1;
        } else {
            int f = 1;
            for (int i = 1; i <= n; i++) {
                f = f * i;
            }

            return f;
        }
    }
}

