package Selim_TASK;
import java.util.Scanner;
public class T09_NestedIfStatement {

/* Task->
       Girilen  yas data için
            oy kullanma yasi :
             age >= 18  ==> oy kullanmaya uygun
             age >= 70  ==> uc kez oy kullanabilir
             70 > age >=50 ==> iki kez oy kullanabilir
             50 > age >=18 ==> bir kez oy kullanabilir,
             print eden code create ediniz...
         */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Yasini gir ");
        int yas= scan.nextInt();
        if (yas>=18){
            if (yas<50) System.out.println("Bir defa oy kullanabilirsin");
            else if (yas<70) {
                System.out.println("Iki defa oy kullanabilirsin");
            }else System.out.println("Uc defa oy kullanbilirsin");
        }else System.out.println("Yasin oy kullanmaya uygun degil");

    }// main sonu
}