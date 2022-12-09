package day06nestedifswich;

import java.util.SortedMap;

public class NestedIf01 {
    public static void main(String[] args) {
        /*
        Passwordun ilk harfi buyuk harf ise;
        'A' olursa gecerli password aksi halde gecersiz password
        Passwordun ilk hali kucuk harf ise
        'z' olursa gecerli password aksi halde gecersiz password
       Nested: icice gecmis demek. zıgon sehpa gibi.

      //NOTE: JAVA "nested" kodlari calistirirken cok zaman harcar buna "Time Comlexity" denir.
     //bu yuzden mumkunse "nested kod kullanmamaya calsiriz
         */
        String pwd ="5zxy12!";
        if (pwd.charAt(0)>='A'&& pwd.charAt(0)<='Z'){

            if (pwd.charAt(0)=='A'){

                System.out.println("Gecerli Password");
            }else {
                System.out.println("Gecersiz Password");
            }

        } else if (pwd.charAt(0)>='a' && pwd.charAt(0)<='z') {
            if (pwd.charAt(0) == 'z') {
                System.out.println("Gecerli PAssword");

            } else {
                System.out.println("Gecersiz Password");
            }
        }else{
            System.out.println("ilk karakter harf olmalidir");
        }

        String pwd1 ="5zxy12!";

    char ilkHArf= pwd.charAt(0);

        if (ilkHArf>='A'&& ilkHArf<='Z'){

            if (ilkHArf=='A'){

                System.out.println("Gecerli Password");
            }else {
                System.out.println("Gecersiz Password");
            }

        } else if (ilkHArf>='a' && ilkHArf<='z') {
            if (ilkHArf== 'z') {
                System.out.println("Gecerli PAssword");

            } else {
                System.out.println("Gecersiz Password");
            }
        }else{
            System.out.println("ilk karakter harf olmalidir");
        }

    }

}
