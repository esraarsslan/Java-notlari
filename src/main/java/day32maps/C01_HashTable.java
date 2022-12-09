package day32maps;

import java.util.Hashtable;

public class C01_HashTable {


    /***
     * 1) HashTable bir MAP'tir.
     * 2)HashTable entrySet'lerii herhangi bir siralamaya tabi tutmaz.
     * cunku hashtable'i hizli yapmak istigi icin yapmaz.
     * 3) HashTable hashmaplerden daha yawastir. cunku HashTable'lar thread-safe ve synchonized'dir. (corba yaparken zaman kazanma ornegi)
     * synchonized====coklu islerin zaman kazandiracak sekilde siralanabilmesi demektir.
coklu iste HashTable hizli. Tek is yapacaksan HashMAp hizli...
     4) HashTablelarda key null olamaz. NullPointerException atar.
NOTE=== TO STRING () methodu objeleri consolda  detaylari ile gorebilmek icin class'larin icinde olusturulur.
     =
     */

    public static void main(String[] args) {

// Maplerde ekleme icin put ullaniyoruz.
        Hashtable<String, Integer> countryPopulations = new Hashtable<>();
    countryPopulations.put("USA",400000000);
    countryPopulations.put("Germany", 830000000);
        countryPopulations.put("Turkey", 900000000);
        System.out.println(countryPopulations);

       // countryPopulations.put(null, 900000000);// HashTablelarda key null olamaz. NullPointerException atar.

        Hashtable<String, Students> myStudents= new Hashtable<>();

        myStudents.put("Math", new Students("Tom Cruise" , "tc@gmail.com", 21, true));

        System.out.println(myStudents);// {Math=Students{name='Tom Cruise', email='tc@gmail.com', age=21, success=true}}

        String name =   myStudents.get("name").name;
        System.out.println(name);

       int age=  myStudents.get("MAth").age;
        System.out.println(age);

    }
}
