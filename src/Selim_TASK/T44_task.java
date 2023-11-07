package Selim_TASK;

public class T44_task {public static void main(String[] args) {
         /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli print eden code create ediniz..
​
        */
    int harf=65;
    for (int i = 0; i < 6; i++) {
        for (int j = 0; j <=i; j++) {
            System.out.print((char)(65+i)+" ");
        }
        System.out.println();
    }


}

}
