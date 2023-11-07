package Selim_TASK;
import java.util.Scanner;
public class T42_task {public static void main(String[] args) {
    // task-> girilen sayının faktöriyelini print code create ediniz
    //falan faktöriyel=1'den falana kadar tamsayıların çarpımı->1*2*3*...*falan

    Scanner scan=new Scanner(System.in);
    System.out.println("Bir sayi gir");
    int sayi= scan.nextInt();
    int faktoriyel=1;
    for (int i = sayi; i >=1 ; i--) {
        faktoriyel*=i;
    }
    System.out.println("faktoriyel = " + faktoriyel);

    int factorial = 1;
    while (sayi > 0) {
        factorial *= sayi;
        sayi--;
    }

    System.out.println("faktöriyel = " + factorial);

}
}
