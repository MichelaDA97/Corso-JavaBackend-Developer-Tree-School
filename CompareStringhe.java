package esercitazione1;

import java.util.Scanner;

public class CompareStringhe {
   /* public static void main (String [] args) {
        String a = "ciao come va?";
        String b = "cIao come vA?";
        String c = "ciao come va";
        System.out.println ("2" .equals ("" + compareStrings (a, b, c)));
        a = "ciao come va?";
        b = "cIaoo come vA?";
        c = "ciao come va a";
        System.out.println ("1" .equals ("" + compareStrings (a, b, c)));
        a = "ciao come va?";
        b = "cIao come va?";
        c = "ciao come vA?";
        System.out.println ("3" .equals ("" + compareStrings (a, b, c)));
    }

    private static int compareStrings (String a, String b, String c) {

    }*/


        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Scanner input = new Scanner(System.in);
            String s1, s2, s3;
            System.out.println("Inserisci stringa 1:");
            s1 = input.nextLine();
            System.out.println("Inserisci stringa 2:");
            s2 = input.nextLine();
            System.out.println("Inserisci stringa 3:");
            s3 = input.nextLine();

            System.out.println(ComparaStringhe(s1, s2, s3));


        }


        public static int ComparaStringhe(String s1, String s2, String s3) {
            int contauguali = 0;
            if (s1.equals(s2)) {
                contauguali = contauguali + 2;
                if (s1.equals(s3) ) {
                    contauguali++;
                    return contauguali;
                }
            } else if (s2.equals(s3)) {
                contauguali = contauguali + 2;
                return contauguali;
            } else if (s1.equals(s3)) {
                contauguali = contauguali + 2;
                return contauguali;
            }
            return contauguali;

        }
}