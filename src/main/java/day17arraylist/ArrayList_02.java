package day17arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;

public class ArrayList_02 {
    public static void main(String[] args) {

        // EXP1=== Verilen bir listteki elemanlari tekrarsiz oalrak yaziniz.

        // [2,3,2,2,5],==> [2,3,5]

        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);

        List<Integer> yeni = new ArrayList<>();// bos bu o yuzden 2 ye false der..
        for (Integer w : a) {
            if (!yeni.contains(w)) {
                yeni.add(w);
            }
        }

        System.out.println(yeni);//  [2, 3, 5]

        //Example 2: Kullanicidan bir harf aliniz, harf sizdeki List'in icinde varsa o harfi "Bulundu"
        // ya ceviriniz yoksa o harfi List'e ekleyiniz
//           [A, K, R, S]  ==> R  ==> [A, K, Bulundu, S]
//           [A, K, R, S]  ==> X  ==> [A, K, R, S, X]


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz...");
        String harf = input.next().substring(0, 1);


        List<String> c = new ArrayList<>();
        c.add("A");
        c.add("K");
        c.add("R");
        c.add("S");

        if (c.contains(harf)) {
            c.set(c.indexOf(harf), "Bulundu"); // ilk yere harfin indexini yaz , ikince yere bulundu

        } else {
            c.add(harf);
        }
        System.out.println(c);
    }
}

//        do {
//                System.out.println("Lutfen bir harf giriniz");
//                harf = input.next().substring(0, 1);
//
//                if (c.contains(harf)) {
//                c.set(c.indexOf(harf), "Bulundu");
//                } else if(!harf.equals("Q")){
//                c.add(harf);
//                }
//                System.out.println(c);
//                }while(!harf.equals("Q"));
//                }
//                }
//

// yukaridaki do lu olan kod ile oyuna cevirdik ...
