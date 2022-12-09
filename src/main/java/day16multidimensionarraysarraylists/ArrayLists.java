package day16multidimensionarraysarraylists;

import java.util.Arrays;

public class ArrayLists {

    /***
    Array veya Collection varsa "for-each-loop kullanmak ilk tercihinixz olsun.
     Array veya Collection var ama " Index" kullanmak zorundasiniz o zaman for-each-loop calismaz.
     bu durumda for-loop, while looop ya da do-while-loop kullanmalisiniz..

     */


    public static void main(String[] args) {

        // EXP!+++Bir tane integer muti dimensional array olusturunuz .
        // Bu Arraydeki tum sayilarin toplamini veren kodu yaziniz.

        int arr[][] ={ {2,5,1,},{32,75,},{13,21,43,56}};
        int sum =0;

        for (int [] w : arr){

            for (int k : w){
                sum = sum + k ;

            }
        }
        System.out.println(sum);// 248

        // EXP2=== Bir multidimensional arrayi normal array e ceviren kodu yaziniz.
        // {{2,5,1,},{ 32,75}==> {2,5,1,32,75}

        int brr[][] ={ {2,5,1,},{32,75,}};

        int toplam= 0;

        //for-each-loop kullanicaz cunku arrayimiz var yukarda index de kullanmiycaz.

        for (int[] w: brr){
            toplam = toplam +w.length;

        }
        System.out.println(toplam);// multidimensional Arrayin icindeki elema syisini bulduk o da 5...

        int idx = 0;

        int crr[] = new int [toplam];// [0,0,0,0,0]
         for(int[] w: brr){ // brr [2,5,1,] && [32,75}
             for (int k : w){
                 crr[idx] = k;
                 idx ++;

             }
         }
        System.out.println(Arrays.toString(crr));//[2, 5, 1, 32, 75]
    }
}
