package day04IfStatement;

public class IfStatement01 {
    public static void main(String[] args) {
        // If it rains I will cancel the picnic.


        //EXP 1: SAYI POZITIF ISE EKRANA POZITF YAZDIRIN .

        int s = 12;
        if (s > 0) {
            System.out.println("positive");

            //EXP2: verilen character buyuk harf ise ekrana Buyuk harf yazdir.

            char ch = 'A';
            if (ch >= 'A' && ch < 'Z') {
                System.out.println("buyuk harf");

                /*
                && islemi
                Sadece Boolean ile kullanilir.
                true&& true= true
                true&& false  =false
                false && true = false
                false && false = false
                && islemi mukemmeliyercidir......
                true soncunu alabilmek icin her sey true olmalidir.
                Bir tane false varsa, sonuc false demektir.

                 */

                // EXP3:  Verilen bir sayi uc basamakli ise ekrana " uc basamakli yazdiriniz.

                int sayi = -185;

                sayi = Math.abs(sayi);
                if (sayi > 99 && sayi < 1000) { // kısa olan kod makbuldur.
                    System.out.println("uc basamakli");
                    if (sayi >= 100 && sayi <= 999) ;
                    System.out.println("uc basamakli");


                    // yukarida eksi sayilari yazdirmayi unuttuk....uc basamakli olmada negatif saretin etkisi yokki sadece sayi onemli
                    // abs mutlak deger demek.
                    // math classı na git mutlak deger i al.... en son yazdirda kalmali ekran yoksa yazdirmiyor.


                    // Examp 4:
                    // Verilen bir sayi cift sayi ise ekrana cift sayi yazdirin.
            /*
            "=" operatoru atama operatorudur. matematikteki esittir anlamına gelmez.
            Matematikteki esittir sembolu java da == seklindedir.....
             */
                    int p = -14;
                    p = Math.abs(p);

                    if (p % 2 == 0) {
                        System.out.println("cift sayi");

                        // EXP:5
                        // verilen bir sayi 300 den kucuk veya 1200 den buyuk ise ekrana harika sayi yazdirin....

                        int r = 250;
                        if (r < 300 || r > 1200) {
                            System.out.println("harika sayi");
                        }
                        /*
                        || veya islemidir
                        || islemi sadece booleanlarla kullanilir.
                        true || true  = true
                        true || false = true
                        false|| true = true
                        false || false = false
                        NOTE: || isleminde false alabilmek icin her seyin false olmasi gerekir.
                        || isleminde sadece bir tane true sonucu true yapmaya yeterlidir.
                         
                         */

                    }
                }
            }
        }
    }
    }