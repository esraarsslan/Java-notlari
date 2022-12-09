package day30collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class C06_Deque {

    public static void main(String[] args) {
        /**
         * Deque==Double Ended Queue 'nin kisaltilmis halidir.
         * Yani; iki uclu Queue demektir. golf kutusuna konulan golf topu
         * FIFO VE LIFO beraber gerektiginde kullanlinir.
         */

        Deque<String> furnitureTruck = new LinkedList<>();

        furnitureTruck.add("Chair");
        furnitureTruck.add("Mirror");
        furnitureTruck.add("Sofia");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Dining Table");
        System.out.println(furnitureTruck);// [Chair, Mirror, Sofia, Bed, Bed, Bed, Dining Table]

        /**
         * Pops an element from the stack represented by this deque.  In other
         * words, removes and returns the first element of this deque.
         *
         * <p>This method is equivalent to {@link #removeFirst()}.
         *
         * @return the element at the front of this deque (which is the top
         *         of the stack represented by this deque)
         * @throws NoSuchElementException if this deque is empty

        */

        furnitureTruck.push("Refrigerator");
        System.out.println(furnitureTruck);//[Refrigerator, Chair, Mirror, Sofia, Bed, Bed, Bed, Dining Table]

    }
}
