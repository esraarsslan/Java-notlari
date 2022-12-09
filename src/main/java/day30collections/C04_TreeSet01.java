package day30collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.TreeSet;

public class C04_TreeSet01 {

    public static void main(String[] args) {

        /***
         * tree set tekrarsiz elemanlari alfabetik sira veya kucukten buyuge (NATUREL ORDER) dizer.
         * treeSet cook yawas calisir. kullanirken iki kere dusun:)
NOTE=       ==tekrarsiz elemanlari natural order'da depolamak icin TreeSet kullanmak mantiklidir.
         Ama; TreeSetler cooook yawas calistigi icin, biz napariz?
         Elemanlari once HasSet'e depolariz, sonra HashSet'i TreeSet'e cevirerek TreeSet'in yawas olma problemini asmis oluruz...

         */
            //*****MESHURRR   interview SORUSU*****
        //EXP1=== Sekiz tane unique String elemani alfabetik sirada depolayiniz.

        TreeSet<String> emails = new TreeSet<>();
        emails.add("a@gmail.com");
        emails.add("y@gmail.com");
        emails.add("c@gmail.com");
        emails.add("m@gmail.com");
        emails.add("b@gmail.com");
        emails.add("z@gmail.com");
        emails.add("k@gmail.com");
        emails.add("d@gmail.com");

        System.out.println(emails);
        System.out.println(emails);//[a@gmail.com, b@gmail.com, c@gmail.com, d@gmail.com, k@gmail.com, m@gmail.com, y@gmail.com, z@gmail.com]
        Long start1 = LocalTime.now().toNanoOfDay();
        Long end1 = LocalTime.now().toNanoOfDay();
        System.out.println(end1-start1);// 609000


// 2. yol daha guzel==Hashset'in hizindan TreeSetin siralamasindan kullaniyorz

        HashSet<String> myEmails = new HashSet<>();
        myEmails.add("a@gmail.com");
        myEmails.add("y@gmail.com");
        myEmails.add("c@gmail.com");
        myEmails.add("m@gmail.com");
        myEmails.add("b@gmail.com");
        myEmails.add("z@gmail.com");
        myEmails.add("k@gmail.com");
        myEmails.add("d@gmail.com");

        TreeSet myEmailsSorted = new TreeSet(myEmails);// HashSet i TreeSet e cevirmek icin bu kodu yazdik.
        System.out.println(myEmailsSorted);
        Long end2 = LocalTime.now().toNanoOfDay();


        System.out.println(end2 - end1);//158000
    }


}
