package Homework;
import java.util.Scanner;
import java.util.Arrays;
public class h4arraysScanner {
    public static void main(String[] args) {
        // task-> girilen bir int array elamanlarından  ortlamadan buyuk olan eleman sayısını print eden code create ediniz

        Scanner input = new Scanner(System.in);
        System.out.println("arrayin eleman sayisini giriniz");
        int arrBoyut = input.nextInt();
        int arr[]=new int[arrBoyut];
        int toplam=0;

        for (int i = 0; i < arrBoyut; i++) {
            System.out.println(i+ " . elemani giriniz");
            arr[i]=input.nextInt();
            toplam+=arr[i];


        }int ortalama=toplam/ arr.length;
        System.out.println("ortalama = " + ortalama);
        for (int i = 0; i <arr.length ; i++) {
            if ( arr[i]>ortalama) {
                System.out.println(i+". eleman="+arr[i]+" buyuktur ortalamdan");

            }

        }


    }
}