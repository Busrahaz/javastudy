import java.util.Scanner;

public class Diyet {
    static char cinsiyet;
    static int yas;
    static int boy;
    static int kilo;
    static double hareketSeviyesi;
    static double kitleIndex;
    static double bazalMetabolizmaHizi;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        bilgiAlma();
        vucutKitleIndexiHesaplama();
        bazalMetobolizmaHesaplama();
        kaloriMiktariHesaplama();
    }

    private static void kaloriMiktariHesaplama() {
        System.out.println("-----------------");
        if (kitleIndex<25){
            if (cinsiyet=='E'||cinsiyet=='e'){
                System.out.println("Gunluk almaniz gereken kalori miktari: "+(bazalMetabolizmaHizi*hareketSeviyesi));
            }else{
                System.out.println("Gunluk almaniz gereken kalori miktari: "+(bazalMetabolizmaHizi*hareketSeviyesi));
            }
        }else {
            double kadinA=bazalMetabolizmaHizi*hareketSeviyesi-500;
            double kadinB=bazalMetabolizmaHizi*hareketSeviyesi-750;
            double erkekA=bazalMetabolizmaHizi*hareketSeviyesi-500;
            double erkekB=bazalMetabolizmaHizi*hareketSeviyesi-750;
            if (kadinA<bazalMetabolizmaHizi&&kadinB<bazalMetabolizmaHizi){
                System.out.println("Gunluk almaniz gereken kalori miktari: "+bazalMetabolizmaHizi);
            } else if (erkekA<bazalMetabolizmaHizi&&erkekB<bazalMetabolizmaHizi) {
                System.out.println("Gunluk almaniz gereken kalori miktari: "+bazalMetabolizmaHizi);
            }else if (erkekA>bazalMetabolizmaHizi&&erkekB>bazalMetabolizmaHizi) {
                System.out.println("Gunluk almaniz gereken kalori miktari: "+erkekA+" "+erkekB);
            }else if (kadinA>bazalMetabolizmaHizi&&kadinB>bazalMetabolizmaHizi) {
                System.out.println("Gunluk almaniz gereken kalori miktari: "+kadinA+" "+kadinB);
            } else if (kadinB<bazalMetabolizmaHizi) {
                System.out.println("Gunluk almaniz gereken kalori miktari: "+bazalMetabolizmaHizi+" "+kadinA);
            }else if (erkekB<bazalMetabolizmaHizi) {
                System.out.println("Gunluk almaniz gereken kalori miktari: "+bazalMetabolizmaHizi+" "+erkekA);
            }
        }
    }

    private static void bazalMetobolizmaHesaplama() {
        System.out.println("----------------");
        if (cinsiyet == 'E' || cinsiyet == 'e') {
            bazalMetabolizmaHizi = (10 * kilo) + (6.25) - (5 * yas) + 5;
        } else if (cinsiyet == 'K' || cinsiyet == 'k') {
            bazalMetabolizmaHizi = (10 * kilo) + (6.25 * boy) - (5 * yas) - 161;
        }
        System.out.println("Bazal metobolizma hiziniz : "+bazalMetabolizmaHizi);
    }

    private static void vucutKitleIndexiHesaplama() {
        System.out.println("---------------");
        double metre= (double) boy /100;
        kitleIndex=kilo/(metre*metre);
        String bos="";
        if (kitleIndex<=18.4) bos="Zayif";
        else if (kitleIndex<=24.9) {
            bos="Normal";
        } else if (kitleIndex<=29.9) {
            bos="Fazla Kilolusunuz";
        } else if (kitleIndex<=34.9) {
            bos="I.sinif obezite";
        } else if (kitleIndex<=44.9) {
            bos="II.Sinif obezite";
        }else bos="III.Sinif obezite";

        System.out.println("Vucut kitle indexiniz : "+kitleIndex+" "+bos);
    }

    private static void bilgiAlma() {
        System.out.println("Cinsiyetiniz nedir: ");
        System.out.println("Erkek : E");
        System.out.println("Kadin : K");
        cinsiyet=scan.next().charAt(0);
        System.out.println("----------------");
        System.out.println("Yasinizi giriniz");
        yas=scan.nextInt();
        System.out.println("----------------");
        System.out.println("Boyunuzu cm cinsinden giriniz. Ornek:180");
        boy=scan.nextInt();
        System.out.println("----------------");
        System.out.println("Kilonuzu giriniz");
        kilo=scan.nextInt();
        System.out.println("----------------");
        System.out.println("Lutfen hareket seviyenizi giriniz");
        System.out.println("1 - Masa basi is / cak az - Hareketsiz: \n" +
                "2 - Az Aktif / haftada 1-2 egzersiz : \n" +
                "3 - Orta Aktif / haftada 3-5 egzersiz: \n" +
                "4 - Cok aktif / haftada 6-7 agir egzersiz: \n" +
                "5 - Cok agir egzesiz agir is: \n seciniz");
        int i=scan.nextInt();
        switch (i){
            case 1:hareketSeviyesi=1.2;break;
            case 2:hareketSeviyesi=1.3;break;
            case 3:hareketSeviyesi=1.55;break;
            case 4:hareketSeviyesi=1.7;break;
            case 5:hareketSeviyesi=1.9;break;
            default:
                System.out.println("gecerli bir deger giriniz");
                break;
        }
    }
}
