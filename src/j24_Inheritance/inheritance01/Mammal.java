package j24_Inheritance.inheritance01;

public class Mammal extends Hayvancik {//Hayvancık parent(Super) Class'ı extend eden child(sub) Class

    public Mammal() {//p'siz fasfakir modified const.

        System.out.println("Agam p'siz MAMMAL CLASS const. call edildi  selamkeee :) ");
    }
    public void sutBeslen(){
        System.out.println("bebelerini SUTT ile besler ...");
    }
    public void dogum(){
        System.out.println("nur topu gibi yavrısı olur ... ");
    }
}
