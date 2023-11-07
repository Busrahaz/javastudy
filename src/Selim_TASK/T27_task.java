package Selim_TASK;

public class T27_task {// Task-> "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde print eden code create ediniz.

    public static void main(String[] args) {
        String str="   Java ogrenmek123 Cok guzel@      ";
        str=str.replaceAll("\\d","").replaceAll("[^\\w\\s]","").replace("C","c").trim();
        System.out.println("str = " + str);

    }
}
