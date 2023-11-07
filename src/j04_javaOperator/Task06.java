package j04_javaOperator;
import java.util.Scanner;
public class Task06 {
    public static void main(String[] args) {

        /*Task->
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin

         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8

         */
        Scanner input = new Scanner(System.in);
        System.out.print("gardaş hele bir 3 basamaklı sayı giresen : ");
        int sayı = input.nextInt();// 853

        int birlerBsmk = sayı % 10;//sayının birler basamgı son rakamı verir-> 3
        System.out.println("birlerBsmk = " + birlerBsmk);
        int yuzlerBsmk = sayı / 100;//sayının yüzler basamagı ilk rakamı verir->8
        System.out.println("yuzlerBsmk = " + yuzlerBsmk);

        int onlarBsmk = (sayı / 10) % 10;//sayının onlar basamgı->5
        System.out.println("onlarBsmk = " + onlarBsmk);


    }
}
