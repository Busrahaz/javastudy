package proje1_manav;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Odeme {
    static Scanner scan = new Scanner(System.in);
    public static void odeme() {
        if (Secimler.sepet.isEmpty()){
            System.out.println("Oncelikle alisveris yap sonra gel.");
            Secimler.secim();
        }else {
            System.out.println("Nasıl ödemek istersiniz?\n"
                    + "1 Kapıda nakit\n" + "2 Kredi kartı");
            int odeme = scan.nextInt();
            System.out.println("Sepet = "+Secimler.sepet);
            System.out.println("Toplam tutar = "+Secimler.toplamFiyat);
            if (odeme==1){
                System.out.println("Siparisiniz alinmistir.Tekrar bekleriz");
            }else if (odeme==2){
                scan.nextLine();
                System.out.println("Kartta yazan isim ve soyismi giriniz");
                String isim=scan.nextLine();
                for (int i = 0; i < 1; i++) {
                    System.out.println("Lutfen kart numaranizi giriniz");
                    String kartNo=scan.next();
                    if (kartNo.length()==16){
                        for (int j = 0; j < 1; j++) {
                            System.out.println("Kartinizin son kullanma tarihini giriniz. Ex:12-23");
                            String skt=scan.next();
                            YearMonth bugun=YearMonth.now();
                            DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MM-yy");
                            YearMonth girilen=YearMonth.parse(skt,formatter);
                            int bugunYil= bugun.getYear();
                            int bugunAy=bugun.getMonthValue();
                            int girilenYil=girilen.getYear();
                            int girilenAy=girilen.getMonthValue();
                            if (bugunYil==girilenYil){
                                if (bugunAy<girilenAy){
                                    getYil();
                                }else {
                                    System.out.println("Kartinizin suresi dolmus veya hatali girdiniz");
                                    j--;
                                }
                            } else if (bugunYil<girilenYil) {
                                getYil();
                            } else {
                                System.out.println("Kartinizin suresi dolmus veya hatali girdiniz");
                                j--;
                            }
                        }
                    }else {
                        System.out.println("Kart numaraniz hatali");
                        i--;
                    }
                }

            }
        }

    }

    public static void getYil(){
        for (int k = 0; k < 1; k++) {
            System.out.println("Lutfen kartin arka yuzundeki cvc kodunu giriniz");
            String cvc=scan.next();
            if (cvc.length()==3){
                System.out.println("Siparisiniz alindi. Tekrar bekleriz");
            }else {
                System.out.println("Cvc kodunuz hatali tekrar deneyiniz");
                k--;
            }
        }
    }
}