package Selim_TASK;
import java.util.Scanner;
public class T10_ternary {
    /* Task->
     * Girilen fiyat için
     * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
     * print eden code create ediniz
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Fiyat giriniz");
        double fiyat= scan.nextDouble();
        System.out.println((fiyat>=0&&fiyat<10)?"ucuz":(fiyat>=10&&fiyat<20)?"normal":"pahali");
        String sonuc=(fiyat>=0&&fiyat<10)?"ucuz":(fiyat>=10&&fiyat<20)?"normal":"pahali";
        System.out.println(sonuc);
    }
}
