package day29abstractioncollections;

public class Civic implements Engine, Ac{
         /***
         =Abstract methodlar sadece ne yapilacagini soyler( what to do)
          = concrete methdlar ne yapilacagi ( what to do) ile birlikte nasil yapilacagini (how to do) da soyler...

          "interface'ler bir yapilacaklar listesidir ( To do list)

          ==="multiple parent interface" kullandiginizda ayni method ismi ile birden fazla method olusturursaniz
          bu methdlarin return type'lari ayni olmalidir.  aksi taktirde; hata verir.

          */

         /*** Abstract Class ile Interface arasindaki farklar nelerdir?
          * A=once methodlardan bahsedin; sonra
          * 1)Method:
          "Abstract Class hem abstract hem de concrete methodlar icerebilr.
          "interface'ler ise sadece abstract methodlar icerir.
          Ama; istersek interface'ler icinde de default ve static keyword'ler kullanarak concrete methodlar olusturabiliriz.

          2) Variable:
          "abstract class'larda normla Class'lardaki gibi her turlu variable olusturabilirler.
          "interface" 'ler ise; variableler publlic static, ve final olmak zorundadir.


          3)Inheritance:

          "abstract Class'larda class olduklari icin multiplr inheritance'a musade etmezler.
          "interface'ler ise multiple inheritance 'i desteklerler.

          4) Object Creation:
          "Abstract Class" larda constructor vardir ama object olusturmada kullanilmazlar.
          "Interface" lerde ise constructor olmadigindan object olusturulamaz.

        *****    SORU: OOP LANGUAGE PRENSIPLERI NELERDIR?****
          1) INHERITANCE
          2) POLYMORPHISM
          3)ENCAPSULATION
          4) ABSTARACTION

          *

          */

    @Override
    public void run() {
        System.out.println("Civic runs well");
    }


    }


