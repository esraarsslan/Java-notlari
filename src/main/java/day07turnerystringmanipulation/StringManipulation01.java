package day07turnerystringmanipulation;

public class StringManipulation01 {
    public static void main(String[] args) {
       /*
       String Class Methodları  {
       1) equals ():  
                  i:iki tane stringin aynı olup olmadıgını anlamamza yarar.
                  ii:equalss() methodu boolean return eder.
        2) equalsIgnoreCase ():
                  i: iki tane String'şn ayni olup olmadigini buyuk harf kucuk harfe dikkat etmeden anlamamiza yarar.
                  ii:equalsIgnoreCase methodu "boolean return eder.

        3) toLowerCase():
                  i: Bir String'deki tum harfleri kucuk harflere cevirmek icin kullanilir.
                  ii: toLowerCase() methodu "String "return eder.
        4) toUpperCase :
                  i:Bir String'deki tum harfleri buyuk harflere cevirmek icin kullanilir.
                  ii: toUpperCase() methodu "String "return eder.

        5) charAt():
                  i: Bir String'den belli bir index'deki characteri almak icin kullanilir.
                  ii:charAt(): methodu "char" return eder.

         6)length ():
                  i:Bir String de kac tane character kullanildigini ogrenmek icin kullanilir.
                  ii: length (): methodu "int" return eder.
         7) contains():
                  i: Bir String'de belli bir characterin veya characterlerin var olup olmadigini anlamak icin kullanilir
                  ii: contains() methodu "boolean" return eer.

         8) split():
                    i:Bir String'i istedigimiz character'den parcalamaya yarar.
                    ii: split(): methodu "Array " return eder.
        lenght -1 : son indek demektir......
        */

        /*
        Bir passwordun gecerli olup olmadigini asagıdaki kurallara gore kontrol eden kodu yaziniz.
        i: En az 8 character icermeli
        ii:Space characteri icermemeli
        iii: ilk harfi "M" veya "m" olmali
        iiii: Son characteri ? olmali

         */

        String pwd = "Manisa12?";

        // i: En az 8 character icermeli


         boolean first= pwd.length()>7;

        //ii:Space characteri icermemeli
        boolean second =! pwd.contains(" ");

       // iii: ilk harfi "M" veya "m" olmali
       boolean third=  pwd.charAt(0)== 'M'|| pwd.charAt(0)== 'm';

        // iii: Son characteri ? olmali
        boolean fourth = pwd.charAt(pwd.length()-1)=='?';
        System.out.println( first && second && third && fourth);






    }
}
