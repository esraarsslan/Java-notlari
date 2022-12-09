package day30collections;

import java.util.LinkedHashSet;

public class C03_LinkHashSet_01 {
    public static void main(String[] args) {

        /***
         * LinkHashSet'ler elemanilari ekleme sirasina (Insertion Order) gore yerlestirirler.
         *LinkHashSet elemanlari siralamada zaman harccadigi icin; hashsetlere gore yawas calisir..
         *
         *

         */

        LinkedHashSet<String>emails = new LinkedHashSet<>();

        emails.add("abc@gmail.com");
        emails.add("bca@gmail.com");
        emails.add("asc@gmail.com");
        emails.add("bde@gmail.com");
        emails.add("axy@gmail.com");
        System.out.println(emails);//[abc@gmail.com, bca@gmail.com, asc@gmail.com, bde@gmail.com, axy@gmail.com]

    }
}
