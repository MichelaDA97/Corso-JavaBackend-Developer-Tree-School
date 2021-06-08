package esercitazione1;

import java.util.Scanner;

public class PariODispari {
    public static void main (String [] args)  {
        Scanner s = new Scanner(System.in);
        System.out.print ("inserisci un numero: ");
        int a = s.nextInt();

        if (a%2==0)
            System.out.print (true);
            else
                System.out.print(false);
    }
}
