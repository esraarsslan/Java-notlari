package day06nestedifswich;

import java.util.Locale;
import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        /*
        Kullaniciya ay ismi sorunuz ve kullanicinin verdigi ay isminden son aya kadar ekrana yazdiriniz.

         */
// NOTE: tolowercase() methodu bir stringdeki tum characterleri kucuk harfe cevirir.
        //touppercase() methodu bir stringdeki tum characterleri buyuk harfe cevirir
        Scanner input =new Scanner(System.in);
        System.out.println("Ay ismni giriniz");
        String ayIsmi =input.next().toUpperCase();

        switch (ayIsmi){
            case "ocak":
            System.out.println("ocak");
            case "subat":
                System.out.println("subat");
            case "mart":
                System.out.println("mart");
            case "nisan":
                System.out.println("nisan");
            case "mayis":
                System.out.println("mayis");
            case "haziran":
                System.out.println("haziran");
            case "temmuz":
                System.out.println("temmuz");
            case "agustos":
                System.out.println("agustos");
            case "eylul":
                System.out.println("eylul");
            case "ekim":
                System.out.println("ekim");
            case "kasim":
                System.out.println("kasim");
            case "aralik":
                System.out.println("aralik");
                break;  // en sonunda break yazmazsan en sonunda gecerli bir ay ismi giriniz de yazar....
            default:
                System.out.println("gecerli bir ay adı giriniz");
        }
    }
}
