package Selim_TASK;
import java.util.Scanner;
public class T08_04ifstatement { /*
​
		task->
		Kullanicinın  yas ve kilo bilgileri için
		18 yasindan kucuk ise kan bagisi yapamaz.
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 ve 50 kilodan agir ise kan bagisi yapabilir.
		print eden code create ediniz.
​
		 */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Yasini gir ");
        int yas= scan.nextInt();
        if (yas>=18){
            System.out.println("Kilonu gir");
            double kilo=scan.nextDouble();
            if (kilo>0&&kilo<50){
                System.out.println("Kilon tutmadi kan veremezsin");
            }else if(kilo>=50){
                System.out.println("Kan verebilirsin");
            }else System.out.println("Kilo eksi deger alamaz");
        }else System.out.println("Yasin yetmedi kan veremezsin");

    }
}
