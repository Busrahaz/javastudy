package Selim_TASK;
import java.util.Scanner;
public class T11_NestedTernary {/*  Task
     Girilen Final için
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri..
    print eden code create ediniz.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Notunuzu giriniz");
        char not=scan.next().toUpperCase().charAt(0);
        System.out.println(not=='A'?"Gayet basarili":not=='B'?"Basarili":not=='C'?"Ha gayret":"Seneye gorusuruz");
    }
}
