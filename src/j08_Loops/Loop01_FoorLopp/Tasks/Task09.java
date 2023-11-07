package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
           /*
        task-> girilen boyutta aşağıdaki şekli  print eden code create ediniz
          Örnek Ekran çıktısı
      *
      * *
      * * *
      * * * *

         */
        Scanner input = new Scanner(System.in);
        System.out.print("agam boyut giresen : ");
        int boyut = input.nextInt();
        for (int kat = 1; kat <= boyut; kat++) {//kat tekrarı
            for (int daire = 1; daire <= kat; daire++) {//daire tekrar
                System.out.print("* ");
            }
            System.out.println();//dummy
        }
    }
}
