package day04IfStatement;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {



        /*
        Kullanicidan ilk,orta ismini  ve soy ismini kimlik numarasini aliniz.
        Asagıdaki formatta ekrana yazdiriniz.
        Ali Mert Can
        123456789
         */
        Scanner input= new Scanner(System.in);

            // 1.YOL:
        System.out.println("ilk isminizi giriniz");

        String ilkIsim = input.next();// next methodu kullaniciden string datası almak icin kullanilir.

        System.out.println("orta isminizi giriniz");
        String ortaIsim = input.next();

        System.out.println("soy isminizi giriniz");
        String soyIsim = input.next();
        System.out.println("kimlik numaranzi giriniz");
        String kimlikNumarasi = input.next();

        System.out.println(ilkIsim + " "+ ortaIsim+ " "+ soyIsim);
        System.out.println("kimlikNumarasi = " + kimlikNumarasi);
        System.out.println(kimlikNumarasi);

        //      2. YOL:
        System.out.println("ilk,orta ve soy isminizi giriniz");
        String ilk = input.next();
        String Orta = input.next();
        String Soy = input.next();
        System.out.println(ilkIsim + " "+ ortaIsim+ " "+ soyIsim);
        System.out.println( kimlikNumarasi);
        //    3. YOL:

        /*
        next() ile nextline() arasindaki fark nedir?
        next() kullaniciden gelen String'in sadece ilk kelimelerini alir.
        nextline() kullaniciden gelen String'in tamamını alir.

         */
        System.out.println("ilk, orta ve soy isminizi giriniz");
        String tamIsim = input.nextLine();// birden fazla kelime kullanacaksanız nextline kullan.

        System.out.println(tamIsim);
        System.out.println("kimlikNumarasini giriniz");
        String kimlikNum= input.next();
        System.out.println(kimlikNum);



    }
}
