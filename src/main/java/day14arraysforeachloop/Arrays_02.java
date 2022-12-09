package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays_02 {
    public static void main(String[] args) {


        /***interview sorusu hocanin
         Example 1: [0, 2, -3, 0, 12, 0] put the zeros to the end
         [2, -3, 12, 0,  0,  0]
         */
        // once yeni bir array olusturmaliyiz ve orjinal array kadar olmali yani ayni olmali...

        // yeni array [0,0,0,0,0,0,] sonra 2. adimda sifir mi diye bakcaz.
        // sifirsa ; hocbir sey yapma!!!!
        // sifir degilse yeni array a tasima yapcaz.

        int original[] = {0, 2, -3, 0, 12, 0};

        int yeni[] = new int[original.length];

        int idx = 0;

        for (int i = 0; i < original.length; i++) {


            if (original[i] != 0) {
                yeni[idx] = original[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(yeni));

        /****
         Bir array in icinde herhangi bir elemanin olup olmadigini ve kac kere tekrar tekrarlandigini gosteren kodu yaziniz....
         [2,1,2,-3,2] == kullanici 2 yi sordu=== ne diycez 2 elemani var ve 3 kez tekrarlandi...

         */

        int arr[] = {2, 1, 2, -3, 2};
        int eleman = 2;

        int counter = 0; // counter say demek// "flag" diyorlar. ne zaman kullaniriz. bazi durumlarin olup olmadigini kontrol etmek icin "flag"kullanilir...
        for (int w : arr) {
            if (w == eleman) {
                counter++;

            }
        }
        if (counter > 0) {
            System.out.println(eleman + " array'de " + counter + " defa var");
        } else System.out.println(eleman + " array'de yok");



    //  EXP 3=== size verilen bir cumledeki en uzun kelimeyi bulan kodu yaziniz.
    // "JAva kolaydir calisana; ne kolay ki calismayana==> calismayaya

    String sentence = "JAva kolaydir calisana; ne kolay ki calismayana.";

        System.out.println(sentence);

        sentence = sentence.replaceAll("\\p{Punct}"  , "");// noktalama isaretlerini sil dedik burada
        System.out.println(sentence);


        String words[] = sentence.split(" ");// kelimeler ayrilmis oldu. split array haline getirdi.

        Arrays.sort(words , Comparator.comparingInt(String::length));// bu array in elemanlarini compare et yani karsilastir .
        // Nasil? lenghlerine gore yani strngleri uzunluklarina gore karsilastir.


        System.out.println(Arrays.toString(words));//[ne, ki, JAva, kolay, kolaydir, calisana, calismayana]
// en son eleman nasil bulunur words  [words.lenght -1] yazarak...
        System.out.println(words[words.length-1]);// calismayana ....// son elemani bulmak icin her zaman length -1 i kullancaz Stringlerde ve Arrayklerde
        

    }
        }

