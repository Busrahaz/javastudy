package Selim_TASK;
import java.util.Scanner;
public class T25_task {

    /* Task->
     * Girilen 4 kelime  cumle haline getirip sonunda . ile print eden code create ediniz.
     *
     * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
     *         Output : Cesaret insana sinirlarini ogretir.
     *
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Dort kelime gir");
        String kelime1=scan.next();
        String kelime2=scan.next();
        String kelime3=scan.next();
        String kelime4=scan.next();
        String sonKelime=kelime1.substring(0,1).toUpperCase()+kelime1.substring(1)+" "
                +kelime2+" "+kelime3+" "+kelime4+".";
        System.out.println("sonKelime = " + sonKelime);
    }
}
