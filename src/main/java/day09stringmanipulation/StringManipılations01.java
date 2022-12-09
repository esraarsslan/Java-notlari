package day09stringmanipulation;

import java.util.Scanner;

public class StringManipılations01 {
    public static void main(String[] args) {

        // indexOf() = verilen karakterlerin ilk gorunumunun Indeksni verir...ilk nerede goruldugunu gormek istiyorsan kullan...
        //lastIndexOf = methodu herhangibir karakterin son gorunumunu verir.
        //
        String str = "java is easy";
        int indA = str.indexOf("a");
        System.out.println(indA);//1

        str.lastIndexOf("a");
        int indA2 = str.lastIndexOf("a");
        System.out.println(indA2);//9


        String str1 = "Kara kara dusunme Ankara";
        int k = str1.indexOf("kara");
        System.out.println(k); //5

        int k1 = str1.lastIndexOf("kara");
        System.out.println(k1);//20


        String s = "Mississipi";
        int indx = s.indexOf('i');// indexOf hem string hem de char ile kullanilabilir.
        System.out.println(indx);//1

        int innd = s.indexOf("iss");
        System.out.println(innd);//1

        int innd1 = s.lastIndexOf("iss");
        System.out.println(innd1);//4

        // EXP1::bir String'deki bir characterin tekrarli veya tekrarsiz olup olmadigini yaziniz....
        // "Helloooo==Z e=tekrarsız, l=tekrarli, o= tekrarlı

        String t = "Helloooo";
        char c= 'e';
        if (t.indexOf(c) == t.lastIndexOf(c)){ ;
        System.out.println("Tekrarsiz");
       }else {
        System.out.println("Tekrarli");

    }

        // indexOF () iki parametre ile kullanilirsa verilen sayi kadar "karakteri" gectikten sonra istenen karakterin ilk gotunumunun indexını return eder....

        String u = "Learn Java earn money";
       int sonuc=  u.indexOf("a",7);
        System.out.println(sonuc);// 7
        int sonuc1=  u.lastIndexOf("e",5);
        System.out.println(sonuc1);// 1

// LastIndexOf() :  iki parametre ile kullanilirsa ikinci parametrede verilen sayiyi "ındex" olarak kabul edip
        // en bastan bu ındexe kadar olan karakterleri bir kutu icine aliniz ve lastIndexOf() methodunu sadece bir kutu icindeki String icin kullanilir...

        String m= "Hello everyone";

        int e=  m.lastIndexOf("e",7);
        System.out.println(e);//6

        String v= " ";

        // isEmpty() methodu bir String'in bos olup olmadigini kontrol eder.
        // Eger String'de hic karakter yoksa isEmpty() "true" return eder, herhangi bir karakter varsa "fale" return eder....
        // length () ==0 demek isEmpty() true verir demektir.
        // Bir String'in bos olup olmadıgını alamak icin "lenght ()==0 kullanmayin, isEmpty() kullanın...

       boolean bosMu=  v.isEmpty();
        System.out.println(bosMu);
        // isBlank() hem bos string icin hem de "sadece space " iceren stringler icin true return eder.
        // nerde kullanilir? kullanıcıya ismini gir dion o da hicbirsey girmiyor burada hic girimezse veya bosluk girilirse isBlank() kullanılıyor...

        String x= " ";
        boolean blankMi= x.isBlank();
        System.out.println(blankMi);// true

//EXP=== Kullaniciden alinan isim mutlaka space'den frkli en az bir karakter icermelidir.
        Scanner input= new Scanner(System.in);
        System.out.println("ilk isminizi girinz");
        String ilk= input.nextLine();
        if (ilk.isBlank()){
            System.out.println("sana ismini gir dedim");

        }else{
            System.out.println(ilk);
        }
    }
    }

