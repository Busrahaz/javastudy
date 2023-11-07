package j06_SwitchStatement;

import java.util.Scanner;

public class C02_SwitchCase {
    public static void main(String[] args) {
        // Task-> Girilen ay numarasına göre ayın isimini print eden code create ediniz.
        Scanner input = new Scanner(System.in);
        System.out.print("Gakkom ele bi AY numarası gir : ");
        int ayNo = input.nextInt();

        switch (ayNo) {//switch blok
            default://switch hiç bir case için çalışmazsa default çalışır
                // defaılt -> case içinde herhangi bir yere yazılabilir run sırası yazım sırasına bakmaz
                System.out.println("canını yiyim adam gibin bişey gir hele");
                break;

            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("subat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayıs");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("ağustos");
                break;
            case 9:
                System.out.println("eylül");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasım");
                break;
            case 12:
                System.out.println("aralık");
                break;


        }
        System.out.println("Gakkom code cincix DEWAMKEEE :)");
    }
}