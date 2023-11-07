package Selim_TASK;
import java.util.Scanner;
public class T47_task {
     /*
    task-> Girilen bir tamsayının  3 üssü olup olmadığını kontrol eden code create ediniz.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true
​
        Örnek 2:
        Girdi: 0
        Çıktı: false
        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true
​
        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*5 =45
        Sonuç= false
        45, 3ün üssü (kuvveti) değildir.
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi gir");
        int sayi= scan.nextInt();
        boolean katMi=false;
        int carpim=1;
        for (int i = 1; i <=sayi/3 ; i++) {
            carpim*=3;
            if (carpim==sayi){
                katMi=true;
                break;
            }
            if (carpim>sayi) break;
            System.out.print(i);
        }
        System.out.println(katMi);

    }
}
