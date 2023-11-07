package CHALLNGE_6.challenge06;

import java.util.Scanner;


public class Task05 {
    static Scanner input = new Scanner(System.in);
    // task->
    //Kullaniciya kac sayi toplamak istedigini sorun.
    //Kullanici 2,3 veya 4 degerini girerse, kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdiriniz.
    //Kullanici toplamak istedigi sayi adedini 4'den buyuk girerse "cok sayi girdiniz, ben toplayamam" yazdiriniz.
    //2'den kucuk bir sayiyi girerse "En az 2 sayi girmelisiniz" yazdiriniz
    public static void main(String[] args) {
        System.out.println("kac sayi toplamak istersiniz");
        int sayi = input.nextInt();
        islem(sayi);


    }

    private static void islem(int sayi) {


        if (sayi <= 4 && sayi >= 2) {
            System.out.println("toplar(sayi) = " + toplar(sayi));


        } else if (sayi > 4) {
            System.out.println("cok sayi girdin toplayamam");

        } else
            System.out.println("en az ikis ayi girmelisin");


    }

    private static Integer toplar(int sayi) {
        int toplam = 0;
        for (int i = 1; i <= sayi; i++) {
            System.out.println(i + "inci sayiyi gir");
            toplam = toplam + input.nextInt();
        }
        return toplam;

    }

}




