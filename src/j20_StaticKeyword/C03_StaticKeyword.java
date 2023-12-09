package j20_StaticKeyword;

public class C03_StaticKeyword {//Class level

    int ogrId;//inst(obj) variable
    static int ogrcSayisi;//static(Class) variable
    public C03_StaticKeyword() {//pSiz fakir dafoult const
        ogrcSayisi++;//Bu cons her call edildiğinde yani obj careate edildiğinde
                    // ogrcSayisi static variable kalıcı(her obj iin aynı değer) olarak artırılır
        ogrId++;//Bu cons her call edildiğinde yani obj careate edildiğinde
                     // ogrcId create edilen obj e özel 101 değeri atandı
    }
    public static void main(String[] args) {//main level
        System.out.println("a obj  öncesi ogrcSayisi = " + ogrcSayisi);// 0
        C03_StaticKeyword a=new C03_StaticKeyword();
        System.out.println("a obj  sonrası ogrcSayisi = " + ogrcSayisi);// 1

        C03_StaticKeyword b=new C03_StaticKeyword();
        C03_StaticKeyword c=new C03_StaticKeyword();
        C03_StaticKeyword d=new C03_StaticKeyword();
        System.out.println("a,b,c,d  obj  sonrası ogrcSayisi = " + ogrcSayisi);// 4

        C03_StaticKeyword e;//obj decleration ama assaingment yapılmamış-> const call yok
        System.out.println("e obj  sonrası ogrcSayisi = " + ogrcSayisi);//
        System.out.println("a.ogrId = " + a.ogrId);//
        System.out.println("b.ogrId = " + b.ogrId);//
        System.out.println("c.ogrId = " + c.ogrId);//
        System.out.println("d.ogrId = " + d.ogrId);//
       // System.out.println("e.ogrId = " + e.ogrId);//

        System.out.println("gunun sonunda toplam  ogrcSayisi = " + ogrcSayisi);//

    }//main sonu
}//Class sonu
