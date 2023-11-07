package Selim_TASK;
import java.util.Scanner;
public class T22_task {
    //Task01-> girilen iki ayrı  kelimeyi iki farklı yol ile birlestiriniz.

        //Task02-> yukardaki ornekte verilen birinci ve ikinci degiskenlerin ilk harflerini atip birlestiriniz.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Isim ve soy ismini gir");
        String ad=scan.next();
        String soyad=scan.next();
        System.out.println(ad.toUpperCase()+" "+soyad.toUpperCase());
        System.out.println(ad.toUpperCase().concat(" "+soyad.toUpperCase()));
        System.out.println("task 02");
        System.out.println(ad.substring(1)+" "+soyad.substring(1));
        System.out.println(ad.substring(1).concat(" "+soyad.substring(1)));

    }

}
