package Selim_TASK;
import java.util.Scanner;
public class T41_task_KombinasyonPermutasyon {
    /*  Problem Tanımı
  Verilen iki sayının kombinasyonunu bulan kodu yazınız.
  Hatırlatma C(n,r) = n! / (r!(n-r)!)
​
  Verilen iki sayının permütasyonunu bulan kodu yazınız.
  Hatırlatma P(n,r) = n! / (n-r)!
​
  Ekran Çıktısı
  Birinci sayıyı giriniz: 15
  Ikinci sayıyı giriniz: 4
  Kombinasyon: 1365
  permütasyon: 32760
​
  Birinci sayıyı giriniz: 5
  Ikinci sayıyı giriniz: 3
  Kombinasyon: 10
  permütasyon: 60
*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("n degerini giriniz");
        int n= scan.nextInt();
        System.out.println("r degerini giriniz");
        int r= scan.nextInt();
        long combinasyon=kombinasyonOlustur(n,r);
        System.out.println("C("+n+","+r+") ="+combinasyon);
        long permutasyon=permutasyonOlustur(n,r);
        System.out.println("P("+n+","+r+") ="+permutasyon);

    }

    private static long permutasyonOlustur(int n, int r) {
        return faktoriyelOlustur(n)/faktoriyelOlustur(n-r);
    }

    private static long kombinasyonOlustur(int n, int r) {
        if (r<0||r>n){
            return 0;
        }
        long nFaktoriyel=faktoriyelOlustur(n);
        long rFaktoriyel=faktoriyelOlustur(r)*faktoriyelOlustur(n-r);
        return nFaktoriyel/rFaktoriyel;
    }

    private static long faktoriyelOlustur(int n) {
        if(n<=1){
            return 1;
        }else {
            //1.yol
            long faktoriyel=1;
            for (int i = n; i >=1 ; i--) {
                faktoriyel*=i;
            }
            return faktoriyel;
            //2.yol
            //return n*faktoriyelOlustur(n-1);
        }
    }


}
