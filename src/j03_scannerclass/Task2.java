package j03_scannerclass;
import java.util.Scanner;
public class Task2 {public static void main(String[] args) {
    /*
     * TASK ->
     *
     * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
     * ve vucut kutle endeksini bulun.
     * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
     *
     * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
     *
     * Ornek : Input : boy :180 kilo : 80
     *         Output : Vucut kutle endeksiniz : 24
     *                  Vucut kutle endeksiniz : 24.691…
     *
     *
     */
    Scanner input = new Scanner(System.in);//kullanıcı veriei alacak scanner obj tanımlandı
    System.out.print("Gakkom hele kilonu kg girisin : ");
    double kilo = input.nextDouble();

    System.out.print("Gakkom hele boyunu cm girisin : ");
    double boy = input.nextDouble();
    boy=boy/100;
    // int vke1=kilo/(boy*boy);
    double vke2=kilo/(boy*boy);

    System.out.println("vke2 = " + vke2);
}
}
