package day23polimorfisim_Override;

public class Cat_OverrideveOverlad extends MAmal{


    /*** Hepsi OVERRIDE YAPARKEN GECERLI
     * 1) Override yaparken "method'un body'si degistirilir. Override da uygulama degistirilir oyuzden body degisir
     * 2) Override yaparken ASLA method signuture (isim ve parametre) degistirilemez.
     * 3 Override yaparken "inheritance" olmak zorundadir,.
     * 4) Override yaparken Access modifierler belli kurallara gore faklilastirilabilirler.
     *i) Private MethodLAr "Override" edilemezler.
     * ii) Child Classdaki override edilen method 'un Access Modifier 'i
     *Parent classdaki methodun access modifieri ile ayni veya genis olmalidir.

     ====NOTE==== Child class'daki method'un Accsess modifier'i daha dar olamaz.

     * iii) Defalt methodlar ayni package icinde ise; Override edilebilirler.
     * Farkli packageden Override edilemezler...
     * 5) Parent Class'daki methodun "return type'si void ise return type degistirililemez
     * 6)Parent Class'daki methodun "return type'si "PRIMITIVEW" ise return type degistirililemezzz...
     * 7)Parent Class'daki methodun "return type'si WRAPPER cLASS" ise return type degistirilemez...
     * 8)Parent Class'daki methodun "return type'si Parent cLASS" ise return type child'ardan biri olabilir.
     *
     *
     *
NNOTE==== Child class'daki method'un Accsess modifier'i daha dar olamaz.

     NOTE++2====Child clas'daki return type Parent Classdakinden genis olamaz..
     NOTE3====Aralarinda parent-child iliskisi olmayan classlar overrindingde de return type degidsiminde kullanilamazlar.
     Mesela; short "Integerdan kucuktur; fakat aralarinda parent-child iliskisi olmadigindan
     Integer yerine Sort kullanaazsiniz.

     NOTE==4== Is- A===Child'daki methodun retur typendan parentdaki methodun return type na gidisde "IS-A Relationship olmalidir.
     Aralarinda IS-A HAS- a olan relationshiplere "COvariant " denir. Arlarinda degisebiliyorlar demek...
     ==Child classdaki overdiding method deniyor. parent clasdakine de overridden method denir.

    9) Child<Prent ==>IS-A (Her kedi hayvandır ama her hayvan kedi değildir.
     HAS-A ==> Hayvanlar kedileri içerir ama kediler tüm hayvanları içermez.

     10) 10)"final" method'lar Override edilemezler, cunku "Overriding" de method body degistirilir fakat
     "final" method body degistirilmesine musaade etmez.
     11) POLYMOrphism (Coklu yapi)== Overloading + Overriding
     NOTE==POLYMOrphism nedir? derlerse  Overloading ve Overriding "i anlatin..

    ***************INTERVIEW SORUSU****

     12) .Overloading ve Overriding  arasindaki farklar nelerdir?
     a) Overloading icin "inheritance gerekmez fakat overriding icin gerekir. Overloading sadece bir classin icinde olup parent child gerekmedigi icin gerekmez.
     b) "Private methodlar overload edilebilir. Privatelar ovrride (baska bir classdan ) edilemezler.
     neden overload edilir? bir clasin icinde oldugu icin ayni clasin icinden erisebilirsin.
     c) Final methodlar; overload edilebilir.Override edilemezler.
     d) Overloading static polimorphisim olarak ; Overriding Dinamik Polimorphisim olarak adlandirilir.
     neden? Cunku Static methodlar overload edilebilir.
     E) OVERLOADING'DE METHOD SIGNaTuRE DEGISIR AMA "OVERRIDING" METHOD SIGNATURE' A dokulunmaz...
     */

    public void miyaw (){
        System.out.println("Cats miyaw");
    }

    @Override //@i=override annotation'ini kullanarak Java'nin yaptigimiz override islemini kntrol etmesini saglariz.
    //Annotation===Basinda @ isareti olanlara deniyor.

    public void eat() { // Basinda "Override" demek ; eat methodu parenttan alinmis bir method deemek. yeniden olusturulmamis.
        //super.eat(); // parenta git est i kullan demek. bunu sildik..

        System.out.println("Cats eat");
    }

    @Override
    public int add(int a, int b) {
        return a+b+1;
    }

    public Integer multiply (int a, int b){
        return a*b;


    }
// Asagidaki method "Overriding MEthod" ==override hali
    @Override
    public MAmal  creat() {
        return new MAmal ();
    }
}



