package j08_Loops.Loop03_DoWhileLoop;
import java.util.Scanner;
public class C02_doWhileLoop {
    public static void main(String[] args) {
        // task-> girilen sayı 13 den kucuk ise "olaaa kazandınız :) " değilse saysı girişi isteyen code create ediniz...


        Scanner input = new Scanner(System.in);
        int sayı;
        do {
            System.out.println("bir sayı giriniz : ");
            sayı = input.nextInt();
        }
        while (sayı >= 13);// sayının 13 den kucuk olmama sartı

        System.out.println(sayı + " için olaaaaa kazandınız :) ");


    }
}
