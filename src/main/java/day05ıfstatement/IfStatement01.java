package day05ıfstatement;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {

        //Exaamp1: Kullanciden alinan sayinin tek mi cift oldugunu ekrana yazan kodu yaziniz....

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz...");
        int s = input.nextInt();
    // 1.YOL: ideal cozum bu degil....

        if (s%2==0){
            System.out.println("cift sayi");
        }
            if (s%2!=0){
                System.out.println("tek sayi");
        }
        // 2. YOL:
        if (s%2==0){
            System.out.println("cift sayi");
        }else{  // diger butun durumlar demek....
            System.out.println("tek sayi");
        }
    // Exp2: Bir sayinin negatif,positive veya notr oldugunu soyleyen kodu yaziniz.

        System.out.println("Bir sayi giriniz");
        double d = input.nextDouble();
        if (d>0){
            System.out.println("positive");
        }else if(d==0) {
            System.out.println("notr");
        }else{
            System.out.println("negatif");
        }
    }
}
