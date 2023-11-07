package j06_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
        // TASK-> Girilen haftanın gününü hafta içi veya sonu oldugunu print eden code create ediniz..
        Scanner input = new Scanner(System.in);
        System.out.print("Gakkom ele bi gun  gir : ");
        String gun = input.next().toLowerCase();//girilen gun CaRSamba->carsamba:kilitte(case) kucuk olan karaktere gun cevirdim
        switch (gun) {
            case "pazartesi":
            case "salı":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("girilen gun HAFTAİÇİ");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("girilen gun HAFTASONU");
                break;
            default:
                System.out.println("hatalı giriş yaptınız ");


        }
    }
}