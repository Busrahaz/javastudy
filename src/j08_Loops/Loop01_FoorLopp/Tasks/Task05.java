package j08_Loops.Loop01_FoorLopp.Tasks;

public class Task05 {
    public static void main(String[] args) {
          /*
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        şekli print eden code create ediniz
         */

        for (int kat = 0; kat < 6; kat++) {
            for (int daire = 0; daire < 5; daire++) {
                System.out.print("# ");
            }
            System.out.println();//dumy->hayalet komut.. action'da app. etkilemeyen boş komut:her kat tekrarda alt sdatıra iniyor
        }


    }
}
