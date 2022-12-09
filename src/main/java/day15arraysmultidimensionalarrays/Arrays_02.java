package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays_02 {
    public static void main(String[] args) {

        /*** EXP1==Size verilen positive ve negatif sayilar iceren
         *  bir integer Arraydeki en buyuk negatif ve
         *  en kucuk positif elemani bulunuz.
         */

        int arr [] = {-12 ,18,-5,23,-2,0};

        Arrays.sort(arr);// [-12,-5,-2,0,18,23]

        int maxNegative = arr[0];// burada arr [0] -12 demek...
        int minPositive= arr[arr.length-1];


        for(int w: arr){
               if (w<0){
                   maxNegative = Math.max(maxNegative, w);

               }
               if (w>0){
                   minPositive = Math.min(minPositive, w);
               }
                }
        System.out.println(maxNegative  +  "and" + minPositive);

        // if else ikili durumlarda kullanilir. bu soruda 3 farkli durum var. negatif; positifve sifir olma durumlkari.
        // sort yapmadann negatif sayiyi anlayamazdin. sonn sayinin positive oldugunu anlayamazsin... o yuzden sort yapmak durumundayiz.

    }
}
