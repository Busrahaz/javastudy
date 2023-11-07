package Selim_TASK;
import java.util.Scanner;
public class T49_task {
    /*
             *
            * *
           * ! *
          * ! ! *
         * ! ! ! *
        * ! ! ! ! *
       * ! ! ! ! ! *
      * * * * * * * *
      şekli print eden code create ediniz.
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("satir gir");
        int satir= scan.nextInt();
        for (int i = 1; i <=satir ; i++) {
            for (int j = satir; j >=i ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                if (j==1||j==i||i==satir){
                    System.out.print("* ");
                }else System.out.print("! ");
            }
            System.out.println();
        }

    }

}
