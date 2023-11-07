package j07_StringManipulation;

public class C13_ValueOf_parse {
    public static void main(String[] args) {
          /*
         Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
         Stringlerle matematiksel islemler yapabilmemizi saglar.

        valueOf(); meth hem Integer wrapper  hem de String Class'da bulunur. Integer wrapper Class
         valueOf() methdou String'i integer'a  String Class valueOf() methodu integer'i String'e cevirir.
         */

        // task -> string type verilen iki adet bagıs miktarını toplayan code create ediniz..
        String b1 = "10000";
        String b2 = "12000";
        System.out.println("bağis toplamı :" + (b1 + b2));//22000->1000012000 :(


        int yeniB1 = Integer.valueOf(b1);//Sring olan b1 integer'e cevirilerek int data type atandı
        int yeniB2 = Integer.valueOf(b2);//Sring olan b2 integer'e cevirilerek int data type atandı
        System.out.println("bağis toplamı :" + (yeniB1 + yeniB2));//22000-> :)
        int yas = 48;//ilkel primitve data
        Integer age = 48;// non-primitive->wrapper Class data type


        int tc = 987654321;
        String strTc = String.valueOf(tc);// int tanımlanan tc String data type atandı
        System.out.println("tc = " + tc);// 987654321
        System.out.println("strTc = " + strTc);// 987654321
        System.out.println("tc+strTc = " + (tc + strTc));//  987654321
        /*
    Task-> String strA="$13.99"  String strB="$17.55" parse method kullanarak strA+strB toplamını print den code create ediniz
       output: strA+strB=31.54
         */
        String strA = "$13.99";
        String strB = "$17.55";

        //  int yeniA =  Integer.valueOf(strA);// RTE NumberFormatException
        //  int yeniB =  Integer.valueOf(strB);// RTE NumberFormatException

        double yeniA = Double.parseDouble(strA.substring(1));
        double yeniB = Double.parseDouble(strB.substring(1));
        System.out.println("yeniA+yeniB = " + (yeniA + yeniB));// 31.54

        double yeniAA = Double.parseDouble(strA.replaceAll("\\D", ""));// D-> rakam hariç tum karakterler($ .) "" hiçliğe replace yapıldı
        double yeniBB = Double.parseDouble(strB.replaceAll("\\D", ""));// D-> rakam hariç tum karakterler($ .) "" hiçliğe replace yapıldı

        System.out.println("yeniA+yeniB = " + (yeniAA + yeniBB) / 100);// 31.54
        /*
Integer.valueOf() ile Integer.parseInt() metotları arasında temel fark
valueOf() metodu Integer tipinde bir obj, parseInt() metodu ise int tipinde bir veri tipi döndürür.
parseInt() metodu primitive veri tipi döndürdüğü için daha hızlı çalışır.
 */

    }
}