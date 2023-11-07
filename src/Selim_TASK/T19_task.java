package Selim_TASK;
import java.util.Scanner;
public class T19_task {
    public static void main(String[] args) {
		/*
		Task-> Girilen ay simine göre   ayin kac cektigini print eden code create ediniz.
		 */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir ay ismi gir");
        String ay=scan.next();

        switch (ay){
            case "ocak":
            case "mart":
            case "mayis":
            case "temmuz":
            case "agustos":
            case "ekim":
            case "aralik":
                System.out.println("31 ");
                break;
            case "nisan":
            case "haziran":
            case "eylul":
            case "kasim":
                System.out.println("30");
                break;
            case "subat":
                System.out.println("Bir yil gir");
                int yil= scan.nextInt();
                if(yil%4==0&&(yil%100!=0||yil%400==0)){
                    System.out.println("29");
                }else System.out.println("28");
                break;
            default:
                System.out.println("Ay ismi gir kardesim");
                break;
        }
    }
}
