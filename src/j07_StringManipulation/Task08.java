package j07_StringManipulation.tasks;

public class Task08 {
    public static void main(String[] args) {
        /*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi print eden code create ediniz.
   String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */
        String harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        //  char birinci = harfDepo.charAt(harfDepo.indexOf('H'));
        //  char ikinci = harfDepo.charAt(harfDepo.indexOf('A'));
        //  char ucuncu = harfDepo.charAt(harfDepo.indexOf('L'));
        //  char dorduncu = harfDepo.charAt(harfDepo.indexOf('U'));
        //  char besinci = harfDepo.charAt(harfDepo.indexOf('K'));
        System.out.println("" +  harfDepo.charAt(harfDepo.indexOf('H'))
                + harfDepo.charAt(harfDepo.indexOf('A'))
                + harfDepo.charAt(harfDepo.indexOf('L'))
                + harfDepo.charAt(harfDepo.indexOf('U'))
                + harfDepo.charAt(harfDepo.indexOf('K')));// HALUK


    }
}