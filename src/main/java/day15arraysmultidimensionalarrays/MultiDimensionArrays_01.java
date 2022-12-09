package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionArrays_01 {// cok boyutlu array demek


    // Bir Array in elemanlari Array ise bu Arrayler MultiDimensional Array'dir.
    public static void main(String[] args) {

    // MultiDimension  Arrays nasil olusturulur?

        int arr [][]  =new int[3][2];
        // MultiDimension   Arrayslere eleman ekleme nasil yapilir.
        arr [1][0] =6;
        arr [0][0] = 3;
        arr[0][1]=-4;
        arr[1][1]=18;
        arr[2][0]=-7;
        arr[2][1]=0;

        // MultiDimension  Arrays  concola nasil yazdirilir?
        System.out.println(Arrays.deepToString(arr));// [[3, -4], [6, 18], [-7, 0]]

        // MultiDimension  Arrays 'lerde Array elemanlardan biri nasil yazdirilir?
        System.out.println(Arrays.toString(arr[1]));//[6, 18]

        //MultiDimension  Arrays 'lerde ic Array'lerdeki elemanlar nasil yazilir?

        System.out.println(arr [1][0]);//6

        // EXP1=String bir MultiDimension  Arrays olusturunuz

        // Elemanlari ekleyiniz
        // Toplam eleman sayisini ekrana yazdiran kodu yaziniz.






    }
}
