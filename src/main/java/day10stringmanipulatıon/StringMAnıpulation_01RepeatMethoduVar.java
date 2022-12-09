package day10stringmanipulatıon;

public class StringMAnıpulation_01RepeatMethoduVar {
    public static void main(String[] args) {

        String a = "Java kolaydir.";

        // StarsWith ("kola",5) kodu ilk 5 karakterden sonraki String'e bakar
        // ve String'ın "kola" ile baslayıp baslamadigini kontrol eder...

        boolean b = a.startsWith("va", 2);
        System.out.println(b); // her zaman boslugu say...
        String c = "Java kolaydir.";
        boolean k = c.startsWith("kola", 5);
        System.out.println(k);

        // replaceFirst ("a", *) ; kod Strindeki ilk a'yı * a cevirir..
        //replace (a,*); kod Stringdeki tum a ları * a cevirir..
        String x = a.replaceFirst("a", "*"); // butun a ları replace istiyorsanız replace kullan.
        System.out.println(x);// j*va kolaydir

        // concat() methodu iki tane string i birbirine yapistirmaya yarar...iki stringin birlestirilmesi demektir.

        //concat iki turlu yapılablir. 1) + ile yapılabilir  2) concat() metodu iLE...
        // java bir islem icim method uretmisse o en iyi best practice dir...
        // concat her zaman sona ekler. araya eklemek icin replace ya da split yapıp falan filan...
        String d = c.concat(" Anladin mi?");//concat yerine a+ da koyabitrizi ama method varken kullanilmaz...

        System.out.println(d); // Java kolaydir. Anladin mi?


        // trim: kırıkları aldırmak demek...javadaki trim de bastaki ve sonraki duzeltmeleri yapar...
        // aradaki boslukları silmez sadece bas ve sondakleri siler...

        // trim() methodu bir Stringin bas ve sondaki "space " karakterlerini siler, aradaki bosluklara dokunmaz...


        String e = "   Tom Cruise   ";
        System.out.println(e);
        String f = e.trim();
        System.out.println(f);


        // h.compareTo (i); kod iki tane String'i alfabetik (lexicographic) olarak karsilastirir.
        // Buyuk harfe duyarlidir
        //Buyuk harf kucuk harf'e karsı olamasını istemzseniz h.compareToIgnoreCase(i) ,kullanabilirsinz.
        //h.compareTo(i); kodda "h" nin alphabetik sirasindan "i" nin alfabetik sirasi cikarilir.


        String h = "Java";
        String i = "java";
        int j = h.compareToIgnoreCase(i);
        System.out.println(j);// 0

        // a.repeat(5); kodu "a" Strigini yanyana 5 kez yazar...
        // REPEAT(0); empty string return eder....

        //mac===commend'e baisli tut.  ///windows=== ctrl ye basili tutun...
        String n = a.repeat(-5);
        System.out.println(n);

    }
}
