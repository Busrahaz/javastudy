package Selim_TASK;

public class T32_task { /*
        Task-> 100'den 0'a kadar 13'e tam bölünebilen sayıları (büyükten küçüğe) ve toplamını print eden code create edinz.
      output :
         91
         78
         65
         52
         39
         26
         13
         toplam =364
         */

    public static void main(String[] args) {
        int toplam=0;
        for (int i = 100; i >=0 ; i--) {
            if (i%13==0){
                toplam+=i;
                System.out.println(i);
            }
        }
        System.out.println("toplam = " + toplam);
    }
}
