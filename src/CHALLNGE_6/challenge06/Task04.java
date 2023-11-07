package CHALLNGE_6.challenge06;

import java.util.Scanner;

import static j10_MethodCreation.C01_MethodCreation.topla;

public class Task04 {


    /* task->
    Girilen bir tamsayı için
    Bu sayinin negatif veya pozitif oldugunu,
    tek mi cift mi oldugunu ve
    uc basamakli veya daha buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
    100'den kucukse sadece birler basamagini print eden method'lar create ediniz.
    */
static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("bir sayi giriniz");
        int sayi= input.nextInt();

        System.out.println("girdigin sayi " + negatifmi(sayi));
        System.out.println("kontrol(sayi) = " + kontrol(sayi));
        System.out.println("tekmi(sayi) = " + tekmi(sayi));

    }//main sonu

    private static String tekmi(int sayi) {
        return sayi%2==0?"sayi cifttir":"sayi tektir";
    }

    private static Integer kontrol(int sayi) {
        sayi=Math.abs(sayi);
        if (sayi>=100) {
            return (sayi % 10) + ((sayi%100)/10) + (sayi / 100);


        }else {
            return sayi/10;

        }
    }

    private static String negatifmi(int sayi) {
       return sayi>0?"pozitiftir":"negatiftir";
    }
}//Class sonu