package j08_Loops.Loop02_WhileLoop;
import java.util.Scanner;
public class C03_WhileLoop {
    public static void main(String[] args) {
        // task-> girilen tamsayının pozitif tam bolen sayısını print eden code create ediniz...
        // 20 -> 1,2,4,5,10,20: 20'nin 6 tane tam böleni var
        // 30 -> 1,2,3,5,6,10,15,30: 30'un 8 tane tam böleni var

        Scanner input =new Scanner(System.in);
        System.out.println("bir sayı giriniz : ");
        int girilenSayi=input.nextInt();
        int  sayac=0;
        int tamBolenSayi=1;
        while (tamBolenSayi<=girilenSayi){


            if (girilenSayi%tamBolenSayi==0){// girilen sayının tambolensayıya tam bolme sartı tanımlandı
                sayac++;
                System.out.println(tamBolenSayi);
            }

            tamBolenSayi++;
        }

        System.out.println("girilen sayı : "+girilenSayi+" nın "+sayac+" kadar tam boleni var");

    }
}
