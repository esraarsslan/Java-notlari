package day16multidimensionarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_01 {

    /***interwiewwww]]]]‘‘‘}}}}}}}}
     * Array List ler ayni data tipine sahip birden fazla
     * datayi depolamak icin kullanilir.
     * Array ile Array Listin farki nedir?  (interview questiom)
     * 1. fark ) Array olusturuken arrayin icine kac tane eleman koymamin gerektigini soylemeliiyiz ve soyledigimizden fazla eleman koyamayiz.
     * mesela 5 dedik 6 koyamayiz....Bu duruma ARRAYLER eleman sayisinda fixed tirler yani bir daha degismez.
     *
     * ARRAYLISt leri olustururen eleman sayisi soylemeye gerek yok; cunku ArrayList'ler eleman sayisinda "flexible'dirlar yani esnek.
     *
     * 2.FARK) Arraylerin icine primitive ve adressler referans'lar konabilir
     * ARRAYLIST'lerin icine ise sadece "non-primitive"ler konulur.
     *
     * 3.Fark) Array'ler cok hizlidir.Arrayler memoryi cok az kulanirlar.uzunlugundan emin oldugunuz coku datalarda array kullanmayi tercih edin.
     * NOTE: eleman sayisi kesin belli olan coklu datalari depoamak icin Array kullaniriz/
     * ama; eleman sayisi degisken olan coklu datalar icin array kullanma riskini almayijn....

     */
    public static void main(String[] args) {
        // ARRAYLIST NASIL OLUSTURULUR?
        // 1.YOL===
        ArrayList<Integer> ages = new ArrayList<Integer>();

        // 2.YOL===
        ArrayList<Integer> heights= new ArrayList<>();// Kirmizi ayakkabi

        // 3.YOL===
        List<Integer> nums= new ArrayList<>();// ayakkabi daha genel

        // .......ARRATLIST'LER nasil yazdirilir?
        System.out.println(nums); // listlerde sadece variable ismini yazinca yazdirir....

        //ARRATIST'lere nasil eleman  eklenir?
        // add() methodu eklemek icin kullanilir ve her zaman elamani en sona ekler yani ekleme siranizi baz alir.
        //insertion order
        //

        nums.add(21);
        nums.add(18);
        nums.add(20);
        System.out.println(nums);//[21,18,20]

        nums.add(1 , 50);// 21 ile 18 arasinda 50 yi gorururz...
        // indexli add de java hicbir sey return etmez. data tipi void oldugu icin sonuc yok..
       // void oldgunu ustune gelince void oldugunu gosteriyor
        System.out.println(nums);//[21, 50, 18, 20]

        List<Integer> prices = new ArrayList<>();
        prices.add(23);
        prices.add(185);


        System.out.println(nums);//[21, 50, 18, 20, 23, 185]
        System.out.println(prices);//[23, 185]

        // addAll() ; bir listi bir liste ekleyebilirisnixz.
        nums.addAll(2 ,prices);
        System.out.println(nums);//[21, 50, 23, 185, 18, 20, 23, 185]

        //ARRAYLIST' lerin eleman sayisi nasil bulunur?

        int elemanSayisi = nums.size();
        System.out.println(elemanSayisi);//8 ARRAYLERDE ELEMAN SAYISINI LENGHT VERIRKEN LISTLERDE SIZE VERIR...

        // ARRAYLISTLERDE HERHANGI BIR ELEMAN NASIL SECILIR?
        // get() methiodu istenen bir indexteki elemani verir.

        int el1 = nums.get(3);
        System.out.println(el1);//185

        // ARRAYLIST' in bos olup olmadigini nasil anlariz?

       boolean bos1 = nums.isEmpty();
        System.out.println(bos1);// false

        boolean bos2 = ages.isEmpty();
        System.out.println(bos2);// true

        // ARRAYLIST"te" bir eleman nasil degistirilir?

       // set() programlama dillerinde degistirme anlaminda degistirmek. var olan bir seyi degistirmek. set() index ile calisir

        nums.set(3 , 200);// burdaki 3 indextir..
        System.out.println(nums); //[21, 50, 23, 200, 18, 20, 23, 185] napti? 3. indekteki elemana gitti ve onu 200 yaoti.


        // EXP!=== nums arraylist'indeki  tum tek sayilari 11 arttirdiktan sonra ekrana yazdiriniz.
        // for-each-loop kullaniyoruz

        for (int w: nums){
            if (w%2!=0){
                nums.set(nums.indexOf(w) , w+11);

            }
        }
        System.out.println(nums);//[32, 50, 34, 200, 18, 20, 34, 196]

        // remove() methodunu icine tamsayi koyarsaniz Java onu index olarak kabul eder.
        // EXP2===ARRAUYLIST'den 200 elemanini siliniz.

        // NOTE1: Tum tamsayilar java icin aksi soylenmedikce primitive dir yani "int"'dir.
        // NOTE2: "primitive"ler ARRRAYLIST 'lerin elemani olamaz.
        //NOTE3: "Primitive"'i wrapper class a cevirirsenin non- primitive olur ve non-primitivler ARRAYLISTLERIN elemani olur...index O-LA-MAZZZ....
        Integer sayi = 200;
        //AUTOBOxIng yani wrapper class yapcaz . non -primitiveleri index kabul etmez java.
        nums.remove(sayi);// buraya sayi yerine "200" yazarsak index 200 u arar java ve de hata verir.prpmitive kabul eder cunku memoryi korumak icin.
        // REMOVE() ILK GORUNUMU SILER.
        System.out.println(nums);//[32, 50, 34, 18, 20, 34, 196]


    }
}
