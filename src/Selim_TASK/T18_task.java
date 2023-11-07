package Selim_TASK;
import java.util.Scanner;
public class T18_task {
    public static void main(String[] args) {
        /*
          TASK -> girilen bir karakterin harf  olup olmadığını  kontrol eden code create ediniz..

         */

    Scanner scan=new Scanner(System.in);
    System.out.println("Bir karakter giriniz");
    char karakter=scan.next().charAt(0);
    if ((karakter>='A'&&karakter<='Z')||(karakter>='a'&&karakter<='z')) System.out.println(karakter+" bir harftir");
    else System.out.println(karakter+" bir harf degildir");

}
}
