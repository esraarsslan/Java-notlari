package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays_01 {
    public static void main(String[] args) {

        // binarySearch()methodykullanarak bir elemanin Arayde olup olmadigini anlariz...
        // binarySearch methodunu kullanmadan once mutlaka Arryas.sort() kullanilmalidir. yemek yemeden once ellerinizi yikamaya benziyor...\
        // binarySearch methodu aradiginiz eleman Array'de varsa o elemanin indexini return eder.
        // binarySearch methodu aradiginiz eleman Array'de yoksa "-a" seklinde bir negatif sayi alirsniz. bu ara sira numarasi index degildir.
        // Bu sayidaki "-" isaretinin anlami bu eleman Array de yok demektir.
        // Bu sayidaki "-" isaretinin anlami bu eleman Array'de yok dmeektir, "a" nin anlami olsaydi kacinci sirada olurdu demektir.
    // binarySearch tekrarlayan elemanlar icin kullanilmaz.

        int arr [] = {12,31,43,14};// bu arrayi icinde 43 var mi diye merak ediyorum

        int sayi =43;
        Arrays.sort(arr);

        Arrays.binarySearch(arr, sayi); // bu arrayde 43 u ara.

        Arrays.sort(arr);//[12,14,31,43]

        int idx1 = Arrays.binarySearch(arr, sayi);// iki parametre ile calisir hem arr ile hem de olmayan bir sayi ile.
        System.out.println(idx1);//3

        int sayi2 = 17;
        int sonuc= Arrays.binarySearch(arr,sayi2);
        System.out.println(sonuc);//-5 //yok bulunacagi sirayi veriyor.
    }
}
