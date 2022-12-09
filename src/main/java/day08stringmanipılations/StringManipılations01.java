package day08stringmanipılations;

import java.util.Scanner;

public class StringManipılations01 {
    public static void main(String[] args) {

        /*
         Exampe1: Kullanicidan aldiginiz ismin ilk ve son harfini ekrana yazdiriniz.
         Ramazan ==> Rn

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");

        String isim = input.next();// tek kelime ise next()...birden fazla kel'me icin nextline() kullan...
        char ilkHarf = isim.charAt(0);


        char sonHarf = isim.charAt(isim.length() - 1);// yazdiginiz kod sadece bazi durumlar icin calısırsa o koda hard coding denir. esasında kod degildir . olu insan esasında insan degildir.
        // hard cod un tersi dinamic koddur.....

        System.out.print(""+ ilkHarf + sonHarf);
        System.out.println();


        // 2.YOL:
       String ilk= isim.substring(0,1);
       String son = isim.substring(isim.length()-1);
        System.out.println(ilk+son);

       // Example 2:Verilen Stringdeki tğmhayvan isimlerini ekrana yazdiriniz.
        // "Ben kedi, esim tavuk, oglum inek sever"

        String str = "Ben kedi, esim tavuk, oglum sever inek.";

        /*
        substringin iki kullanmi vardır
        1) substring (baslangız indexı,bitis ndeksi) Stringin ortasından bir parca almaya yarar....
        2) substring (baslangıc indexi) Stringin verilen indeksin sonuna kadar almaya yarar....

         */

        String kedi= str.substring(4, 8);
        String tavuk = str.substring(15, 20);
        String inek= str.substring(34);
        System.out.println(kedi+" " +tavuk +" "+ inek);



        //EXP:3: Ilk isim ve soy isimi iceren isimlerden ilk ve soy isimlerin bas harflerini yzdiriniz....

        // Ali Can ==> AC     Tahsin Yurdakul ==> TY

        System.out.println("ilks ve soy isminizi giriniz");
         String tamIsim = input.nextLine();
            String a= tamIsim.substring(0,1);

          String b =  tamIsim.split(" ")[1].substring(0,1);
        System.out.println(a+b);



    }
}
