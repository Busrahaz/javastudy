package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {

    /*  task-> girilen tam sayıya kadar olan sayıların karelerinin toplamını
         print eden code create ediniz.


        Girilen sayı=4
        Kareler toplamı=30
     */
        Scanner input = new Scanner(System.in);
        System.out.print("agam bi sayi  giresen : ");
        int sayi = input.nextInt();
        int toplam=0;
        for (int i = 0; i <=sayi; i++) {// girilen sayıya kadar lopp tanımlandı
            toplam+=(i*i);//loop'dan gelen her bir i sayısı karesi alınarak toplama eklendi
        }
        System.out.println("girilen sayıların kareler toplamı : "+toplam);

    }
}
