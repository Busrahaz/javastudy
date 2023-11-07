package Selim_TASK;
import java.util.Scanner;
public class T21_task {
    //Task-> Girilen isim ve soyisimi  buyuk harfler ile print eden code create ediniz.

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Isim ve soy ismini gir");
        String ad=scan.next();
        String soyad=scan.next();
        System.out.println(ad.toUpperCase()+" "+soyad.toUpperCase());
        System.out.println(ad.toUpperCase().concat(" "+soyad.toUpperCase()));


    }

}
