package j25_Exeptions.Tasks;

public class Ex04 {
    public static void main(String[] args) {
        // Aşağıdaki code output ne olur ?

        Object obj = new Integer(3);
        String str = (String) obj;
        System.out.println(str);//ClassCastException
        
    }
}
