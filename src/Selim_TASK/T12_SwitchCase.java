package Selim_TASK;
import java.util.Scanner;
public class T12_SwitchCase {
    /*
   switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
   switch() de int, byte, short, char, String kullanilir.
    */
 /*  Task->
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri
​
    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri
​
    gun carsamba veya cumartesi ise:
    SQL dersi gunleri
​
    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir gun gir");
        String gun= scan.next().toLowerCase();
        switch (gun){
            case "pazartesi":
            case "sali":
                System.out.println("Java dersi gunleri");
                break;
            case "persembe":
            case "cuma":
                System.out.println("Selenyum dersi gunleri");
                break;
            case "carsamba":
            case "cumartesi":
                System.out.println("SQL dersi gunleri");
                break;
            case "pazar":
                System.out.println("Tatil gunu");
                break;
            default:
                System.out.println("girdigim isimde bir gun yok");
        }
    }// main sonu
}
