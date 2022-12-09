package day07turnerystringmanipulation;

public class NestedTernary01_ARTIKYIL {
    public static void main(String[] args) {
      /*
      verilen yilin "Leap YEar "(artık yil) olup olmadıgını kontrol eden kodu yazinir.
      1) yil 100 e bolunurse 400 e de bolunmelidir ==> 1600 +    1800-

      2) yil 100'e bolunmezse 4 e bolunmelidir.  ==> 1996+ 2001-

      once 100e bolunmeyi kontrol etcez.
       */

        int year =1600;
      String leap=  year % 100 == 0 ?(year%400 == 0 ? "Leap year": "Leap year degil"):( year %4==0 ?"Leap year": "Leap year degil");
        System.out.println(leap);
        /*
        Asagidaki kurallara gore passwordun gecerli olup olmadıgini kontrol eden kodu yaziniz.
        1) sekiz karakterden fazla veya sekiz karakter varsa ilk harfi "i" olmalıdir.
        2) sekiz karakterden az karakter varsa ilk harfi "k" olmalıdir.
    lenght metodu strindeki karakterleri sayar kac tane oldugunu bize verir...
         */

        String pwd = "i2a37ed54";

        char ilkHarf= pwd.charAt(0);// ilkharf sepetiini olusturup cocugun tekrar tekrar markete gitmsini engelledik..

        String gecerli= pwd.length()< 8? (ilkHarf=='k'? "gecerli": "gecersiz"):(ilkHarf=='i'? "gecerli ": "gecersiz");

        System.out.println(gecerli);
    }

}
