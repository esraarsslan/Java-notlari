package day06nestedifswich;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {
        //Type a code, get age from user and decide which stage on it
        //Kullanıcıdan yas degerini alan kodu yaziniz ve yasin hangi evrede oldugunu asagıdaki tabloya gore ekrana yazdiriniz.

        //0 - 4 => baby
        //5 - 12 => child
        //13 - 20 => teenager
        //21 - 30 => adult
        //else (not expected age)

        //Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore ekrana yazdiriniz
        //0 - 4 => bebek
        //5 - 12 => cocuk
        //13 - 20 => genc
        //21 - 30 => yetiskin
        //Tanimlanmamis evre
// burada ki soruda negatif lik verilmemis bunu product ownerla konusun....

      // BVA= Boundry Value Analyze Test==> sınır degeri analizi testi...
        // Bu ornegin en az 14 secenekle test edilmesi lazım...


        Scanner input =new Scanner(System.in);
        System.out.println( "Lutfen yasinizi giriniz");



      double yas =input.nextDouble();


        if (yas<0){
            System.out.println(" Gecerli yas giriniz");
        } else if (yas <=4) {  // <5 demek de aynı ve daha iyi daha az optıonla yazmak....aynı sonucu verir
            System.out.println("Bebek");
        } else if (yas<=12) {
            System.out.println("cocuk");
        } else if (yas<=20) {
            System.out.println("Genc");
        } else if (yas <= 30) {
            System.out.println("Yetiskin");
        } else  {
            System.out.println("Tanımlanmamis evre");


        }
    }

    }




