package j08_Loops.Loop02_WhileLoop;
import java.util.Scanner;
public class C02_WhileLoop {public static void main(String[] args) {
    // task-> girilen tamsayının rakamları toplamını print eden code create ediniz.
    // 2316->6+1+3+2       571622->2+2+6+1+7+5



    Scanner input = new Scanner(System.in);
    System.out.println("Agam bi sayı giresen : ");
    int sayi = input.nextInt();
    int rakamToplam = 0;// loopdan gelecek her takrardakı rakamnın toplanacagı boş kutu tanımlandı

    while (sayi > 0) {// sayı sfırdan buyuk oldugu surece: sayı 1 olana kadar body ne diyorsa yap tekrarı tanımlandı

        rakamToplam += sayi % 10;//sayının birler basamgındaki rakam kutuya atıldı

        sayi = sayi / 10;// sayının 10 bolumu sayıya yeni değer olarak atandı
    }
    System.out.println("rakamToplam = " + rakamToplam);


}
}
