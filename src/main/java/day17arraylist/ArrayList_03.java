package day17arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayList_03 {
    public static void main(String[] args) {

        // EXP1====Bir Listteki elemanlardan birbirine en yakin olan ikisini bulunuz.

        // [12,15,19,30,21]==> 19 ve 21

        /****
         ilk once sort yapcaz kucukten buyuge dizcez...
         neden? cunku aradaki farklarina bakcaz.
         sonra farklardan en kucugunu seccez. nasil?Math.min ile seccez.
         en kucuk farki bulduktan sonra; bu enkucuk farkli veren sayilari ver bana java...

         */
        List<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(19);
        a.add(15);
        a.add(30);
        a.add(21);
        System.out.println(a);

        Collections.sort(a);//List'teki elemanlari kucukten buyuge dizebilmek icin kullanilir.

        System.out.println(a);

        int minFark = Integer.MAX_VALUE;//max. deger vermemizin sebebi her zaman kucuk degeri secmesini istedigimiz icin...

        for (int i=1;  i< a.size()  ;   i++){

            minFark = Math.min(minFark, a.get(i)- a.get(i-1));
        }

        System.out.println(minFark);







    }

}
