package day03typecastingwrapperscanner;

import java.sql.SQLOutput;

public class WrapperClass01 {
    public static void main(String[] args) {
        /*
         Java primitivelere methodlar ekleyerek yeni bir structur olusturdu bu yapıya Wrapper Class denir.
         byte==> Byte 
         */
        byte primitiveByte =12;// primitiveByte yazince hic method goremezsiniz. cunku primitive ler method icermez sadece deger icerir.


        Byte wrapperByte =12;// "wrapperByte yazinca bircok method gorursunuz cunku wrapper lar method icerir.

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        // primitiveler nasıl "wrapper'lara cevrilir?

        float f1= 13.99f;
        Float wrapperF1 = f1;

        // Wrapperlar nasıl primitive cevrilir?
        Character w1= 's';
        char primitiveW1= w1;



    }
}
