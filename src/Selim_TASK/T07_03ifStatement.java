package Selim_TASK;
import java.util.Scanner;
public class T07_03ifStatement {/*
   Task->
   Girilen not değeri için
              A => 90 ~100
              B => 80 ~ 89
              C => 70 ~ 79
              D => 60 ~ 69
              F =>  0 ~ 59
              sartlari aralik belirterek yaziniz

     Girilen saat değeri için
	 	0 ~12 ==> good morning
		12 ~ 15 ==> good afternoon
		15 ~ 23 ==> good night
		12 ==> good noon
		print eden code create ediniz.
    */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Notunu gir");
        int not= scan.nextInt();
        if (not>=0&&not<60){
            System.out.println("Notunuz F");
        } else if (not>=60&&not<70) {
            System.out.println("Notunuz D");
        } else if (not>=70&&not<80) {
            System.out.println("Notunuz C");
        } else if (not>=80&&not<90) {
            System.out.println("Notunuz B");
        } else if (not>=90&&not<=100) {
            System.out.println("Notunuz A");
        } else {
            System.out.println("Yanlis not girdin");
        }

    }

}
