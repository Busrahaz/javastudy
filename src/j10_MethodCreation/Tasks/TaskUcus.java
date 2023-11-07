package j10_MethodCreation.Tasks;
import java.util.Scanner;
public class TaskUcus {/*
    A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
    Bilet tarifesi:
    km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyata %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bir app create ediniz
     */
    static Scanner input=new Scanner(System.in);

   static double fiyat=0;

    public static void main(String[] args) {

       sehirsec();

        System.out.println("yassec() = " + yassec());

        System.out.println("yonsec() = " + yonsec());


    }

    private static double yonsec() {
        System.out.println("tek yon mu almak isterseniz \"1\" tuslayiniz.\n gidis donus icin \"2\" tuslayiniz. ");
        int yon= input.nextInt();
        if(yon==2)
           return fiyat=fiyat-(fiyat*(0.2));
        else
            return fiyat;

    }

    private static double yassec() {
        System.out.println("yasinizi giriniz");

        int yas= input.nextInt();
        if (yas < 12)
           return fiyat= fiyat/2;
        else if (yas>12 && yas<24)
           return fiyat=fiyat-(fiyat*(0.1));
        else if (yas>65 )
            return fiyat=fiyat-(fiyat*(0.3));
        else return fiyat;




    }





    private static void sehirsec() {
        System.out.println("hangi sehre ucmak isrtersiniz \n B \n C \n D");
        String sehir= input.next().toUpperCase();
    switch (sehir) {
        case "B":
            fiyat=fiyat+(500*(0.1));
            System.out.println("fiyat = " + fiyat);
            break;
        case "C":
            fiyat=fiyat+(700*(0.1));
            System.out.println("fiyat = " + fiyat);
            break ;
        case "D":
            fiyat=fiyat+(900*(0.1));
            System.out.println("fiyat = " + fiyat);
            break;
    }


 }
}