package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        // ExP1 : Sayiları kullaniciden alan ve toplama islemi yapan kodu yaziniz.
        //1. ADIM: Scanner class dan object olustur.
        Scanner input =new Scanner(System.in);
        
        //2.ADIM: KULLANIciya ne yapacagin soyle
        System.out.println("ilk sayiyi giriniz");
        double sayi1 = input.nextDouble();
        System.out.println("ikinci sayiyi giriniz");
        double sayi2= input.nextDouble();

        System.out.println(sayi1 + sayi2);


        
        
        
    }
}
