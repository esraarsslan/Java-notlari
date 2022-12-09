package day32maps;

public class C05_StaticBlocks01 {

    public static double pi;

    /**
     * static bloklar ihtiyacimiz olan variable'lerin class olusturma safhasinda elimzde olmasini saglar.
     *     // Static bloklar Class icindeki her seyden once calistirilir."main method'dan ve diger tum methodlardan once calistirilir.
     *     // static blok icinde sadece static variab'lere deger atanablir.
     *     // Birden fazla static blok varsa ustteki once calistirilir.
     *
     */

    static {
        System.out.println("Static blok 2");


    }
    public static void main(String[] args) {

        System.out.println("Main Method");

    }
    static{

        pi=3.14;

        System.out.println("Static blok 1");
    }


//Static blok 2
//Static blok 1
//Main Method
    }

