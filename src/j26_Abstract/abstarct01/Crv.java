package j26_Abstract.abstarct01;

public class Crv extends Honda{// concrete  child Class
    @Override
    public void motor() {
        System.out.println("Agam 2.4 supr turbo motor arazi bekler seni 4x4");
    }

    @Override
    void koltuk() {
        System.out.println("Agam deri koltuk arazide daha temiz ");
    }

    @Override
    void kapi() {
        System.out.println("Agam kapılar da kale gibin :) ");
    }

    @Override
    void sunroof() {
        System.out.println("Agam sunroof olmadan lux olmaz :(");
    }
}
