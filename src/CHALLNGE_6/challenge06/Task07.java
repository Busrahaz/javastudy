package CHALLNGE_6.challenge06;

import java.util.Scanner;

public class Task07 {

      /* task->  girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz..
   artık yıl:
            Kural1: 4 ile bölünemeyen yıllar artık yıl değildir.
            Kural2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır.
            Kural3: 4’ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece  400’ün katı olan yıllar artık yıldır.
    */
      static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        artikYilMi();



    }

    private static void artikYilMi() {
        System.out.println("yil giriniz");
        int yil= input.nextInt();
        kntrl1(yil);
        kntrl2(yil);
        kntrl3(yil);
    }

    private static void kntrl3(int yil) {
        if (yil%400==0) System.out.println("artik yildir");

        }


    private static void kntrl2(int yil) {
        if (yil%4==0 && yil%100!=0) System.out.println("artik yildir");

    }

    private static void kntrl1(int yil) {
        if (yil%4!=0) System.out.print("artik yil degildir");
    }
}
