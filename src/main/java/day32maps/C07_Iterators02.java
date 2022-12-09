package day32maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C07_Iterators02 {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        // EXP 1== Iterators kullanarak List elemanlarini tersten consol'a yazdirinz.

        ListIterator<String> itr = myList.listIterator();

        // hasnext() methodu poinerdan sonra eleman varsa "true" yoksa "false return eder.
        //next() pointer'i bir sonraki elemanin onune koyar ve ustunden atladigi elemani return eder.

        while (itr.hasNext()) { // imleci saga aldik

            itr.next();

        }
        // hasPrevious() pointerdan once eleman varsa "true" yoksa false return eder.
        // prevuous() pointer'i bir onceki elemanin sonuna koyar ve ustunden atladigi elemani return eder.

        while (itr.hasPrevious()) { // pointer i sola cekecek ustunden atladigi elemani bana verecek.

            String el = itr.previous();

            System.out.println(el + " ");

            // /EXP 2=== Listteki tum elemanlari siliniz

            while (itr.hasNext()) {

                itr.next();
                itr.remove();
            }

            System.out.println(myList);

            /** 1)ListIteratorde
             * i) HsNext()
             * ii) next()
             * iii)set()
             * iv) hasPrevious
             * v)previous
             * vi)remove()
             *
             */
            /*2) Iterator da
            i) HsNext()
             * ii) next()
             remove()

             */

            List<String> yList = new ArrayList<>();

            yList.add("Z");
            yList.add("K");
            yList.add("A");
            yList.add("J");
            yList.add("M");

            Iterator<String> iterator = yList.iterator();// bendeki listen iterator olusturuyorum


            while (iterator.hasNext()){
                String el1 = iterator.next();
                System.out.println(el1); // noral iteratorlerin update ozelligi yopktur.
            }
        }
    }
}