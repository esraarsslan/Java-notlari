package day08stringmanipılations;

public class StringManipilation02 {
    public static void main(String[] args) {

        // Example 1: Bir Stringdeki space haric kac tane karakter kullanildigini gosteren kodu yaziniz.
        // Ali okula gitti. ==> 14 karakter space haric....

        String str = "Ali okula gitti.";

        // replace() methodu bir Stringdeki herhangi bir karakteri veya karakterleri degistirmek icin kullanilir.


        int num= str.replace(" ", "").length();
        System.out.println(num);

        // Exp2: Bir strindeki tum 'a' harflerini 'A' ya ceviriniz.

         String s= "Ankara'nin tasina gozlerinin yasina bak.";

        String yeniS = String.valueOf(s.replace("a","A").length());

        System.out.println(yeniS);


        //EXp3: Bir Stringdeki tum kara kelimesinin yerine yıldiz koyunuz...

        String t= "Kara kara dusunme Ankara";
        String yeniT= t.replace("kara", "*");
        System.out.println(yeniT); // kara * dusunme an*

        // Example4:  Bir Stringdeki tum sayiları yildiza "*"   ceviriniz....
        // AC202112004==> AC*******  olacak.....

        String stId= "AC20211734";
       String yenistID= stId.replaceAll("[0-9]","*");

        System.out.println(yenistID);
        /*
        Bir grup datayı ifade eden kodlara "Regex" denir...
        "Regex" Regular Expressions ın kısatılmıs halidir...
        1) tum rakamları ifade etmek isterseniz==> [0-9]
        2) tum kucuk harfler ==>[a-z]
        3) tum buyuk harfler ==> [A-Z]
        4) Tum harfler ==> [a-zAz]
        5) Sesli harfler ==> [aeiouAEIUO]
        6) Space karakterı==> [ ]
        7) Tum rakamlar ve harfler==> [0-9a-zA-Z]
        8) Tum noktalama isaetlerı==> \\p{Punct}


        1) Rakamlar haric tum karakterle==> [^0-9]
        2) KUCUK HARFLER HARİC tum karakterler ==>[^â-z]
        3)Buyuk harfler haric tum karakterlr==> [^Â-Z]
        4)Tum harfler haric tum karakterler ==> [^a-zA-Z]
        5) Space haric==> [^]

         */
       //Exp5: Verilen bir Stringde kullanilan noktalama isareti ve
              // rakamlar ve space karakteri harıc tum karakterlerin sayısını buln kodu yazinziz.....

        String u= "Ali 13 yasinda, dersem inanma!...";

      int sonuc=   u.
              replaceAll("[0-9]"," ").
              replace(" ","").
              replaceAll("\\p{Punct}","").
              length(); // hepsini sayiyor length

        System.out.println(sonuc);


        /*
        EXP6: Bir password un gecerli olmadigini asagıdaki kurallara gore test eden kodu yaziniz.
        i: Space haric en az 8 karakter olmali.
        ii: En az 1 sembol icermeli
        iii: En az 1 rakam iceröeli
        iiii: En az 1 buyuk harf icermeli
        iiiii: en az 1 kucuk harf icermeli

         */
        String pwd = "b78c? K!m";
        boolean first = pwd.replace(" ","").length()>7;

        boolean sc= pwd.replaceAll("[0-9a-zA-Z ]", "").length()>0;

        boolean th= pwd.replaceAll("[^0-9]", "").length()>0;

        boolean fo= pwd.replaceAll("[^A-Z]", "").length()>0;

        boolean fi = pwd.replaceAll("[^a-z]","").length()>0;
         boolean pwdGecerli= first && sc && th && fo && fi;
if (pwdGecerli) {
    System.out.println("Password'unuz gecerlidir");
}else{
    System.out.println("PAssword'unuz gecerli degildir...");
}


         // Exp7: Bir stringdeki noktalama isaretleri haric karakter sayisini gosteren kodu yaziniz.


        String cumle = "Sen yapmazsan, ben ?...";

        int number= cumle.replaceAll("[^\\p{Punct}]", "").length();
        System.out.println(number);


        // Exp:8: Verilen bir String "Al" ile baslıyor ve éx" ile bitiyorsa ekrana "HArika" yazdirin
        // aksi halde "Normal" yazdirin.


        String v = "Alex";

        boolean baslangic= v.startsWith("Al");// Bir Strig'ın ne ile basladıgını kontrol eder....
        boolean bitis= v.endsWith("x"); // Bir String'în ne ile bittigini kontrol eder...

        String result = baslangic && bitis ? "Harika": "Normal";
        System.out.println(result);




    }
}
