package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task16 {

    /*
     task-> Girilen sayının asal olmasını kontrol eden code create ediniz.
     * */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("agam bi sayı giresen : ");
        int sayi = input.nextInt();

        int bolenSayisi = 0;// boş kutu tanımlandı

        for (int i = 2; i < sayi; i++) {//girilen sayının -1 'ne kadar loop tanımlandı
            //   if (sayi % i == 0) {// sayı lopp'dan gelen sayıya tam bolunme şartı
            //       bolenSayisi++;
            //   }
            bolenSayisi = (sayi % i == 0) ? bolenSayisi++ : bolenSayisi;
        }
        System.out.println(bolenSayisi == 0 ? "girilen sayı ASAL" : "girlen sayı ASAL DEĞİL");



    }
}
