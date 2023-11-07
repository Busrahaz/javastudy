package Selim_TASK;
import java.util.Scanner;
public class T24_task {
    /* Task->
     * Girilen  bir kelime 3 ve daha fazla harfden olusuyorsa son
     * iki harfini 3 kere yan yana  degil ise girilen kelimeyi print eden code create ediniz.
     *
     * ornek
     * input = Ali
     * output = lilili
     *
     * input = el
     * output = el
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir kelime gir");
        String kelime=scan.next();
        if (kelime.length()>=3){
            String sonIki=kelime.substring(kelime.length()-2);
            System.out.println(sonIki+sonIki+sonIki);
        }else System.out.println(kelime);
    }
}
