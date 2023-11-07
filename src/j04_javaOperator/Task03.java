package j04_javaOperator;
import java.util.Scanner;
public class Task03 {
    public static void main(String[] args) {
        /* Task->
         * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
         */
        Scanner input = new Scanner(System.in);
        System.out.print("gardaş hele bir 3 basamaklı sayı giresen : ");
        int sayı = input.nextInt();// 853
        int sonRakam = sayı % 10;//sayının birler basamgı son rakamı verir-> 3
        System.out.println("sonRakam = " + sonRakam);
        int ilkRakam=sayı/100;//sayının yüzler basamagı ilk rakamı verir->8
        System.out.println("ilkRakam = " + ilkRakam);
        System.out.println(ilkRakam+sonRakam);
        System.out.println(" cincix code ");
        System.out.println(sayı % 10 + sayı / 100);
    }
}
