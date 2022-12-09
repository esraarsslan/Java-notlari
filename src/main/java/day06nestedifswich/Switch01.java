package day06nestedifswich;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {

        /*
        Kullaniciden gun sayisini aliniz ve gun ismini ekrana yazdiriniz
        1==> Pazar        2==> Pazartesi
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Gun numarasini giriniz");
        byte gunNo = input.nextByte();

        //1.YOL: if ile cozunuz.

        if (gunNo ==1) {
            System.out.println("Pazar");
        } else if (gunNo==2) {
            System.out.println("Pazartesi");

        }else if (gunNo==3) {
            System.out.println("salı");

        }else if (gunNo==4) {
            System.out.println("Çarşamba");

        }else if (gunNo==5) {
            System.out.println("perşembe");

        }else if (gunNo==6) {
            System.out.println("cuma");

        }else if (gunNo==7) {
            System.out.println("cumartesi");

        }else {
            System.out.println("Geçerli bir numara giriniz");
        }
        //2. YOL:

        // switch nedir* ?? if/else if ın yaptıgı her seyi yapar. swıtch biraz daha sade ve okunması kolaydir.
        // switch ın icine sadece variable nın ismini koyarız.
        switch (gunNo){
            case 1:
                System.out.println("pazar");
                break;
            case 2:
                System.out.println("pazartesi");
                break;
            case 3:
                System.out.println("sali");
                break;
            case 4:
                System.out.println("carsamba");

            case 5:
                System.out.println("persembe");

            case 6:
                System.out.println("cuma");
                break;
            case 7:
                System.out.println("cumartesi");
                break;
            default:// yukardaki durumların dısındaki her durum demek...
                System.out.println("gecerli gun sayisi giriniz");

        }

    }

}
