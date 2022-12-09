package day21Accesmodifiersveinheriance;

public class C01_StudentClass {

    /***Interview sorulari
     Access Modifier
     1)public 2)Protected  3) default   4)ptivate// genisten dara dogru siralama...

     //Default = Access Modifier'i default yapmak icin access modifier yazmayiz...hicbir sey yazmazsan o default olur..
     // public her class'da kullanilabilir.
     //PROTECDET olanalar baska package'larden kullanilamaz ancak baska package'de "child class" icin de kullanilabilir.

     // private olanlr sadece olusturduklari Class icinde kullanilabilirler

     // default olanlar baska package'den kullanilmazlar.

     NOTE== Access Modifier'lari genisden dara dogru sayiniz.
     public>protected.>default> private


     NOTE= ACCESS MODIFIER'LARI BIRER BIRER ACIKLAYINIZ.
     1)// public her class'da kullanilabilir.
     2)//PROTECDET olanalar baska package'larden kullanilamaz ancak baska package'de "child class" icin de kullanilabilir.
     3)// private olanlr sadece olusturduklari Class icinde kullanilabilirler
     4)// default olanlar baska package'den kullanilmazlar.
     default===package private  ile aynidir...



     **NOTE=="PROTECTED ILE DEFAULT'UN farkini soyleyiniz
     *  protected olanlar baska package'lerden kullanilamaz ancak baska package'de "child class" icinden kullanilabilir
     *                default olanlar baska package'den kullanilamazlar



     *** Note: Class'lar icin hangi Access Modifier'lar kullanilabilir.
     *               public, default kullanilir ama protected ve private kullanilamaz...
     */



    public String stdName = "TomCruise";// public her class'da kullanilabilir.
// Ayni package icinde kullanilir.protected olanlar baska package'lerden kullanilamaz ancak baska package'de "child class" icinden kullanilabilir.
    protected String address = "Miami";// ev gibi // Calsslar protected olamazlar...Claslar obje olusturmak icindir o yuzden her yerinden ulasmak gerekir. cok ozel durumlarda default yaparsiniz. ama genelede public olur
    // default olanlar baska package'den kullanilmazlar; ayni packageden ulasilabilirler..
    String email = "tc@gmail.com";// defaulttur..
    // private olanlr sadece olusturduklari Class icinde kullanilabilirler. class private olamazz...
    private String stdId = "20206517004";
}

