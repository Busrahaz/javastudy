package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
// task-> girilen iki tamsayı arasındaki çift sayıları print eden code create ediniz...

Scanner input= new Scanner(System.in);
        System.out.println("bir sayi giriniz");
       int sayi1= input.nextInt();
        System.out.println("diger sayiyi giriniz");
        int sayi2= input.nextInt();

        for (int i=(sayi1<sayi2?sayi1:sayi2); i<(sayi1>sayi2?sayi1:sayi2); i++){
            System.out.println(i%2==0?i+"":"");;

    }
}
}