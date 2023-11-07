package Selim_TASK;
import java.util.Scanner;
public class T02_ScannerClass {public static void main(String[] args) {
    //  Girilen yaricap değeri için cemberin cevresini ve dairenin alanini print eden code create ediniz. (pi =3.14)
    Scanner scan=new Scanner(System.in);
    System.out.print("Bir yaricap degeri giriniz");
    int yaricap=scan.nextInt();
    double pi=3.14;
    System.out.println("Cemberin cevresi ="+(yaricap*2*pi)+"\n"+"Darenin alani ="+(pi*(yaricap*yaricap)));

}
}
