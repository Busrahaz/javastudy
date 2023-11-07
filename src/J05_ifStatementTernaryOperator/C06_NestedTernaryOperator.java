package J05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C06_NestedTernaryOperator {

    public static void main(String[] args) {

          /*
       TASK :
       Girilen sayi 0 dan buyuk esit ise 10 dan kucukluğunu kontrol ediniz.
       10 dan kucuk ise  "Rakam" degilse "Pozitif Sayi" ,
       Sayi 0'dan kucuk ise  "Negatif Sayi" print eden code create ediniz
        */


        Scanner input = new Scanner(System.in);
        System.out.println("Agıdeşşş hele bi sayı girive gari...");
        int sayi = input.nextInt();
        System.out.println(sayi >= 0 ? (sayi < 10 ? "Rakam" : "Pozitif Sayi") : "Negatif Sayi");

        // ahan da TRICK -> Agam ne kaaa küfte  O kaa ekmek -> ne kdar ? varsa o kadar : olmalı.
          /*
        show business Trick-> Java'da "nested" blok'lar app. run edildiğinde app. yavaşlatır
        (Time Complexity), dolayısyle "nested" blok'lar mecbur kalmadıkça tercih edilmez.
         */


    }
}