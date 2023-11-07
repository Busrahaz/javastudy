package Selim_TASK;
import java.util.Scanner;
public class T06_02ifStatement { /* Task->
    Girilen jobTitle data için : Eger jobTitle
    qa ise print "is unvaniniz Quality Analyst."
    dev ise print "is unvaniniz Developer."
    ba ise print "is unvaniniz Business Analyst."
    pm ise print "is unvaniniz Project Manager."
    code create ediniz...
   */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Job title gir");
        String job=scan.next();
        if (job.equalsIgnoreCase("QA")){
            System.out.println("Is unvaniniz Quality Analyst.");
        } else if (job.equalsIgnoreCase("dev")) {
            System.out.println("is unvaniniz Developer.");
        } else if (job.equalsIgnoreCase("Ba")) {
            System.out.println("is unvaniniz Business Analyst.");
        } else if (job.equalsIgnoreCase("pm")) {
            System.out.println("is unvaniniz Project Manager.");
        }else System.out.println("Girdigin job title bizde kayitli degil");

    }// main sonu

}
