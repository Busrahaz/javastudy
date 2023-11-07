package j03_scannerclass;
import java.util.Scanner;
/*Task->
 * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
 * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
 */
public class Task08 {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);//kullanıcı veriei alacak scanner obj tanımlandı
        System.out.print("Gakkom hele vize1 girisin : ");
    int vize1 = input.nextInt();

        System.out.print("Gakkom hele vize2 girisin : ");
    int vize2 = input.nextInt();

        System.out.print("Gakkom hele final girisin : ");
    int fnal = input.nextInt();
    double gecmeNotu = ((vize1 + vize2) / 2) * 0.3 + fnal * 0.7;
        System.out.println("gecmeNotu = " + gecmeNotu);
}

}