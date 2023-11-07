package taskodev;
import java.util.Scanner;

public class kelimeOyunu {



    static Scanner input = new Scanner(System.in);
    static String kelime = "";
    static String yeniKelime = "";
    static String devam = "";
    static int oyuncu1P = 0;
    static int oyuncu2P = 0;
    static String cevap="";

    public static void main(String[] args) {
        baslangic();
        kabulMu();



        if (cevap.equals("evet")) {
            birinciBolum(cevap, kelime);


                ikinciBolum();
                devamMi();

                while (devam.equals("evet")) ikinciBolum();
                sonBolum();



        } else {
            sonBolum();
        }
    }

    private static String kabulMu() {
        System.out.print("2. oyuncu kelimeyi kabul ediyor musun? evet / hayır: ");
        return cevap= input.nextLine().toLowerCase();
    }

    private static void devamMi() {
        System.out.print("Devam etmek ister misin? evet / hayır: ");
        devam = input.nextLine().toLowerCase();
    }

    private static void baslangic() {
        System.out.print("Bir kelime giriniz: ");
        kelime = input.nextLine();
    }

    private static void ikinciBolum() {
        System.out.print("Bir kelime giriniz: ");
        yeniKelime = input.nextLine();

        System.out.print("Kelimeyi başa mı, sona mı eklemek istersiniz? b/s: ");
        String ekle = input.nextLine().toLowerCase().substring(0, 1);
      oyuncu2P=yeniKelime.length()+oyuncu2P;
        if (ekle.equals("b")) {
            kelime = yeniKelime + kelime;
        } else {
            kelime = kelime + yeniKelime;
        }
        kabulMu();
        System.out.println("Yeni kelime: " + kelime);
        System.out.println(oyuncu2P+"=2. oyuncunun puani");
        System.out.println("oyuncu2P = " + oyuncu2P);
        devamMi();


    }

    private static void sonBolum() {
        System.out.println("Oyun bitti. Puanlar:");
        System.out.println("1. Oyuncu: " + oyuncu1P);
        System.out.println("2. Oyuncu: " + oyuncu2P);
        if (oyuncu1P > oyuncu2P) {
            System.out.println("1. Oyuncu kazandı!");
        } else if (oyuncu2P > oyuncu1P) {
            System.out.println("2. Oyuncu kazandı!");
        } else {
            System.out.println("Berabere!");
        }
    }

    private static void birinciBolum(String cevap, String kelime) {
        oyuncu2P = kelime.length() + oyuncu2P;
        System.out.println("2. oyuncunun puanı: " + oyuncu2P);
    }
}