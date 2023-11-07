package Selim_TASK;
import java.util.Scanner;
public class T13_NestedIfTernary {/* Task ->
       0 ~ 9 arasındaki sayilari ENG translate eden  code create ediniz.
       sayı 9'dan buyuk veya sifirdan kucukse, "Gecersiz" print ediniz.
      NestedIf ve Ternary kullanarak 2 yolla da cozunuz
    */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("0 ile 9 arasinda bir rakam gir");
        int rakam= scan.nextInt();
        String eng=rakam==0?"Zero":rakam==1?"One":
                rakam==2?"Two":
                        rakam==3?"Three":rakam==4?"Four":rakam==5?"Five":
                                rakam==6?"Six":rakam==7?"Seven":rakam==8?"Eight":
                                        rakam==9?"Nine":"Gecersiz";
        System.out.println(eng);
        switch (rakam){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Gecersiz");
                break;
        }
        System.out.println("Switch bitti");
    }// main sonu
}
