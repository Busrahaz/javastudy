package j03_scannerclass;

public class C02_typeCasting {/*
           Type Casting: Bir numeric data type'ini diger numeric data type'ina cevirme işlemidir.
                         byte < short < int < long < float < double
           Note 1: Kucuk data type'ini buyuk data type'ine cevirmeye "Auto Widening" denir
           Note 2: Buyuk data type'ini kucuk data type'ine cevirmeye "Explicit Narrowing" denir.
       */
    public static void main(String[] args) {

        boolean basarılı = true;
        System.out.println("basarılı = " + basarılı);// true

        String success = String.valueOf(basarılı);//Wrapper Class
        System.out.println("success = " + success);// true
        //   success = basarılı; -> doğal uyum olmadıgı için CTE
        double sayi1 = 74;
        System.out.println("sayi1 = " + sayi1);//sayi1 = 74.0 -> AW
        int sayı2 = 60;
        int sayı3 = 22;
        System.out.println("sayı2/sayı3 = " + sayı2 / sayı3);// 2 -> AW
        /*
        Java'da iki int değer bolunduğunde sonuç mutlaka int verir.
        Yanı bolme sonucu ondalıklı olsa bile AW yaparak int casting
         */
        byte b = 15;
        int num = b;// k->b AW
        int i = 1453;
        double d = i;// k->b AW
        System.out.println("d = " + d);//d = 1453.0
        double d1 = d / sayı2;
        System.out.println("d1 = " + d1);//d1 = 24.216666666666665
        // ahan da Trick-> iki farklı dta type işleme girerse  AW(k data b dataya casting : veri kaybını önleme-> ucaklar düşmesin)
        // işlem sonucu buyuk data type olarak verilir


        double d2 = 14.53;
        System.out.println("d2 = " + d2);//d2 = 14.53

        int num2 = (int) d2;// Expc. narrow b->k casting
        System.out.println("num2 = " + num2);// num2 = 14

        double d3 = 571.622;
        System.out.println("d3 = " + d3);//d3 = 571.622
        long l = (long) d3;
        System.out.println("l = " + l);// l = 571

    }

}
