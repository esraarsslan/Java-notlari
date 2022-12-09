package day27compileexception;

public class C03_Exceptions {

    /***
     * 1) Java  Exceptonslar olusturarak Dev'lerin Java kurallarina uymalarini temn etmistir.
        2) Biz de Applicatin uretirken kendi Exception'larimizi olusturarak diger Dev'lerin bizim koydugumuz kurallara uymalarini temin ederiz.
      ***Interview   3) Bizim urettigimiz Exceptionlara "Custom Exception" denir. Javanin degil DEvlerin urettigi Exceptionlardir.
        4) "Custom Exception" 'lar da "RunTimeException ve "CompileTimeException olabilir.
        5) Custom "RunTimeException" uretmek icin " Extends  RunTimeExceptions denir.
        6) Custom "CompileTimeException uretmek icin " extends Exception " deriz.
     */

    public static void main(String[] args) throws IllegalGradException {

        printGrade(60);
        checkNameFormat ("Ali");

    }
        IllegalGradException ige = new IllegalGradException( "abc");

        // Ogrenci notlerini olusturuan bir method lsturunuz.
    // Compile time kodu yazarken hata verire.

    public static void  printGrade ( double grade ) throws IllegalGradException {

        if (grade < 0 || grade > 100) {

            throw new IllegalGradException(" Grade o'dan az 100'den cok olamaz");
        } else {
            System.out.println(grade);
        }
    }
// Verilen ismin ik harfinin buyuk harf olmamasi durumunda Exception atan method yaziniz.

    public static boolean checkNameFormat ( String name) throws IllegalGradException {

        if (name.charAt(0) >= 'A' && name.charAt(0) <= 'Z') {
            return true;
        }else{
            throw new IllegalGradException("Isimler buuk harfle baslamalidir.");


        }
    }

    }

