package Homework;
import java.util.Arrays;
public class h6_Array_with_forIf {public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 5,6,8,12,14,19
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */

    //Kodu aşağıya yazınız.
    int [] arr={5,6,8,12,14,19};
    int toplam=0;
    int sonuc= 0;
    for (int i = 0; i < arr.length; i++) {
       sonuc = arr[i]%2==0 ? (toplam+=arr[i]) : (toplam-=arr[i]);

    }
    System.out.println("sonuc = " + sonuc);


}

}


