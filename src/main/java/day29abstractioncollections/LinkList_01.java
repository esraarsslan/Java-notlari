package day29abstractioncollections;

import java.util.LinkedList;

public class LinkList_01 {

    /***
    1)LinkedList'deki her eleman iki bölümden oluşur. i)Data ii)Pointer
2)LinkedList'deki her bir eleman "Node" olarak adlandırılır.
3)LinkedList'ler eleman ekleme ve eleman silme işlemlerinde çok başarılıdırlar.
4)LinkedList'ler eleman arama işlemlerinde başarısızdırlar.
5)3. ve 4. maddelerden dolayı eleman ekleme ve eleman silme işlemlerinin çok yapılacağı durumlarda LinkedList kullanılmalıdır.
6)ArrayList'ler index kullanır LinkedList'ler index kullanmaz.
7)index kullanmak eleman bulma işlemlerinde çok başarılıdır, bu yüzden eleman bulma işlemlerini çok yapacaksanız ArrayList kullanmalısınız.
     */

    public static void main(String[] args) {

        LinkedList<String> visitors = new LinkedList<>();

        visitors.add("Tom");
        visitors.add("Cruise");
        visitors.add("Tom Cruise");
        visitors.add("Brad");
        visitors.add("Pitt");
        visitors.add("Brad Pitt");
        visitors.add(2,"Angelina Julie");

        visitors.add("Brad Pitt");
        visitors.add("Tom Cruise");
        System.out.println(visitors);//[Tom, Cruise, Tom Cruise, Brad, Pitt, Brad Pitt]

        // Linkedlist 'ler ekleme ve silme islemlerinde cok basarili olduklarindan ekleme ve silme ile ilgili
//  alakali cok fazla method vardir.
        visitors.addLast("Ajda Pekkan");
        visitors.addFirst("Cuneyt Arkin");
        System.out.println(visitors);

        visitors.removeLast();
        System.out.println(visitors);

        visitors.removeFirst();
        System.out.println(visitors);

        visitors.removeFirstOccurrence("Tom Cruise"); // ilk gorunumu sil demek
        System.out.println(visitors);


        visitors.removeLastOccurrence("Brad Pitt");
        System.out.println(visitors);
       /***
     *  removes and returns the first element of this list.
                *
     * <p>This method is equivalent( esittir demek) to {@link #removeFirst()}.
     */
       String firstel =  visitors.pop(); // Cut+ Paste yapar...
        System.out.println(firstel);// Tom

        System.out.println(visitors);//[Cruise, Angelina Julie, Brad, Pitt, Brad Pitt, Tom Cruise]

        LinkedList<String> myList = new LinkedList<>();

       // myList.pop(); //NoSuchElementException atti cunku Linkedlist BOS...

    }
}
