package Selim_TASK;
import java.util.Scanner;
public class T43_task { public static void main(String[] args) {
           /*
        task-> girilen boyutta aşağıdaki şekli  print eden code create ediniz
          Örnek Ekran çıktısı
​
      *
      * *
      * * *
      * * * *
      * * * * *
      * * * *
      * * *
      * *
      *
​
         */
    Scanner scan=new Scanner(System.in);
    System.out.println("Bir sayi gir");
    int boyut= scan.nextInt();
    for (int i = 1; i <=boyut ; i++) {
        for (int j = 1; j <=i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    for (int i = boyut-1; i >=1 ; i--) {
        for (int j = 1; j <=i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }

}
}
