package Selim_TASK;
import java.util.Scanner;
public class T05_ifStatement {
    /* Task ->
     * Girilen Y/N  degerlerini
     * print eden code create ediniz..
     * INPUT : Y ,  N
     * OUTPUT : YES ; NO
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Kardesim Y veya N gir");
        char karakter=scan.next().charAt(0);
        if (karakter=='Y'||karakter=='y'){
            System.out.println("YES");
        } else if (karakter=='N'||karakter=='n') {
            System.out.println("NO");
        }else System.out.println("Kardesim yanlis karakter girdin");

        System.out.println("Stringli cozum");
        String harf=scan.next();
        if (harf.equalsIgnoreCase("Y")){
            System.out.println("YES");
        } else if (harf.equalsIgnoreCase("n")) {
            System.out.println("NO");
        }else System.out.println("Kardesim yanlis karakter girdin");

    }// main sonu
}
