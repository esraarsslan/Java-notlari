package day13loops_arrays;

import java.util.Arrays;

public class Arrays_01 {

    /*
    1) ayni data tipinde coklu data tipini depolamak icin javanin olusturdugu yapilar vardir.
    Bu yapilardan birisi de ARRAY lerdir....
    ARRAYI NASIL OLUSTURABILIRIZ. ONCE DATA TIPINI YAZACAKSIN...sonra array e isimm ver. koseli parantez koy.
    bu koseliler bunun array oldugunu soyler....
    Mutlaka array olusturdugunuzda icine kac eleman koyacaginizi soylemeniz lazim.
    Bunu olusturunca java napar????? [] parantez acar 7 yazdiysan 7 tane sifir koyar.
    default value sifirdir numeric data tipleri icin.

     */


    public static void main(String[] args) {

        int stAges[] = new int[7];//[0,0,0,0,0,0,0]// int stAges []BURDAKI KOSELIYI ISTERSEN INT DEN SONRAYA DA KOYABILIRIZ.
       /*
        1) ISIMDEN SONRA   [ EN IYISI BUDUR ]
       2) ISIMDEN ONCE
       3) DATA TIPINDEN SONRA
 */
        System.out.println(Arrays.toString(stAges));// ARRAY NASIL YAZDIRILIR BURADA ONU OGRENDIK...

        // ISTEDIGIMIZ SAYILARI NASIL YERLESTIRIRIZ ISTEDIGIMIZ YERE.
        // ARRAY'LERE ELEMANLAR NASIL EKLENIR?


        stAges[1] = 11;   //stringdeki gibi index kullanir array de// System.out.println(Arrays.toString(stAges));
        stAges[1] = 11;

        stAges[0] = 12;
        stAges[1] = 11;
        stAges[2] = 13;
        stAges[3] = 14;
        stAges[4] = 10;
        stAges[5] = 12;
        stAges[6] = 12;

        System.out.println(Arrays.toString(stAges));//[12, 11, 13, 14, 10, 12, 12]

        // Array deki herhangi bir elemani nasil yazdirabiliriz...

        System.out.println(stAges[4]);//10

        //EXAMPLE1=== Array" deki en kucuk ve buyuk elemani ekrana yazdiriniz
        Arrays.sort(stAges);
        System.out.println(Arrays.toString(stAges)); //[10, 11, 12, 12, 12, 13, 14]


        int ilk = stAges[0];
        int son = stAges[stAges.length - 1];// length stringlerde parantezli kullanilir. arraylerde oarantezsiz kullanilir cunku bu bir method degil. java arrayin icine atiyor siz oradan aliyorsunuz...

        System.out.println(ilk + son);//24

        // EXAMPLE2 == stAges Arrayi icindeki tum elemanlarin toplamini ekrana yazdiran kodu yazdiriniz....
        // loop var burada...


        // 1. YOLL===
//        int sum =0;
//        for (int i=0;   i<stAges.length;   i++){ // length eleman sayisini soyler arraylerde
//
//            sum = sum + stAges[i];

        // }
        // System.out.println(sum);//84


        int i = 0;
        int toplam = 0;

        while (i < stAges.length) {

            toplam = toplam + stAges[i];

            i++;
        }
        System.out.println(toplam);

        // 3. yoll====
        int k = 0;
        int s = 0;

        do {
            s = s + stAges[k];
            k++;

        } while (k < stAges.length);
        System.out.println(s);//84

        // 4. YOLL===for each loop // En gelismis loop tur///// arrayler de ve de collectionlarda kullanilir...
//  Arraylerdde parantez icine ilk yazilacak sey elemanin data tipidir...
        // for each looplarda hep w : kullanilir. sonra arrayin ismini yazarsin...
        // bu w ye toplami ekle

        int t = 0;

        for (int w : stAges) {
            t = t + w;


        }

        System.out.println(t);//84 butun elemanlar bitince loop u kiacak ve yazdiracak....

    // EXAMPLE#= String bir array olusturunuz.
        // bu array"e 5 tane isim yerlestiriniz
        // Bu isimleerdeki karakter sayilarinin toplamini ekrana yazdiriniz.

                String stdNames[]=new String[5];
                stdNames[0]="Ali";
        stdNames[1]="Tom";
        stdNames[2]="Veli";
        stdNames[3]="Kemal";
        stdNames[4]="Cem";

        int k1 =0;
        for (String w: stdNames) {

            k1= k1+w.length();// k1+=w.length()
        }
        System.out.println(k1);//18
     // EXAMPLE4=== char bir \array olusturunuz
        // Bu array e 5 eleman ekleyiniz
       // bu arraydeki sadece buyuk harfleri ekrana yazdiriniz..

        char ch []= {'A', 'c', 'D','k','M'}; // Kisa yolu
        for (char w: ch){
            if (w>='A' && w<='Z'){
                System.out.println(w);
            }

        }

    }
}
