package day18arraylistpassbyvalue;

public class C05_MethodOverloading01 {
    /***MethodOverloading   OLUSTURMA***
     * 1) METHOD ISIMLERI AYNI OLMALIDIR.
     * 2)METHOD PARAMETRELERI FARKLI OLMALIDIR.
     * I: PARAMETRE SAYILARI DEGISTIRILEBILIR
     * II: PARAMETRELERIN DATA TIPLERINI DEGISTIREBILIRSINIZ.
     * III: PARAMETRELERIN YERLERINI DEGISTIREBILIRSINIZ.
     * ANCAKKKK DATA TIPLERI FARKLI ISE. ayni ise java onu ayni gorur ve hata verir...
     *3) METHOD ISMI + PARAMETRELER = METHOD SIGNUTURE// imza sizi digerlerinden ayirir.
Method signutiure disinda ne degistirirseniz degistirin java o methodlari kabul etmez.
     cunku imzaya bakar.
     */
    public static void main(String[] args) {

        add(3,5);  // once add ismine bakacak java .//  Java tam uyumu sever/
    }

    public static int add (int a, int b){
        System.out.println(a+b); // Tam uyum var
        return a;
    }

    public static int add(int a, int b, int c) {
        System.out.println(a+b+c); // bunu secmez. cunku yukarda sadece 2 parametre var a ve b...

        return a;
    }
    public static void add (int a, double b){

        System.out.println(a+b);// OOtoWidening vardir. tam uyum yok
    }


    public static void add (double a, int b){
        System.out.println(a+b);//Autowidening var ....
    }

}