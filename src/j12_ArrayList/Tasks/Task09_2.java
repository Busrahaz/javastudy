package j12_ArrayList.Tasks;
import java.util.ArrayList;
import java.util.Scanner;
public class Task09_2 {
    public static void main(String[] args) {
  /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> sayiList = new ArrayList<Integer>();//boş list tanımlandı
        double kareToplam=0;//boş kutu tanımlandı
        System.out.println("Agam liste atmak için sayı giresen \nAgam yeter diyirsen 0 gir .");
        int listSayilari=9999999;

        while (listSayilari!=0) {// aga 0 girene kadar tekrala -> 0 girildiğinde döngü sonlansın
            System.out.print("Agam sayı giresen : ");
            listSayilari=input.nextInt();
            sayiList.add(listSayilari);

        }
        sayiList.remove(sayiList.get(sayiList.size()-1));
        System.out.println(sayiList);
        for (int i = 0; i < sayiList.size(); i++) {
            // kareToplam+= Math.pow(sayiList.get(i),2) ;
            kareToplam+= sayiList.get(i)*sayiList.get(i);
        }
        System.out.println("girlen sayıları kareleri toplamı : "+kareToplam);
    }
}
