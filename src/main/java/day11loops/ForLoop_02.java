package day11loops;

public class ForLoop_02 {

    public static void main(String[] args) {


        // ExPl1==Bir String'deki "m" karakteri haric tum karakterleri yazdiriniz.
        // Andromeda==> Androeda

        String str = "MAmmmndromeda";

        for ( int i= 0   ;  i<str.length()     ;  i++    ){

          char c=   str.charAt(i);
          if (c!= 'm'){
                System.out.print(c);// Androeda
              System.out.print(c!='m' &&  c!='M');
            }
        }

        //2.YOL:
        for (int i=0;  i<str.length();i++){
            char c = str.charAt(i);

            if (c=='m'){
                continue; // Bossverr demek. java da bir keyword dur....m yı yazdırmadi ayı yazdırdı..
                // Loop un icinde bazi degerler icin Loop'un calışmamamsini isterseniz Continue kullaniniz..
                //
            }
        }


       // EXAPLE2 :::: 1'den 100'e kadar 6 ile bolunenler haric  tum tamsatuları ekrana yazdiriniz...

            for ( int i=1;  i<101 ;     i++){
                 if (i%6 == 0){
                    continue;
    }
                 System.out.print(i +" ");
}
        System.out.println();
                // EXAMPLE3 ==> Size verilen bir Stringdeki 'm' den onceki karakterleri yazdiriniz...
                // Luxemburg ==> Luxe;

        String s = "Luxemburg";
            for (int i=0 ;   i<s.length();i++){
                char c = s.charAt(i);

                if (c=='m'){
                    break; // herhangibir yerde loop u kırmak istiyorsanız "break "i kullanın...

            }

        System.out.print(c); // Luxe
    }

}}
