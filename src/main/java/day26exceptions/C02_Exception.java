package day26exceptions;

public class C02_Exception {

    public static void main(String[] args) {

        char ch1 = getcharFromString("java", 2); //
        System.out.println(ch1);//v

        char ch2 = getcharFromString("Selenium", 8);
        System.out.println(ch2);//StringIndexOutOfBoundsException==indexin sinirlarinin disindadir demek..
        /// Bir Stringden karakter veya karakterler alirken olmayan bir indexs kullanilirsa StringIndexOutOfBoundsException aliriz



    }
    public static char getcharFromString(String str, int idx){

       //return str.charAt(idx);
        char c= ' ' ;
        try{
           c=  str.charAt(idx);

        }catch (StringIndexOutOfBoundsException e ){
            System.out.println("Index ile ilgili bir problem olustu");
            System.out.println(e.getMessage());// javanin msji da yukaridaki gibi calisir. javaninki daha iyidir


            // e.getmessege= mesaji verir.
            System.out.println("Index ile ilgili bir problem olustu." + e.getMessage());// genelde bu kullanilir..

            e.printStackTrace();//Detayli log icin...Log===akisi takip etmek demekm... genelde dev'ler bunu kullanir.


            /***INTERVIEW SORUSU****
             * Bir hata olustugunda naparsiniz.
             * Cevap=loglara bakariz...bu ne deek? altttaki akisa bakarim demek.
             */
        }
        return c;

    }

}
