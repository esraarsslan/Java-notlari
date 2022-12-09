package day30collections;

import java.util.LinkedList;
import java.util.Queue;

public class C05_Queue {

    public static void main(String[] args) {

        /***
         * Ilk giren elamani ilk kullanmaniz (FIFO) gerektiginde Queue en iyi secimdir.
         * Queue ' da elemanlar giris siralamasina (insertion order'a) gore dizilirler.
         * Queue' da  Peek()' POP(); element) gibi ilk elemani ilgilendiren bir cok method vardir..
         *
         * OFFER() methodu kapasite kontrolu yapildiktan sonra eleman ekleme durumlarinda kullanilir.
         *
         */
        //data type          ===============   new  Constrocur
        Queue<String> wareHouse = new LinkedList<>();

        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Honey");
        wareHouse.add("Tomatoes");


        System.out.println(wareHouse);//

       /*** Retrieves and removes the head of this queue.  This method differs
                * from {@link #poll() poll()} only in that it throws an exception if
     * this queue is empty.
        *
        * Kapasite kısıtlamalarını ihlal etmeden hemen yapmak mümkünse, belirtilen öğeyi bu kuyruğa ekler.
        *          Kapasite kısıtlamalı bir kuyruk kullanırken, bu yöntemin eklenmesi genellikle tercih edilir, bu yöntem yalnızca bir istisna atarak bir öğe eklemede başarısız olabilir.
        *          Döndürür: öğe bu kuyruğa eklendiyse true, aksi takdirde false
        *          Atar:
        *          ClassCastException – belirtilen öğenin sınıfı, onun bu kuyruğa eklenmesini engelliyorsa
        *          NullPointerException – belirtilen öğe boşsa ve bu sıra boş öğelere izin vermiyorsa
        *          IllegalArgumentException – bu öğenin bazı özellikleri onun bu kuyruğa eklenmesini engelliyorsa
                */
        wareHouse.offer("patates");// elemani kapasite uygunsa ekler.boolean verir.
        System.out.println(wareHouse);//[Milk, Meat, Bread, Honey, Tomatoes, patates]


    }
}
