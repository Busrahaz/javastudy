package CHALLNGE_6.challenge06;

import java.util.Scanner;

public class Task03 {
    /* task->
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method create ediniz.
      */
    static Scanner input=new Scanner(System.in);
    public static <string> void main(String[] args) {
        System.out.println("bir deger giriniz");
        double sayi= input.nextDouble();
        System.out.println( kmCevir(sayi)+"kmdir");
        System.out.println( metreCevir(sayi)+"metre dir");
        dnstr();



    }

    private static double kmCevir(double sayi) {
        return sayi/10000;
    }

    private static double metreCevir(double sayi) {
        return sayi/100;
    }

    private static void dnstr() {
        System.out.println("bir sayi giriniz");
        double sayi= input.nextDouble();
        double km= (sayi/10000);
        double m= (sayi/100);
                System.out.println(sayi+"cm="+m+"metre dir. ve " +km+"km dir");

    }


}