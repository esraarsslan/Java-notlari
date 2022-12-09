package day13loops_arrays;

import java.util.Scanner;

public class DoWhileLoop_01 {
    public static void main(String[] args) {
        // EXAMPLE1==== kullanicidan bir sayi aliniz sayi 100 den kucuk ise; ekrana "kazandin" yazdiriniz
        // aksi halde ekrana "Kaybettin" yazdiriniz
        // Kullanici kazandikca oyun devam etmeli....


        Scanner input = new Scanner(System.in);
//        int sayi = 0;
//        do {
//            System.out.println("Bir sayi giriniz...");
//            sayi = input.nextInt();
//
//            if (sayi<100){
//                System.out.println("KAZANDINIZ");
//            }
//        }while (sayi<100);
//        System.out.println("Kaybettiniz");

        //EXAPLE2= KULLANICIDAN ISimler ALINIZ ILK HARFININ BUYUK OLUP OLMADIGINI KONTROL EDINIZ.....

//        do {
//            System.out.println("isim giriniz...");
//            char ilkHarf = input.next().charAt(0);
//            if (ilkHarf >= 'A' && ilkHarf <= 'Z') {
//                System.out.println("ismi basariyla girdiniz...");
//            } else {
//                System.out.println("Ismi yanlis girdiginiz icin isleminiz iptal edilmistir...");
//                break;
//            }
//        } while (true); // sonsuz loop olusmus oluyor true ile. sonsuxzluk break ile kirilis

        // INFINITE LOOP===sonsuz dongu....
        // EXAMPLE 3===
        // Arttirma azaltma kisminda hata yaparsaniz " infinitive loop sorunsali"  olusur...

//        for (int i=1;    i<4;    i++){
//            System.out.println("Hi");
//        }

//        // Arttirma azaltma kisminda bir sey yazmazsaniz " infinite loop sorunsali olusur...
//        for (int i=1;    i<4;    i++){
//            System.out.println("Hi");
//  }
//
// Arttirma azaltma kisminda bir sey yazmazsaniz " infinite loop sorunsali olusur...
       int i=12;
       while (i<15){
           System.out.println("Hi");
       }

}}