package day21Accesmodifiersveinheriance;

public class AnimalRunner {

    /***
     * 1)"Inheritance (MIRAS demek)" sayesinde;
     * i)Code tekrarlarindan kurtuluruz.
     * ii) Code tamiri (maintance) kolay olur.
     * iii)Child classlari daha atomic yapmis oluruz.
     *
     * 2)Bir class'i bask abir class'in Child Class'i yapmak icin 'extends' keyword kullanilir.
     * ilk yazilan Class Child; ikinci yazilan Class 'parent' olur.
     *
     * 3)Child Class object'leri Parent Class'dan method ve variable'leri kullanabilirler.
     *
     * 4)Parent Class objeleri Child Classdan method ve variableleri kullana-maz-lar...yukardan asagiya kullanim yok.
     *
     *5) Object Class her class'in parent'idir.
     * Javada Object Class haric  her classin parenti vardir.
     *
     * 6)"private" method ve variable'ler Child class'lar tarafindan kullanilamaz. inheritance edilemez..
     *
     * "protected" method ve variable'ler "Child Class'lar" tarafindan kullanilabilir.
     * protected" method ve variable'lar Child Class'lar tarafindan kullanilabilir.
     *           "default" method ve variable'lar ayni package'deki Child Class'lar tarafindan kullanilabilir.
     *           "public" method ve variable'lar Child Class'lar tarafindan kullanilabilir.
     *          Note: "Child Class'lar tarafindan kullanilabilir" olmak "inherit edilebilir" demektir.
     *
     *         7) 4 tip inheritance vardir
     *             i)Multilevel Inheritance: Java bunu kabul eder
     *             ii)Hierarchical Inheritance: Bir parent icin coklu child, Java bunu kabul eder
     *             iii)Multiple Inheritance: Bir Child'a coklu Parent, Java bunu desteklemez.(Java does not support Multiple Inheritance)
     *             iv)Single Inheritance: Bir Child Class icin bir Parent Class demektir, Java bunu destekler
INHERITANCE= COCUKLARIN IHTIYACI OLAN SEYI AILEDEN KULLANMASI DEMEK.
     */
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.eat();
        c1.drink();
        c1.miyaw();

        Dog d1 = new Dog();
        d1.eat();
        d1.drink();
        d1.bark();

    }
}
