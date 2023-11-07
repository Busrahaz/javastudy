package j10_MethodCreation.Tasks;

import java.util.Scanner;
public class Task04 {//amale köyden ırgat çağıran şeher
    /*
        Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir
         ATM app. code create ediniz
         */
        static Scanner input = new Scanner(System.in);
         static int bakiye = 1000;

        public static void main(String[] args) {System.out.println("Hoşgeldiniz");

            while (true) {
                bankaIslem();
                int islemNo = input.nextInt();
                if (islemNo == 4) {
                    System.out.println("Hoşçakalın");
                    break;
                }
                bankaSecim(islemNo);
            }
        }

    private static void bankaIslem() {
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz:");
        System.out.println("1 - Para çekme");
        System.out.println("2 - Para yatırma");
        System.out.println("3 - Bakiye sorgulama");
        System.out.println("4 - Çıkış");
    }

    private static void bankaSecim(int islemNo) {
        switch (islemNo) {
            case 1:
                System.out.println("Çekmek istediğiniz miktarı giriniz: ");
                int eksilen = input.nextInt();
                if (eksilen <= bakiye) {
                    System.out.println("İşleminiz başarı ile gerçekleştirilmiştir.");
                    bakiye = bakiye - eksilen;
                } else {
                    System.out.println("Bakiye yetersiz.");
                }
                break;

            case 2:
                System.out.println("Yatırmak istediğiniz miktarı giriniz: ");
                int yatan = input.nextInt();
                bakiye = bakiye + yatan;
                System.out.println("İşleminiz başarı ile gerçekleştirilmiştir.");
                System.out.println("yeni bakiye = " + bakiye+" tl dir");
                break;

            case 3:
                System.out.println("Bakiyeniz = " + bakiye + " TL'dir");
                break;

            default:
                System.out.println("Geçersiz işlem numarası.");
        }
    }
}



