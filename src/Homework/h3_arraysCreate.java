package Homework;
import java.util.Arrays;
public class h3_arraysCreate { public static void main(String[] args) {

    /*    İnt Array oluştur ve elemanları   : 25,30,30,35,100
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */

    //Kodu aşağıya yazınız..
int[] sayiArr={25,30,30,35,100};
int toplam=0;
    for (int i = 0; i <sayiArr.length ; i++) {
        toplam+=sayiArr[i];



    }
    System.out.println("toplam = " + toplam);


}
}
