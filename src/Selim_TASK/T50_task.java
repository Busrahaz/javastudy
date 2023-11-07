package Selim_TASK;
import java.util.Scanner;
public class T50_task {/*
           TASK  :
           Bir String içindeki tüm karakterleri en fazla bir kez print eden  create ediniz.
           Test Data:
           input: "aabbcccccddddaaa"
           output: abcd
        */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime gir");
        String str= scan.nextLine();
        String cikti="";
        for (int i = 0; i < str.length(); i++) {
            if (!(cikti.contains(str.substring(i,i+1)))){
                cikti+=str.substring(i,i+1);
                //cikti+=str.charAt(i);
            }
        }
        System.out.println("cikti = " + cikti);

    }

}
