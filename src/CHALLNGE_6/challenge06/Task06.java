package CHALLNGE_6.challenge06;

import java.util.Scanner;

public class Task06 {

    /* task ->
    İki integer sayının eşitliğini kontrol eden java methodunu yazınız.

    num1 = num2 => true
    */


    public static void main(String[] args) {

        System.out.println(" esit mi? " + esitMi());
    }


    private static Boolean esitMi() {
        Scanner input=new Scanner(System.in);
        System.out.println("birinci sayiyi gir");
        int sayi1= input.nextInt();
        System.out.println("ikinci sayiyi gir");
        int sayi2= input.nextInt();
        return sayi1==sayi2;


    }

}




