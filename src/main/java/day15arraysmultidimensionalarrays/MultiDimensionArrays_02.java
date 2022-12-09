package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionArrays_02 {

    public static void main(String[] args) {
        // MultiDimension  Arrays  kisa yoldan nasil olusturulur?

        char arr [][] = { {'a', 'b'},{ 'C', 'D', 'E'} , {'?'}};

        System.out.println(Arrays.deepToString(arr));//

        // Bir String MultiDimension  Arrays 'de icinde "a" olan elemanlari concola yazdiriniz.

        String brr [][] = { { "learn", "java", "it"},{ "is", "easy"}};

        for (String[] w : brr){ // al kontrol et... nested loop


            for (String k : w){


                if (k.contains("a")){
                    System.out.println(k +" ");
                }
            }
        }
    }
}
