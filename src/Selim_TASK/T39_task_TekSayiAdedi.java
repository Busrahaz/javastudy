package Selim_TASK;
import java.util.Scanner;
public class T39_task_TekSayiAdedi {/* Task->
    Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ve adedini print eden code create ediniz.

            */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi gir");
        int sayi= scan.nextInt();
        int count=0;
        System.out.println("**For ile");
        for (int i = sayi; i >=1 ; i--) {
            if (i%2==1){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println();
        System.out.println("***While ile***");
        int count1=0;
        while (sayi>0){
            if (sayi%2==1){
                System.out.print(sayi+" ");
                count1++;
            }
            sayi--;
        }

        System.out.println("\ncount = " + count);
        System.out.println("count = " + count1);
    }
}
