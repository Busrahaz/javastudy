package j08_Loops.Loop02_WhileLoop;
import java.util.Scanner;
public class C01_WhileLoop {
    public static void main(String[] args) {
        /*
Başlangıç bitiş ve değişim değerleri net  bilinen tekrarlarda for loop ama adım sayısı değişim değeri
net bilinmeyen belli bir şarta(durum-boolean) bağlı olan tekrarlara while loop kullanılır.
 */
//Task01-> 3'den 20'ye kadar olan tamsayıları print eden code create ediniz.
        //  System.out.println("   ***   for Loop   ***   ");
        //  for (int i = 3; i <= 20; i++) {
        //      System.out.print(i + " ");
        //  }
        //  System.out.println("\n   ***   while Loop   ***   ");
        //  int basla = 3;//whle loop başlangıç değeri
        //  while (basla <= 20) {//basla değeri <=20 oldugu surece action alacak lopp:tekrar tanımlandı
        //      System.out.print(basla + " ");// 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
        //      basla++;// while loop condition için değişim komutu tanımlandı
        //  }

        // task02-> 7 kere javaCAN print eden code create ediniz
        // System.out.println("   ***   Task02   ***   ");

        // System.out.println("   ***   for Loop   ***   ");
        // for (int i = 1; i <= 7; i++) {
        //     System.out.print("javaCAN ");
        // }

        // System.out.println("\n   ***   while Loop   ***   ");

        //  int tekrar = 7;
        // int tekrar = 1;
        //  while (tekrar <= 7) {
        //      System.out.print("javaCAN ");
        //      tekrar++;
        //  }
        //  while (tekrar >= 1) {
        //      System.out.print("javaCAN ");
        //      tekrar--;
        //  }
        // task03->2 basamaklı tek sayıları print eden code create ediniz
        //   System.out.println("   ***   Task03   ***   ");
        //   int tekrar = 11;
        //   while (tekrar <= 99) {
        //       if (tekrar%2==1){
        //           System.out.print(tekrar + " ");
        //       }
        //       tekrar ++;
        //   }
        // task04->bir basamaklı sayma sayılarını aynı satırda print eden code create ediniz
        // System.out.println("   ***   Task04   ***   ");
        // int a = 1;
        // while (a <= 9) {
        //     System.out.print(a + " ");
        //     a++;
        // }
        // task05->girilen ifadeyi tersten  print eden code create ediniz
        // System.out.println("   ***   Task05   ***   ");


        Scanner input = new Scanner(System.in);
        // System.out.println("Agam bişeyler giresen : ");
        // String str = input.nextLine();// javaCAN->NACavaJ

        // int strHarfSayisi = str.length();

        // while (strHarfSayisi > 0) {// str 'nin karakter sayısı bitene kadar loop tanımlandı

        //     System.out.print(str.charAt(strHarfSayisi - 1));
        //     int yas = 48;
        //     String name = "ali";
        //     strHarfSayisi--;
        // }
        // task06->girilen pozitif  tamsayıya kadar sayıların toplamını  print eden code create ediniz
        // System.out.println("   ***   Task06   ***   ");

        System.out.println("Agam bi sayı giresen : ");
        int sayi = input.nextInt();

        // int toplam = 0;//bos kutu

        // while (sayi > 0) {// sayı 1 olana dek body ne diyorsa yap tekrarı yanımlandı

        //     toplam += sayi;//sayıyı surekli toplam kutusuna ekle

        //     sayi--;// sayısyı her döngude bir azalt
        // }
        // System.out.println("agaya selam");
        // System.out.println("toplam = " + toplam);
        // task07->girilen tamsayının faktöriyelini  print eden code create ediniz -> 5!=5*4*3*2*1
        System.out.println("   ***   Task07   ***   ");

        int factorial = 1;
        while (sayi > 0) {// sayı sfırdan buyuk oldugu surece: sayı 1 olana kadar body ne diyorsa yap tekrarı tanımlandı
            factorial *= sayi;
            sayi--;
        }

        System.out.println("faktöriyel = " + factorial);

    }
}
