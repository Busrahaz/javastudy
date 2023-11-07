package j04_javaOperator;

public class C02_IncrementDecrement {
    /*
   Increment-> bir variable'in degerini toplama veya carpma işlemleri ile artırılmasıdır.
   Decrement-> bir variable'in degerini cikarma veya bolme işlemleri ile azaltılmasıdır.
       */
    public static void main(String[] args) {
        System.out.println("   ***   Increment -> Arttırma    ***   ");

        int a = 1;
        System.out.println(a);//1
        System.out.println(++a);// önce a'yı artır sonra  a'yı sout yap ->2 (a=2)
        System.out.println(a);// 2
        System.out.println(a++);// önce a'yı sout yap ->  (2) sonra a'yı artır (a=3)
        System.out.println(a);// 3

        a = 5;
        System.out.println(a);// 5

        System.out.println(a++ + ++a);//  12

        System.out.println(a);// 7

        System.out.println("   ***   Decrement -> Azaltma    ***   ");

        int b=3;
        System.out.println(b);//3

        System.out.println(--b);//2
        System.out.println(b--);//2

        System.out.println(b);//1
        int x=20;
        int y=15;
        System.out.println("   ***   s1   ***   ");
        System.out.println(++x + y--);// 36
        System.out.println("x = " + x);// 21
        System.out.println("y = " + y);// 14

        System.out.println("   ***   s2   ***   ");
        System.out.println(++x + --y);// 35
        System.out.println("x = " + x);// 22
        System.out.println("y = " + y);// 13

        int k=5;
        int sonuç=++k  + k++ + k++ + --k + k-- +k;
        //
        System.out.println("sonuç = " + sonuç);//
    }
}
