package Selim_TASK;

public class T31_task {//Interview Question
    // Task->0-255 e kadar olan sayıların karakter değerini print eden code create ediniz...

    public static void main(String[] args) {
        for (int i = 0; i <=255; i++) {
            char karakter= (char) i;
            System.out.println(i+"'nin karakter degeri= " + karakter);
        }

    }//main sonu
}
