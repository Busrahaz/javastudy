package Selim_TASK;
import java.util.Scanner;
public class T28_task {public static void main(String[] args) {

    /* TASK :
     * Girilen  isim sadece 3 harfli olmalidir ternary
     * kullanarak harflerin unique(farkli) olmasını control eden code create ediniz
     */

    Scanner scan = new Scanner(System.in);
    System.out.println("Bir kelime gir");
    String kelime = scan.nextLine();
//        String s1 = kelime.substring(0, 1);
//        String s2 = kelime.substring(1, 2);
//        String s3 = kelime.substring(2, 3);
//        if (kelime.length() == 3) {
//            if (s1.equals(s2) || s1.equals(s3) || s2.equals(s3)) {
//                System.out.println("Girdigin kelime unique harflere sahip degil");
//            } else System.out.println("Girdigin kelime unique harflere sahip");
//        } else System.out.println("Girdigin kelimenin harf sayisi 3'ten fazla");

    int count = 0;
    for (int i = 0; i < kelime.length() - 1; i++) {
        for (int j = i + 1; j < kelime.length(); j++) {
            if (kelime.charAt(i) == kelime.charAt(j)&&kelime.charAt(j)!=' ') {
                count++;
            }
        }
    }
    System.out.println("count = " + count);
    if (count > 0) {
        System.out.println("Girdigin kelime unique harflere sahip degil");
    } else System.out.println("Girdigin kelime unique harflere sahiptir");
}
}
