package Selim_TASK;
import java.util.Scanner;
public class T46_task {  public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını print eden code create ediniz
		 */
    Scanner scan=new Scanner(System.in);
    System.out.println("Rakam iceren bir kelime giriniz");
    String str= scan.nextLine();
    int count=0;
    for (int i = 0; i < str.length(); i++) {
        if (Character.isDigit(str.charAt(i))){
            count++;
        }
    }
    if (count>0){
        System.out.println(str+" kelimesi icinde "+count+" tane rakam var");
    }else System.out.println(str+" kelimesi icinde hic rakam yok");

    //2.yol
    count=str.replaceAll("[^0-9]","").length();
    if (count>0){
        System.out.println(str+" kelimesi icinde "+count+" tane rakam var");
    }else System.out.println(str+" kelimesi icinde hic rakam yok");

    //3.yol
    int temp=0;
    for (int i = 0; i < str.length(); i++) {
        for (int j = 0; j <=9 ; j++) {
            if (str.substring(i,i+1).equals(String.valueOf(j))){
                temp++;
            }
        }
    }
    if (count>0){
        System.out.println(str+" kelimesi icinde "+temp+" tane rakam var");
    }else System.out.println(str+" kelimesi icinde hic rakam yok");
}
}
