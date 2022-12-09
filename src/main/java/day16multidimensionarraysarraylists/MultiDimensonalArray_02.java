package day16multidimensionarraysarraylists;

import java.util.Arrays;

public class MultiDimensonalArray_02 {
    public static void main(String[] args) {

        // Bir Multidimenional array deki en buyuk ve en kucuk elemanlarinin topplamini veren kodu yaziniz.

        int arr [][]= {{2,5,1,},{83,75}};// Math.max kullanacagiz
         int maxElement = arr[0][0];
         int minElement= arr [0][0];
         for (int[] w: arr){
             for (int k : w ){
                 maxElement = Math.max(maxElement, k);// w array k ise int dir
                 minElement = Math.min(minElement ,k);

             }
         }


        System.out.println(maxElement);//83
        System.out.println(minElement);//1


        int rr[] = {2, 11, 0, 23, 7};
        Arrays.sort(rr); //0,2,7,11,23
        for(int i=4; i>=0; i--) {
            System.out.print(rr[i] + " ");
    }
}
}