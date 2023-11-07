package j03_scannerclass;

import java.util.Scanner;

public class C01_ScannerClass {

        //Scanner bir Java Class'idir, bu Class'i kullanabilmek icin "import" edilmeli.
        //Scanner Class'i Java nin util kutuphanesindedir.

        // kullanıcıdan veri almak içinn şu adım takip edilir
        //1. adım-> Scanner class'dan obj create edilir.

        //  Scanner input = new Scanner(System.in);// Scanner classından input isminde değerini System içinden alan bir obj.

        //  // 2 adım->Kullanıcıdan istenen veri için bildirimde bulunulur->sout("...");
        //  System.out.print("adınızı giriniz :");

    //  // 3. adım-> kulanıcının girdigi veri data type'ne göre bir variable atanır.
    public static void main(String[] args) {
        // task-> kullanıcının girdigi değere göre karenin alanını print eden code create ediniz

        //1 adım Scanner obj
        Scanner input = new Scanner(System.in);//Scanner input obj tanımlandı

        // 2. adım bildirimde bulunmaı
        // System.out.print("Agsam karesini alacagın kenarı giresen : ");
        // // 3. adım kullanıcının girişi uygun bir variable ata
        // int kenarUzunluk = input.nextInt();// kullanııcdan gelen data int e atandı
        // System.out.println("kenarUzunluk = " + kenarUzunluk);
        // int kareAlanı = kenarUzunluk * kenarUzunluk;
        // System.out.println("kareAlanı = " + kareAlanı);
        // // System.out.println("Aganın karewsini alanı = "+kenarUzunluk*kenarUzunluk);//
        // System.out.println(kareAlanı / 2);//

        /*
         Task->
         Kullanicinın  gunde içtiği  cay ve kullandığı  seker değerine göre
         Bir yilda kac kg seker kullandigini hesaplayan bir code create ediniz...
         1 seker = 1.7 gr
         Ornek : Input : cay sayisi : 10 seker sayisi :
                 Output : Yilda 12.41 kg seker kullaniyorsunuz
         */

        // 1 adım Scanner obj->23 . satır input obj var dublicate için tekrar tanımlanmaz input call edilir
        // 2. adım bildirim-> gunluk cay tuketimi için
        System.out.print("bizim ooolan günde kaç bardak çay iceyong :");
        // 3. adım kullanıcı girişi değişkene atanacak-> gunluk cay tuketimi için
        int gunlukCaySayısı = input.nextInt();

        // cay basına şeker kullanımı için

        // 2. adım şeker için bildirim
        System.out.print("bizim oolan caya kaç seker atıyon : ");
        // 3 . adım şeker girişi değişkene atandı
        int sekerSayısı = input.nextInt();


        System.out.println("Yıllık seker tuketiminiz : " + ((gunlukCaySayısı * sekerSayısı * 1.7 * 365) / 1000) + " kg'dır");


    }
}