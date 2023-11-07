package j04_javaOperator.J02_ASSAIGMENT_OPERATORS;

public class C01_karsilastirmaoperatoru {
     /*
  Comparator : Karsilastirma islemleri.
  Java'da iki variable'in degeri karlilastirildiginda Java sonuc olarak boolean(true-false) return eder

  ==       Esit               x == y
  !=       Esit degil         x != y
  >        buyuk              x > y
  <        kucuk              x < y
  >=       buyuk esit         x >= y
  <=       kücük esit         x <= y
Unlem isareti (!) olumsuzluk anlaminda kullanilir.
   */
     public static void main(String[] args) {
         int brkYas=30;
                 int hlkYas=48;
                 System.out.println("hlkYas esit mi brkyas = " + (brkYas==hlkYas));// f
                 System.out.println("hlkYas esit degil mi brkyas = " + (brkYas!=hlkYas));// t
                 System.out.println("hlkYas buyuk mu brkyas = " + (brkYas>=hlkYas));//f
                 System.out.println("hlkYas kucuk mu brkyas = " + (brkYas<=hlkYas));//t

                  /* s1 ve s2 String constant pool içerisinde aynı referans değere (reference) sahiptir.
s1 == s2 , s1 ve s2 'nin hafızadaki adres değerlerini karşılaştırır ve
 String constant pool üzerinde aynı adresi gösterirler.
 Böylece ekrana TRUE yazdırır.
    */
         String s1="Musa Bey";
         String s2="Musa Bey";
         System.out.println(s2 == s1);// true
         //   String s3=new String("Musa Bey");
         //   System.out.println(s2 == s3);//false

     }

}
