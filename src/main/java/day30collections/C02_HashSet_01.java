package day30collections;

import java.util.HashSet;

public class C02_HashSet_01 {

    //INTERVIEW DE*****%99 colllection sorusu gelir
    public static void main(String[] args) {
// set= tekrarli olmayan datalari siralamak icin kullanilir.
       // Hash bir tekniktir. birbirine benzemeyen data uretmeye yarar.
// her bir dataya ozel bir teknik uretiyor??

        /***
    Hash bir tekniktir,birbirine benzemeyen code'lar üretir bu code'lar data'yı unique yapar.
    Set'lere,çoklu ama tekrarsız data depolamak istediğimizde ihtiyaç duyarız.(öğrenci numaraları gibi)

    * Hashset'ler eklenen elemanlarin siralamasi ile ugrasmaz.
         * Hashset cok hizli calisir..
         * tekrarsiz elemanlarda kullanilir.
         *siralama onemli degilse kullanilir.
         * index kullanmazlar. Siralamayi kafasina gore yapiyor.
         *Kimlik numaralarini depolarken hashset i kullanmak guzel olur.
         * HashSetler:
         * 1)tekrarsiz elemanlarda
         * 2)sırlama onemli degilse
         * 3)hız cok önemliyse
         * 4)İndeks kullanmazlar
 */

        HashSet<String> emails = new HashSet<>();

        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
// rastgele siraladi
        System.out.println(emails); // [Apple, Fig, Mango, Apricot, Orange]

        // Var olan elemani eklerseniz hata vermez. Son ekleneni var olan datanin ustune yazar. buna "OVERWRITE " denir
        emails.add("Mango");
        System.out.println(emails);// set'lere ayni elamni eklerseniz hata vermez. napar? bi oncekinin ustune aynisini yazaar.

        emails.add(null);
        emails.add(null);
        emails.add(null);
        System.out.println(emails);//[null, Apple, Fig, Mango, Apricot, Orange]
        // tek null ekledi cunku ustune ekledi.


    }

}
