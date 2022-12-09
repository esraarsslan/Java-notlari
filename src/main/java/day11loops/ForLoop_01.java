package day11loops;

public class ForLoop_01 {
    public static void main(String[] args) {

        // 3'den 6'ya kadar tamsayiların toplamını bulan kodu yaziniz.
        int sum = 0;
        for (int i = 3; i < 7; i++) {
            sum = sum + i;

        }
        //NOTE: sout(sum); loop un dısına yazilirsa "sum'ın sadece son degerini ekrana yazdirir." +
        // sout loop'un icine yazilirsa her bir loop icin "sum"'ıın hangi degerleri aldigini yazdirir."
        System.out.println(sum);//18

        //Exaple2: 6'dan 3'e kadar tamsayilarin carpımını bulan kodu yaziniz.

        int multiply = 1;
        for (int i = 6; i > 2; i--) {
            multiply = multiply * i;
            System.out.println(multiply);
        }

        //Example3: Size verilen bir tamsayinin  rakamları toplamini bulunuz...


        // %10 =  Bir sayının son rakamını almak istiyorsan %10 yap...
        //Java da tam sayıyı tamsayıya bolerseniz sonuc tamsayi olur...
        // Eger sonuc vırgullu sayi ise, java ondalık kısmı siler....java yuvarlama yapmaz.ondalık kısmı siler.
        // sıfırı gorene kadar calısacak...

        int num = -385;
        num = Math.abs(num);
        int sonuc = 0;

        for (int i = num ;  i>0 ; i= i/10){
            sonuc = sonuc + i%10;

        }
        System.out.println(sonuc);//16;

        // Example4 : Size verilen bir Stringi  ters ceviren kodu yaziniz...
        //      "Kaba"==>"abak"

        String str = "KAba";
        String ters = ""; // concatination yapacaksanız ""bos strıng kullanın...


        for ( int i= str.length()-1;    i>-1;    i--  ){


            char c=   str.charAt(i);

         ters = ters + c;

        }
        System.out.println(ters);//abAK
    }
}
