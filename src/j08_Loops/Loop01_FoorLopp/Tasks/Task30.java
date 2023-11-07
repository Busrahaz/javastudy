package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task30 {

    public static void main(String[] args) {
        // task-> girilen iki tamsayı arasındaki tamsayıların toplamını print eden code create ediniz

        Scanner input = new Scanner(System.in);
        System.out.println("Gadın anam ele  birinci sayı gir : ");
        int sayi1 = input.nextInt();
        System.out.println("Gadın anam ele  ikinci sayı gir : ");
        int sayi2 = input.nextInt();
        int toplam = 0;

        for (int i = (sayi1 < sayi2 ? sayi1+1: sayi2+1); i < (sayi1 > sayi2 ? sayi1 : sayi2); i++) {
            toplam += i;
            System.out.println("toplam = " + toplam);
        }
        //  System.out.println("toplam = " + toplam);
    }
}
