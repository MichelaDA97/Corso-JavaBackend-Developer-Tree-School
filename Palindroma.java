package esercitazione1_1;

import java.util.Scanner;

public class Palindroma {

    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("inserisci parola: ");
        String p = sc.nextLine();
        System.out.println (Palindrome(p));

    }

    public static boolean Palindrome(String p){
        if(p.equals(stringReverse(p))){
            return true;
        } else return false;
    }

    public static String stringReverse(String p){
        String s= "";
        int j=0;

        for (int i=p.length()-1; i>=0;i--){
            s=s+p.charAt(i);
            j++;
        }
        return s;
    }
}
