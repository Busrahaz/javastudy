package Selim_TASK;

public class T45_task {public static void main(String[] args) {

    //  Task->  0 ile 100 arasındaki bütün çift sayıları print eden code create ediniz.
    //Not: 0 ve 100 dahildir.
    for (int i = 0; i <=100 ; i++) {
        if (i%2==0){
            System.out.println(i+" ");
        }
        System.out.println(i%2==0?i:"");
    }


}
}
