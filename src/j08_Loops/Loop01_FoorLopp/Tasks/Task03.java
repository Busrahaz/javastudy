package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // task-> girilen sayının faktöriyelini print code create ediniz
        //falan faktöriyel=1'den falana kadar tamsayıların çarpımı->1*2*3*...*falan
        Scanner input= new Scanner(System.in);
        System.out.println("sayi gir");
        int sayi= input.nextInt();
int faktoriyel=1;

        for (int i = 1; i <= sayi; i++) {
             faktoriyel=faktoriyel*i;

        }
        System.out.println("sayinin faktoriyeli = " + faktoriyel+"dir");

    }
}
