package Selim_TASK;

public class T38_task {public static void main(String[] args) {
        /*
        Task-> java ifadesni j*a*v*a olarak print eden code create ediniz..
         */
    for (int i = 0; i < "java".length(); i++) {
        System.out.print("java".charAt(i));
        if (i < "java".length() - 1) {
            System.out.print("*");
        }

    }

}
}