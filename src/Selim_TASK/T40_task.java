package Selim_TASK;
import java.util.Scanner;
public class T40_task {

    /*Task->
     Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
     ve x girildiğinde ise "Program bitti" print eden code create ediniz
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        char c;
        do {
            System.out.println("Bir karakter giriniz");
            c=scan.next().charAt(0);
            if (c!='x') System.out.println("Program calisiyor");
            else System.out.println("Program bitti");
        }while (c!='x');

    }
}
