package day05ıfstatement;

import java.util.Scanner;

public class IfStatement03 {

    /*
    iki tane String in esit olup olmadigini  anlamak icin "=="degil, "equals() kullaniniz.
    İki tane String in birbirine esit olup olmadigini kontrol etmek icin iki tane method kullanilabilir.
    i: equals()==> Buyuk harf ve kucuk harfi onemser. "A" ile "a" FARKLIDIR.
    İİ: equalsIgnoreCase ==>Buyuk harf ve kucuk harfi onemsemez umursamaz..."a" ile "A" AYNIDIR....

    equls stringler icin kullanılır.....
     */
    public static void main(String[] args) {

        //ExP1: Kullanicidan gun isimlerini aliniz o gunun haftasonu mu haftaici mi oldugunu kullaniciya soyleyiniz.
        // Pazartesi== Haftaici         Pazar ==> HAftasonu

        Scanner input = new Scanner(System.in);
        System.out.println("Bir gun ismi giriniz...");
        String gun = input.next();

        if (gun.equalsIgnoreCase("pazar")) {
            System.out.println("Haftasonu");
        } else if (gun.equalsIgnoreCase("pazartesi")) {
            System.out.println("HAftaici");

        } else if (gun.equalsIgnoreCase("Sali")) {
            System.out.println("HAftaici");

        } else if (gun.equalsIgnoreCase("carsamba")) {
            System.out.println("HAftaici");

        } else if (gun.equalsIgnoreCase("persembe")) {
            System.out.println("HAftaici");
        } else if (gun.equalsIgnoreCase("cuma")) {
            System.out.println("HAftaici");
        } else if (gun.equalsIgnoreCase("cumartesi")) {
            System.out.println("HAftasonu");
        } else {
            System.out.println("gecerli bir gun ismi giriniz");
        }


        //2.YOL:// bir satıra en fazla 80 karakter yazmak makbuldur ....yalnız yazılan bu kod da makbul degildir....
        if (gun.equalsIgnoreCase("pazar")||gun.equalsIgnoreCase("cumartesi")) {
            System.out.println("haftasonu");
        } else if (gun.equalsIgnoreCase("pazartesi") ||
                    gun.equalsIgnoreCase("Sali")||
                    gun.equalsIgnoreCase("carsamba")||
                     gun.equalsIgnoreCase("persembe")||
                    gun.equalsIgnoreCase("cuma")){
            System.out.println("HAftaici");
        }else{
            System.out.println("Gecerli bir gun ismi giriniz");

    }
        // 3.YOL:

     boolean   haftasonu =   gun.equalsIgnoreCase("pazar")||gun.equalsIgnoreCase("cumartesi");

        boolean   haftaIci=   gun.equalsIgnoreCase("pazartesi") ||
                gun.equalsIgnoreCase("Sali")||
                gun.equalsIgnoreCase("carsamba")||
                gun.equalsIgnoreCase("persembe")||
                gun.equalsIgnoreCase("cuma");
        if (haftasonu ) {
            System.out.println("haftasonu");
        } else if (haftaIci){
            System.out.println("Haftaici");
        }else{
            System.out.println("Gecerli bir gun ismi giriniz");


        }
    }
    }

