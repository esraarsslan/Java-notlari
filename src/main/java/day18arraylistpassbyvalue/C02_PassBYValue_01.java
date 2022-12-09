package day18arraylistpassbyvalue;

public class C02_PassBYValue_01 {
    public static void main(String[] args) {

        /*** Default ayar ==var olan ayar. java orjinal degeri degistirmez.
         * bir metghod static ise icindeki her sey static olmalidir.
         * bir methodu static yapmak icin access mod.. ile main methodun arasina static yazmaliisn.
         * italkic yazar java methodun static oldugunu bildirmek icin...
         */

        /***1) Java variable'nin orjinal degerlerini korumak ister.
         * 2)Variable method"lar icinde kullanildiginda, java ethodun icine orginal degeri koymaz, o degerin kopyasini uretir.
         * vee method'a o kopyayi yollar.
         * method kopya ustunde degisiklik yapr dolayisiyla, variable'nin orjinal degeri korumus olur. bu sisteme
         * "PASS BY VALUE" denir...yani; Variablenin sadece degerini yolla orginali degil kopyasini yolla demek.
         *JAVA : PASS BY VALUE" kullanir.
         * NOTE: Bazi programlama dilleri orijinal degeri koruma altina almamistir. bu isi developer"lara birakmistir.
         * bu tarz diller "PASS BY REfeRENCE" kullanir.

         */

        int x = 5; // gomlek
        System.out.println(x);//5


        change(x);// ogrenci gomlegi // change methodu orginale dokunmaz    ===5===
        System.out.println(x);//15  gomlek
        int ucret = 100;
        int kopya = indirim(ucret);
        System.out.println(kopya);//90

        System.out.println(ucret);//100orjinal deger degismedi. java kopyaya verir degeeri
    }

    public static void change(int a) {
        System.out.println(a * 3);//5 == gomlek
    }

    /*
     * void disindaki "return" type"larda method body'si icinde
     * return keyword kullanilmalidir.
     */
    public static int indirim(int gomlekUcreti) {

        return gomlekUcreti - 10;

    }
}

