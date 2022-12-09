package day06nestedifswich;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        // NOTE: Swicth de sadece int,byte, short, char, String data tipleri kullanılabilir.

        // NOTE: Eger 3 ten fazla durum varsa swicth() tercih ederim...
        // Kullaniciden islem ve iki tane sayi alarak islemin sonucunu ekrana yazdiran basit bir hesap makinesi yapiniz.


        Scanner input =new Scanner(System.in);
        System.out.println("islemi giriniz: +,-,*,/,%");
        char islem= input.next().charAt(0);
        System.out.println("Ilk sayiyi yazdir");
        double ilk = input.nextDouble();
        System.out.println("Ikinci sayiyi yazdir");
        double ikinci= input.nextDouble();

        switch (islem){
            case'+':
            System.out.println(ilk +ikinci);
            break;
            case '-':
            System.out.println(ilk- ikinci);
            break;
            case '*':
            System.out.println(ilk*ikinci);
            break;
            case '/':
            System.out.println(ilk / ikinci);
            break;
            case'%':
            System.out.println((ilk+ikinci)/100);
            default:
                System.out.println("Bu islem tanımlanmamıstır");

    }
    }
}
