package j24_Inheritance.inheritance01;

public class Runner {
    /*
 1)Java'da class'lar arasinda parent(Aile)-child(Cocuk)  relationship(iliski) tanımlanmıştır.
 2)Parent Class'a "super class"   Child Class'a "sub class"  denir.
 3)Ortak ozellikler parent class'a, specific ozellikler child class'a tanımlanır.
 4)Parent Child Relationship "reusability", "maintenance",  "less code", "well organization" avantajları için kullanılır.
 5)Child classlar parent'lardaki her methodu ve variable'i  kullanabilir ama parent class child'dakileri kullanamaz.
 6)Java "Multiple Inheritance"'i desteklemez. Yani; Java'da  bir Child Class'in 1'den fazla parent'i olamaz.
 7)Bir parent class, 1'den fazla child class ile olusturulan  parent child relationship'e "Hierarchical Inheritance"
   denir.
 8)Child-Parent-Grandparent... seklinde olusturulan cok katli  parent child relationshipe'e multi-level inheritance denir.
 9)"Object Class" -> Hz.Adem Class :) butun classlarin parent class'idir. Java'da parent class'i olmayan tek class "Object Class"dir

*/
    public static void main(String[] args) {
        Hayvancik h1=new Hayvancik();//grand-parent Class'dan obj created
        h1.hareket();
        h1.beslenme();
        h1.icme();


        Paluk b1=new Paluk();//parent Class'dan obj created
        b1.izgaraTava();//parent Class'dan meth called
        b1.hareket();//grand-parent Class'dan meth called
        b1.beslenme();//grand-parent Class'dan meth called
        b1.icme();//grand-parent Class'dan meth called

        Mammal m1=new Mammal();//parent Class'dan obj created
        m1.sutBeslen();//parent Class'dan meth called
        m1.dogum();//parent Class'dan meth called
        m1.hareket();//grand-parent Class'dan meth called
        m1.beslenme();//grand-parent Class'dan meth called
        m1.icme();//grand-parent Class'dan meth called

        Goyun g1=new Goyun();//child Class'dan obj created
        g1.semir();//child Class'dan meth called
        g1.sutBeslen();//parent Class'dan (Mammal) meth called'
        g1.dogum();//parent Class'dan (Mammal) meth called'
        g1.hareket();//grand-parent Class'dan (Hayvancık) meth called'
        g1.beslenme();//grand-parent Class'dan (Hayvancık) meth called'
        g1.icme();//grand-parent Class'dan (Hayvancık) meth called'

        Kedi t1 = new Kedi();//child Class'dan obj created
        t1.cırmalama();//child Class'dan meth called
        t1.sutBeslen();//parent Class'dan (Mammal) meth called'
        t1.dogum();//parent Class'dan (Mammal) meth called'
        t1.hareket();//grand-parent Class'dan (Hayvancık) meth called'
        t1.beslenme();//grand-parent Class'dan (Hayvancık) meth called'
        t1.icme();//grand-parent Class'dan (Hayvancık) meth called'

    }
}





















