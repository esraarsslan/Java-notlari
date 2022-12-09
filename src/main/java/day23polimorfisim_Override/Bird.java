package day23polimorfisim_Override;

public class Bird extends Animal{

    /***FINAL KEYWORD NEDIR? INTERVIEW SORUSU***
     * final Keyword
     * i) Variablelerde kullanilabilir.
     * public final int age =12;
     * 1) Atanan deger degistirilemez. bir kere deger atarsaniz onu degistiremezsiniz. 12 degismez.
     * 2)Deger atamasi yapmak zorundasiniz.
     *Mesela pi sayisi gibi 3.14 degismez olacagi icin . final kullanirsaniz dev gelip degistiremez.
     *
     *
     * ii) Method'larda kullanilabilir.
     *
     * public final int add (){
     *     return a+b;// Bu kismi degistiremezsiniz bodlerri degistirilemez.
     *     1) Bir method oludturulurken FINAL olarak olurturulmus ise;  o method 'un body'si ASLA degistirilemez.
     *Dolayisiyla; o method Override edilemez..
     * "final" method'lar Override edilemezler, cunku "Overriding" de method body degistirilir fakat
     "final" method body degistirilmesine musaade etmez.


     * iii) Classlarda kullanilabilir...
     * Bir class'i :final" yaparsaniz o Class'i kisirlastirmis olursunuz.Bir class final ise onun child 'i olamaz...
     * Bir class "final" ise o Class'a extends edilemez.
     * "Final" Class Child olabilir.

     */
}
