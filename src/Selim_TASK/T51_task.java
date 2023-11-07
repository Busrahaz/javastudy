package Selim_TASK;
import java.util.Scanner;
public class T51_task {
    public static void main(String[] args) {

        // task-> girilen  bir char karakterden sonra gelen 10 karakteri prin eden code create ediniz

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir karakter gir");
        char krt=scan.next().charAt(0);
        for (int i = 1; i <=10 ; i++) {
            System.out.print( (char)(krt+i)+" ");
        }
    }
}
