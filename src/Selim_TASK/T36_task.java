package Selim_TASK;
import java.util.Scanner;
public class T36_task { /* Interview Question
    girilen bir stringi tersine çeviren bir code yazın.
    For döngüsünü kullanın ve reversString adında bir yöntem oluşturun */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cumle gir");
        String cumle=scan.nextLine();
        String tersString="";
        for (int i = cumle.length()-1; i >=0 ; i--) {
            tersString+=cumle.charAt(i);
        }

        System.out.println("tersString = " + tersString);

        for (int i = cumle.length()-1; i >=0 ; i--) {
            System.out.print(cumle.charAt(i));
        }

    }
}
