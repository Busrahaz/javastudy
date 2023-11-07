package Selim_TASK;

public class T23_task {
    // Task-> asagidaki fiyatlarin toplamini print eden code create ediniz.
    // String  str 1= "$13.99"
    // String str 2= "$10.55"
    // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

        /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
            1) \\d    ==> tum rakamlar
                  \\D    ==> tum rakam disi character ler
            2) \\w   ==> A->Z		a->z			0->9    _
                 \\W  ==> A->Z		a->z			0->9    _ disindaki hersey
            3) \\s   ==> space
                 \\S   ==> space disindaki hersey  */

    public static void main(String[] args) {
        String  str1= "$13.99";
        String str2= "$10.55";
        str1=str1.replaceFirst("\\D","");
        System.out.println("str1 = " + str1);
//        str2=str2.replaceAll("\\D","");
//        System.out.println("str2 = " + str2);
        str2=str2.replaceAll("[^\\d,.]","");
        System.out.println("str2 = " + str2);
        double toplam=Double.parseDouble(str1)+Double.parseDouble(str2);
        System.out.println("toplam = " + toplam);

    }
}
