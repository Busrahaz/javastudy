package j10_MethodCreation.Tasks;

public class Task19 { /*
   task->
   INTERVIEW SORUSU !!!
   1'den 100'e kadar hic rakam  kullanmadan sayilari print eden METHOD create ediniz

    */
    public static void main(String[] args) {
        printNumbersWithoutDigits();
    }
    public static void printNumbersWithoutDigits() {
        Character hundred = '$' + '@';
        Character one = 'B' - 'A';
        int asciiHundred = (int)hundred;
        int asciiOne = (int) one;

        for (int i = asciiOne; i <= asciiHundred; i++) {
            System.out.print(i + " ");
        }

    }
}

