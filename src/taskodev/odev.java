package taskodev;
import java.util.Locale;
import java.util.Scanner;
public class odev {/* Iki kisinin oynayacagi bir kelime oyunu app. create ediniz.
 * Kurallar
 * 1- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
 *
 * 2- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
 *      * Eger kelimeyi kabul ederse onceki oyuncuya kelimedeki harf sayisi kadar puan ekleyin
 *        ve 3.adima gecin
 *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve onceki oyuncunun
 *        kazandigini yazip oyunu bitirin
 *
 * 3- yeni oyuncuya oyuna devam etmek isteyip istemedigini sorun
 *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
 *          basa mi sona mi ekleyecegini sorun
 *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
 *
 *      *   Devam etmek istemezse
 *          "Oyun bitti" yazin
 *          oyuncuların puanlarini ve kazanan oyuncuyu print ediniz.

 */
    static Scanner input=new Scanner(System.in);
static String kelime="";
static String yeniKelime="";
static String devam="";
static int oyuncu1P=0;
static int oyuncu2P=0;

    public static void main(String[] args) {
                    baslangic();



        System.out.print("2. oyuncu kelimeyi kabul ediyormusun. evet / hayir");
        String cevap= input.nextLine();

        if (cevap.equals("evet")) {

            birinciBolum(cevap,kelime);
            ikinciBolum(devam,yeniKelime,kelime);


        }else sonBolum(cevap);




    }

    private static void baslangic() {
        System.out.print("bir kelime gir");
        String kelime= input.nextLine();
    }

    private static void ikinciBolum(String devam,String yeniKelime, String kelime) {

        System.out.println("devam etmek istermisin");
         devam= input.next().toLowerCase();

        if (devam.equals("evet")) {

            System.out.println("bir kelime giriniz");
            yeniKelime=input.next();
            System.out.println("kelimeyi basa mi sona mi eklemek istersin");
            String ekle= input.next().toLowerCase().substring(0,1);
            if (ekle.equals("b")) {
                System.out.println(kelime+yeniKelime);

            }else System.out.println(yeniKelime+kelime);



        }

    }

    private static void sonBolum(String cevap) {

            System.out.println("gecersiz kelime" +" oyunu 1. oyuncu kazanmistir ");


    }

    private static void birinciBolum(String cevap, String kelime) {


            oyuncu2P = kelime.length() + oyuncu2P;
            System.out.println("2. oyuncunu puani ="+oyuncu2P);


        }
    }


