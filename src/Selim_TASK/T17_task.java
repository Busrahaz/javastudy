package Selim_TASK;
import java.util.Scanner;
public class T17_task {
    public static void main(String[] args) {
        /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Haluk Bilgin Java -> H.B.J.  şeklinde print eden code create ediniz.
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Isim ve soy ismini gir");
        String ad=scan.nextLine().toUpperCase();
        String sonuc=ad.charAt(0)+"."+ad.charAt(ad.indexOf(" ")+1)+"."+ad.charAt(ad.lastIndexOf(" ")+1);
        System.out.println(sonuc);

    }
}
