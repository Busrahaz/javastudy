package Selim_TASK;

public class T03_incrementDecrement {public static void main(String[] args) {
    /*
      Increment-> bir variable'in degerini toplama veya carpma işlemleri ile artırılmasıdır.
      Decrement-> bir variable'in degerini cikarma veya bolme işlemleri ile azaltılmasıdır.
     */
    System.out.println("*****Arttirma*****");
    int a=5;
    a+=3;
    a=a+3;
    ++a;
    a++;
    System.out.println(a);
    int x=15;
    int y=20;
    x++;
    System.out.println(++x);
    System.out.println(x++);
    System.out.println(++x+--y);
    System.out.println(x--+y--);
    System.out.println("x"+x+" y"+y);

}
}
