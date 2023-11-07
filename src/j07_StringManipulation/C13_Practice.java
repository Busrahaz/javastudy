
package j07_StringManipulation;

import java.util.Scanner;

public class C13_Practice {
    public static void main(String[] args) {
        /*
        Task->  girilen bir password için aşagıdaki şartları sağlarsa "gayet başarılı DEWAMKEEE :)"
        sağlamazsa "Çok başarısız :( agam yeni paaword giresen" print eden code create ediniz.
        1-en az 8 karakter uzunlugunda,
        2-ilk harf buyuk,
        3-son harf kucuk,
        4-boşluk içermemeli
         */
        Scanner input = new Scanner(System.in);
        System.out.print("canını yiyim ele bir password giresen : ");
        String password = input.nextLine();

        if (
                password.length() >= 8 &&//password karaktersaysı enaz 8 sartı-> 1.sart
                        Character.isUpperCase(password.charAt(0)) &&//ilk karakter buyuk sartı-> 2. sart
                        Character.isLowerCase(password.charAt(password.length() - 1)) &&// son karakter kucuk sartı
                        !password.contains(" ")//" " içermeme sartı

        ) {
            System.out.println("gayet başarılı DEWAMKEEE :)");
        } else System.out.println("Çok başarısız :( agam yeni password giresen");

    }
}



