package day04IfStatement;

import java.util.Scanner;

public class Scanner02 {

    /*
    char variableleri matematiksel islemlerde kullanirsaniz java onlarin ASCII degerlerini kullanir.
    ORn: system.outçprintln ('A'+'C'); ekrana AC yetine 132 yazdirirç
    NOTE:2 : java'da + sembolunun iki anlami vardir.
    i: Toplaa islemi
    ii: birlestirme islemi (concatination)
    java + sembolunu gorunce once toplama yapmaya calisir , yapamazsa birlestirme islemi yapmaya calisir, o da olamazsa hata verir.

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

                // 1.YOl:
        // kullaniciden ilk ve soy ismini aliniz
        // ilk ve soy isminin ilk harflrni yazdriniz.
        // Ali Can ==> AC
            /*

         System.out.println("ilk isminizi giriniz");
         char ilk = input.next().charAt(0);
        System.out.println(ilk);
        System.out.println("soy isminizi giriniz");

        char soy = input.next().charAt(0);
        System.out.println(soy);
        System.out.println(""+ (ilk+soy));

 */

        // 2. YOL:

        System.out.println("tam isminizi giriniz");
        String tamIsim = input.nextLine();// Ali Can
        char ilkHarf = tamIsim.charAt (0);
        System.out.print(ilkHarf);

       char soyIsminIlkHarfi=  tamIsim.split(" ")[1].charAt(0);
        System.out.print(soyIsminIlkHarfi);

    }


}

