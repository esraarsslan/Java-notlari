package day30collections;

import java.util.LinkedList;

public class C01_inkList_01 {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Chris");
        names.add("Alexandre");
        names.add("Mark");
        names.add("Tom");
        names.add("Jeremy");
        names.add("Hans");

        System.out.println(names);// [Chris, Alexandre, Mark, Tom, Jeremy, Hans]

        //Retrieves, but does not remove, the head (first element) of this list.
        //     *
        //     * @return the head of this list
        //     * @throws NoSuchElementException if this list is empty
        String firstEl = names.peek(); // ilk elemani verir  ama silmez...eger list bossa null verir.

        System.out.println(firstEl);// Chris

        LinkedList<String> myList = new LinkedList<>();
        String first = myList.peek();

        System.out.println(first);// "null" verdi..
        // listteki ilk elemani silmeden gormek istiyorsunuz. burada "peek " kullanacagiz.
        // Hem silmek hem de gormek istiyorsan "pop" kullancagiz.

        /***
         Retrieves( ALIR)  and removes the head (first element) of this list.
         *
         * @return the head of this list
         * @throws NoSuchElementException if this list is empty
         */
        String firstElement = names.poll();// ILK ELEMANI SILEREK VERIR. LIST BOSSA NULL VERIR. POP ISE EXCEPTION ATAR.
        System.out.println(firstElement);// Chris
        System.out.println(names);//  [Alexandre, Mark, Tom, Jeremy, Hans]


        /**
         * Retrieves and removes the head (first element) of this list.
         * @return the head of this list, or {@code null} if this list is empty
         */
        String f = names.element(); //
        System.out.println(f);// ilk elemani verecek==Alexandre
        System.out.println(names);// [Alexandre, Mark, Tom, Jeremy, Hans]


        names.peekFirst();// peek ile ayni.

        // EXP!==== "A" ile baslayan tum isimleri "*****" e ceviriniz.

        /***
        tekrarli ilem yapacagimiz icin loop kullanacagiz.hangisini kullanacagiz?
         // Collactionlarda FOR EACH her zaman dah aiyidr.
         */
        LinkedList<String> std = new LinkedList<>();

        std.add("Chris");
        std.add("Alexandre");
        std.add("Mark");
        std.add("Tom");
        std.add("Jeremy");
        std.add("Hans");

        for (String w : std) {
            if (w.startsWith("A")) { // w 'nun icindeki A ile basliyorsa
                std.set(std.indexOf(w), "****");// set degistirmek icin kullaniyoruz..

            }
        }

        System.out.println(std);// [Chris, ****, Mark, Tom, Jeremy, Hans]

        /****INTERVIEW SORUSU***** AZALTMA ISLEMINE BAKARLAR.
      //****  ONE METHOD ONE ACTION ( BIR METHOD BIR AKSIYON OLUSTURMALI)

        // EXP2=== List'deki 4 harften cok harf iceren isimleri siliniz.


        // Eleman sayisini azaltacagimiz icin i' ye ihtiyacimiz var' o yuzden
        / for-each loop degil for loop kullanacagiz...
*/
        for ( int i =0;  i< std.size(); i++){
    if (std.get(i).length()>4){
        std.remove(std.get(i));

        i--;
    }
        }
        System.out.println(std);

    }
        }
