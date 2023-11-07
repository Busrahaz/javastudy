package CHALLNGE_6.challenge06;

import java.util.Arrays;
import java.util.Scanner;

public class Task02 {

    // task-> girilen tamsayının tek-çift olmasını kontrol eden method create ediniz.

    public static void main(String[] args) {Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi= scan.nextInt();
        System.out.println(tekCift(sayi));
        tekCift1(sayi);
        System.out.println(tekCift2(sayi));


    }//main sonu

    private static String tekCift2(int sayi) {
        if (sayi%2==0){
            return sayi+" sayisi cifttir";
        }else {
            return sayi+" sayisi tektir";
        }

    }

    private static String tekCift(int sayi) {
        return sayi%2==0?sayi+" sayisi cifttir":sayi+" sayisi tektir";
    }
    private static void tekCift1(int sayi) {
        System.out.println(sayi%2==0?sayi+" sayisi cifttir":sayi+" sayisi tektir");
    }



    }//Class sonu





