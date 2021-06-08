package esercitazione1;

public class RimpiazzaIntrusi {

    public static void main (String [] args) {
        String a = "a";
        String b = "b";
        String c = "a abc d";

       String[] split = c.split (" ");
       split[1] = split[1].replaceAll(a,b);

       for (int i=0;i<split.length;i++) {
           System.out.print(split[i] + " ");
       }

    }



 /*   public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print ("Inserisci stringa:");
        String a = sc.nextLine ();
        System.out.print ("Inserisci stringa:");
        String b = sc.nextLine ();
        System.out.print ("Inserisci stringa:");
        String c = sc.nextLine ();
        replaceIntruder(a, b, c);
    }

    private static void replaceIntruder (String a, String b, String c) {



    }
*/

}