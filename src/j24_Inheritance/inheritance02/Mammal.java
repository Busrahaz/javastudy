package j24_Inheritance.inheritance02;

import j24_Inheritance.inheritance01.Hayvancik;

public class Mammal extends Hayvancık {//garnd-parent(super) Class Hayvancık'tan extend edilen parent (super) Class -> Baba Class
    int m=1;// intial int type inst. variable
    int c=4;// intial int type inst. variable

    public Mammal() {//default p'siz const.
        this('H');//Bu Class p'li const call edildi
        System.out.println("Agam ahan da MAMMAL p'siz const call edildi :) ");

    }
    public Mammal(char y) {//1 p'li const
        super(34);//parent(Hayvancık) class p'li const call edildi'
        System.out.println("Agam ahan da MAMMAL p'li const call edildi :) ");

    }

    public  void mC(){
        System.out.println("mC -> MAMMAL Class meth. call edildi :) ");

    }
  //  @Override//annotation->dipnote
    public  void mM(){//parent'den ezilen zavallı sefil meth
        System.out.println("mM -> MAMMAL Class meth. call edildi :) ");

    }
}//Class sonu
