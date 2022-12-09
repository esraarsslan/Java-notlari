package day07turnerystringmanipulation;

public class Ternary01 {
    public static void main(String[] args) {
        //Exaple1: bir sayinin positive olup olmadıgını ekrana yazdiren kodu yaziniz...

        //1. YOL: if-else

        int a=12;
        if (a>0){
            System.out.println("pozitif");

        }else {
            System.out.println("pozitif degil");

        }

        // 2.YOL: ternary
                    // Condition ? Condition dogru ise uygulanacak kod : Condiition yalnıs ise uygulanacak kod

          String sonuc=     a>0 ?        "pozitif"                       :               "pozitif degil" ;

        System.out.println(sonuc);
        // Example 2: iki sayidan kucuk olani secen kodu yaziniz

        int b= 120;
        int c= 23;
     int kucuk =  b<c? b: c;
        System.out.println(kucuk);

        //Example 3: Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz.

        // pozitif sayilerin ve sifirin mutlak degeri kendileridir.
        // negatif sayilerin mutlak degeri -1 ile carpilmis hakleridir.

        int d = -45;
        int abs=  d<0 ? -1*d :d;
        System.out.println(abs);

        // Example 4: IKi tane sayi aynı isaretli ise bu sayiları carpınız. farklı isaretl ise "islem yapamam" mesaji veriniz.

        //NOTE: Ternary farklı data tiplerinde sonuc return ederse sonucun data tipni "Object" yaziniz.
        // NOTE: Java da her classın en az bir tane parent classı vardir.
        //       sadece Objet class'ın parent classı yoktur. Hz. adem gibi dedi

        int e= 12;
        int f= 10;
        Object islem  = e>0 && f>0 || (e<0 && f<0) ? e*f : "Islem yapamam";
        System.out.println(islem);


    }

}
