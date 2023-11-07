package CHALLNGE_6.challenge06;

import java.util.Scanner;

public class Task01 {
    /* Task->
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod create ediniz.
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */
   static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("bir ifade giriniz");
        String str=input.next();
        boolean varmi = xyzVarmi(str);

        varmi1();

    }

    private static boolean xyzVarmi(String str) {
        return str.contains("xyz");
    }

    private static void varmi1() {
        System.out.println("bir ifade giriniz");
        String str=input.next();
        System.out.println(str.contains("xyz"));


    }




}