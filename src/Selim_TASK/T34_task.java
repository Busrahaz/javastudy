package Selim_TASK;
import java.util.Scanner;
public class T34_task {/* task-> girilen sayıdan 1'e kadar olan tamsıyalrın karelerinin toplamını print eden code create ediniz..
	    Örnek Ekran Çıktısı
	    Girilen sayı=4               1 -> 1  2-> 4  3->9
	    Kareler toplamı=30
	     */


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir rakam giriniz");
        int a= scan.nextInt();
        int toplam=0;
        if (a>=1){
            for (int i = a; i >=1; i--) {
                toplam+=i*i;
            }
            System.out.println(toplam);
        }else System.out.println("1'den buyuk sayi gir");

    }// main sonu

}
