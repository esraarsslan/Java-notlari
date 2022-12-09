package day22inheritancepolymorphism;

public class Runner {
    public static void main(String[] args) {

        /**
         * Inheritance'da variableler secilirken Java objenin data type ina bakar.
         * oncelikle istediginiz variable'yi Objenin data type olan class'da arar.
         * her class data tipidir. ama her data tipi class degildir.
         *oncelikle clasta arar. o clasta bulamazsa parent claslara bakar.
         * Hicbir parent class da bulamazsa hata verir.
         */
// burada Inheritance de variableler Nasil cagrilir onu ogrendik*****
        Cat cat1 = new Cat();
        System.out.println(cat1.a);//14

        System.out.println(cat1.b);// 34  cat1 objesi ile b'yi getir demek.
        System.out.println(cat1.c);//45




        MAmal cat2 = new Cat();
        System.out.println(cat2.a);//34


         Animal cat3 = new Cat();
         System.out.println(cat3.a);//12
        // Inheritance'da variableleer secilirken JAva Constroctur' a bakar.
        // Oncelikle istediginiz methodu Constroctir i kullanilan claatan alir.
        // O  class'ta Parent classlara bakar.
        // Hicbir yerde o Method'u bulamazsa hata verir.


        Cat cat4 = new Cat();
        cat4.drink();// Mamal drink
        cat4.drink();



        // obje olustururken data tipini child classlardan secemezsiniz . MumKUN DEGILLL
        // Java benimle cocugumla tanimlaya,azsiniz der. Babasiyla tanimlayabilirsiniz.

        MAmal  cat5 = new MAmal();
         cat5.eat();// Mamal eat


       Animal cat6 =new Animal();
        cat6.eat();// Animal eat

        /***
        Constructor olmazsa obje olmaz...
         Acces modifierden sonra classin ismini yazacaksin sonra (){} Methoda benziyor...
         Farki var ?
        Javada yaratilis yukaridan asagiya dorudur.
         */


    }
}
