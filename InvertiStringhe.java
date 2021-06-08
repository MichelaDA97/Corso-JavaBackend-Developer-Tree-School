package esercitazione1;
/*import java.util.Scanner;

public class esercitazione1.InvertiStringhe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci stringa:");
        String a = sc.nextLine();
        reverseString(a);
    }

    private static void reverseString(String s) {
        String[] split = s.split("");
        System.out.println(split[1] + "" + split[0]);

    }

}*/

public class InvertiStringhe {
    public static void main (String [] args) {

        String s1  = new String ("come stai");
        String[] s2 = s1.split (" ");
        int i;

        for (i=s2.length-1; i>=0; i--){
            System.out.println(s2[i]);
        }
    }
}