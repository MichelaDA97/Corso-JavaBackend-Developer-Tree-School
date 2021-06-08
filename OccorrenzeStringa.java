package esercitazione1_1;

import java.util.Scanner;

/*import java.util.Scanner;

public class esercitazione1_1.OccorrenzeStringa {

        public static void main (String [] args) {
            Scanner sc = new Scanner (System.in);
            System.out.print ("Immettere il carattere a:");
            String a = sc.nextLine ();
            System.out.print ("Immettere la stringa b:");
            String b = sc.nextLine ();
            countOccurrences (a.charAt (0), b);
        }

        static void countOccurrences (char a, String b) {
            int cont = 0;
            for (int i=0; i<= b.length(); i++) {
                if (b.charAt(i) == a)
                    cont++;

                System.out.print ("numero occorrenze è: "+ cont);
            }



        }
    }
*/
public class OccorrenzeStringa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Immettere il carattere a:");
        String a = sc.nextLine();
        System.out.print("Immettere la stringa b:");
        String b = sc.nextLine();
        countOccurrences(a.charAt(0), b);

    }

    static void countOccurrences(char a, String b) {
       int cont = 0;
        for (int i=0; i<b.length(); i++) {
            if (b.charAt(i) == a ) {
                cont++;
            }
        }

        System.out.print("le occorrenze di " + a + " in " + b + " sono: " + cont);



    }
}