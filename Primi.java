package esercitazione1_1;

import java.util.Scanner;

   /* public static void main (String [] args) {
        int numero = 0;
        System.out.println (isPrime (numero));
        numero = 1;
        System.out.println (isPrime (numero));
        numero = 2;
        System.out.println (isPrime (numero));
        numero = 17;
        System.out.println (isPrime (numero));
        numero = 631;
        System.out.println (isPrime (numero));
        numero = 634;
        System.out.println (! IsPrime (numero));
        numero = 999;
        System.out.println (! IsPrime (numero));
        numero = 997;
        System.out.println (isPrime (numero));
    }

    private static boolean isPrime (int numero) {

    } */
 

    public class Primi {

        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("Inserisci un numero");
            int n = input.nextInt();
            System.out.println(isPrime(n));
            input.close();
        }


        public static boolean isPrime(int n) {
//			throws IllegalArgumentException {
//		if(n < 0)
//			throw new IllegalArgumentException("numero non valido");
//			}{

            boolean flag= false;

            if(n<=1) {
                return false;
            }
            for (int i=2;i<=n/2 && flag==false;i++) {
                if(n%i==0) {
                    return false;
                }
            }

            if (flag==true) {
                return false;
            } else {
                return true;
            }


        }

    }


