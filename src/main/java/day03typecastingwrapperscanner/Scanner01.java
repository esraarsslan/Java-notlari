package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner01 {
    // Scanner , kullanicidan data almaya yarar.
    // Kullanici ile etkilesim kurmamizi saglar.
    // Scanner bir java class'tir. bu classı kullanabilmek icin "import" etmek gerekir.
    // Scanner classı javanın util kutuphanesindedir.

    public static void main(String[] args) {
        /*
        KULLANICIDAN DATA ALMAK ICIN YAPILMASI GEREKENLER
        1) 1.adım: Scanner classından obje olusturun.
        2) 2. adım: Kullanıcıya ne yapacagini soyle.
        3) Kullaniciden aldiginiz datayı bir variablenin icine koyun.

         */

        Scanner input = new Scanner(System.in);

        System.out.println("Hey kullanici yasini gir");
        byte age = input.nextByte();
        System.out.println( "Hey kullanici senin yasin "+ age);


    }
}
