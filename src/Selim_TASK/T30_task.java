package Selim_TASK;
import java.util.Scanner;
public class T30_task {/* Task->
 * girilen String icinde "xyz" dizimi var ise true degilse false return eden code create ediniz.
 *
 * input      output
 * axyzm  ==   true
 * xyz    ==   true
 * x.yz   ==   false
 * xyaz   ==   false
 */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir kelime gir");
        String kelime=scan.next();
        boolean icerirme=false;
        if (kelime.contains("xyz")){
            icerirme=true;
            System.out.println(icerirme);
        }else {
            icerirme=false;
            System.out.println(icerirme);
        }

    }
}
