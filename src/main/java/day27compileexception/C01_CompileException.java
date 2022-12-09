package day27compileexception;

public class C01_CompileException {
    public static void main(String[] args) {

        double r1 = compareNumOfCharacters("java", "xy");
        System.out.println(r1);//2.0

        double r2 = compareNumOfCharacters ("null", "xy");
        System.out.println(r2); //2.0

        double r3 = compareNumOfCharacters ("Selenium" , "");
        System.out.println(r3);//
    }

    // Verilen iki Stringden birinin karakter ssayisinin digerinin kac kati
  //  oldugunu veren method olusturunuz.
    public static double compareNumOfCharacters(String s, String t){
        double result = 0;

        try {
            result = s.length()/ t.length();

        }catch (NullPointerException e){
            System.out.println("lenght () methodu'u null ile kullanilamaz");

        }catch (ArithmeticException e){

            System.out.println( "Herhangi bir sayi sifir ile bolunemez");
        }finally {
            System.out.println("Database ile connection kesildi");
        }
                return result;
    }

    /*** Interview sorusu*** bu 3 keyword u aciklayiniz....
     * Jvada birbirine benzeyen 3 adet keyword vardir. Bunlar ;
     * 1) Final==Bir Keyworddur. Variable, Class ve method'lar icin kullanilir
     * 2) Finally== Bir kod bloktur. suslu parantezlerin arasina yazdigimiz icin.
     * "try-catch veya sadece try ile kullanilir.
     * Finally kod blok icine  yazilan kodalr herhalukarda calistirilir.
     * Mesela Database ile connection u kesmek herhalukarda yapilmasi gereken bir fiildir.bunu fnally ile yapabiliriz.
     * Finally en sona koyariz.
     * 3)Finalize== Bir methoddur. bu method java tarafindan datalar imha edilmeden;
     * once cagrilir. bu method datalari imha edilecekhale getirir ve daha sonra "Garbage collector " bu datalari imha eder.
     * "Finalize methodunu" java developer'lar da cagirabilir ama Java kendi bildigini yapar.
     *Java finalize edilmemis hicbir seyi imha etmekz.
     * Peki finalize 'i kim yapar? Java kendisi yapar.....

     */

}
