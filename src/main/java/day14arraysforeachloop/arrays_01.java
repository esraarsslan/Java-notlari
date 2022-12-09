package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class arrays_01 {

    public static void main(String[] args) {

        //*** java bir arrayi yazdirirken elemanlairn araisna virgul koyar.
        // Arrays'lerin icine sadece "primitive data type" leri ve referance (adres) lar yerlestirebilir.

//        String str[] = new String[3];
//        str[0] = "Java";
//        str[1] = " did";
//        str[2] = "surprise you";
//        System.out.println(Arrays.toString(str));// arrayin icinde java stringinin adresi var burada.

        // 1==String bir array olusturunuz ve "Tom" ve "Tom" dan onceki tum elemanlari Ekrana yazdiriniz.

        String arr[]= {"JAne", "Mark", "Christopher", " Tom", "Ali", "Rojda"};

        for (String w : arr){
            System.out.print(w + " "); // bunu if in altina parantez disina koyarsan tom u yazdirmaz...

             if (w.equals("Tom")){
                 break;
             }
        }
        System.out.println();
            //2=== String bir array olusturunuz ve "Tom" ve "Jane" haric tum elemanlari krana yazdiriniz.


        String brr[]= {"JAne", "Mark", "Christopher", " Tom", "Ali", "Rojda"};
        for ( String w: brr){

            if (w.equals("Tom")|| w.equals("Jane")){ // true vermesini istedigimizden || yaptik...
                continue; ///bosverrr demek
            }
            System.out.print(w +" ");
        }
        System.out.println();
             /***
            3=== kullanici ile beraber bir array olusturunuz
            bir ogretmenin ogrencilerinin isimlerini applicationa yuklemesini saglayan kodu yaziniz.
                */

             // arraylerde kac oldugunu tanimlamak lazim yoksa olmaz. o yuzden kac ogrenci girecegini belirtmemiz lazim kullanicinin...

        Scanner input = new Scanner(System.in);
        System.out.println("kac ogrenci ismi gireceksiniz....");

        int numOfStd = input.nextInt(); // ogrenci ismini gir dedigi icin surekli loop kullanmamiz lazimdir.


             String names[]= new String[numOfStd];// ogretmenin verdigi isim dahil oldugu icin i=1 verdik...

        System.out.println("Girisi sonlandirmak icin Q harfine basiniz. Devam etmek icin herhaangi bir tusa basiniz" );
             for (int i=1;  i<=numOfStd   ; i++) {
                 System.out.println("Lutfen" + i + " . ogrenci ismini giriniz"); // kullaniciya dinamik msj verdik.

                 String stdName = input.next();// tek kelime almak icin next kulllandik.
                 if (stdName.equalsIgnoreCase("q")) {
                     break;
                 }


                 names[i - 1] = stdName;// index 0 olmali o yuzden i-1 yaptik.
        // names arrayindeki sifira can koy demek
                 // sonra i 2 oldugunda ; 1 e hakan koy demek

                 }
        System.out.println(Arrays.toString(names));
        //*** Stringler icin "default value "   null dir....
    }
}
