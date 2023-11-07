package j08_Loops.Loop02_WhileLoop;

public class C04_WhileLoop { public static void main(String[] args) {
    //task-> 3 basamaklı 4 ile tam bölünen sayıları print eden code create ediniz
    System.out.println("   ***   for loop   ***   ");
    for (int i = 100; i < 1000; i++) {
        if (i % 4 == 0) {
            System.out.println(i + " ");
        }
    }
    System.out.println("   ***   while loop   ***   ");

    int basla = 100;
    while (basla < 1000) {// 100 ile 999 arası loop tanımandı
        if (basla % 4 == 0) System.out.println(basla + " ");
        basla++;// 100 ile 999 arası loop değişimi
    }
}
}
