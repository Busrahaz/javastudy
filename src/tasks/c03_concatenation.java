package tasks;

public class c03_concatenation {
    /*
     Not: char variable'lari matematiksel islemlerde   ASCII degerleri kullanir.
          Ornegin; System.out.println('A' + 'C'); ekrana AC yerine 132 print eder.
     Note: Java'da "+" sembolunun
             i)Toplama islemi
             ii)Birlestirme Islemi(Concatenation)
           Java "+" sembolu  once toplama yapmaya calisir, yapamazsa birlestirme islemi yapılır aksi halde CTE verir.
     */
    public static void main(String[] args) {
        String ad = "furkan";
        String soyad ="ekinci";
        int a = 17;
        int b = 61;
        System.out.println(ad+soyad+a+b);//
        System.out.println(a+ad+soyad+b);//
        System.out.println(a+b+ad+soyad);//
        System.out.println(a+b);//
        System.out.println(" "+a+b);//
        System.out.println(ad+soyad+(a+b));//
        System.out.println((a+b)+ad+soyad);//
        System.out.println(ad+(a-b)+(a+b));//
        System.out.println(ad+((a-b)+(a+b)));//


        char ch = '1';//1 ascii:49
        System.out.println(ad+ch);//Furkan 1
        System.out.println(a+ch+ad);//66Furkan
        System.out.println(ad+(ch+b));//Furkan 110
        System.out.println(a+ad+ch);//17Furkan 1











    }
}
