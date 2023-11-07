package Selim_TASK;
import java.util.Scanner;
public class T04_Modulus { public static void main(String[] args) {
    /*
     *  Girilen 5 basamakli tamsayinin ilk 2 ve son 2 basamagindaki rakamlari toplamini print eden code create ediniz.
     *
     *   Ex :
     *   input  : 14531
     *   output : 9
     */

    Scanner scan=new Scanner(System.in);
    System.out.println("Bes basamakli bir tam sayi gir");
    int sayi1=scan.nextInt();
    int ilk2=sayi1/1000;//14
    int son2=sayi1%100;//31
    int ilk2Toplam=(ilk2/10)+(ilk2%10);
    int son2Toplam=(son2/10)+(son2%10);

    System.out.println("girilen sayinin ilk ve son iki rakami toplami="+(ilk2Toplam+son2Toplam));
    int ilkBsm=(sayi1/10000);
    int ikinciBsm=((sayi1%10000)/1000);
    int dorduncuB=((sayi1%100)/10);
    int besinciB=(sayi1%10);
    int toplam=ilkBsm+ikinciBsm+besinciB+dorduncuB;
    System.out.println("toplam = " + toplam);
    System.out.println(sayi1%10000);
}
}

