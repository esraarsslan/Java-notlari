package day03typecastingwrapperscanner;

public class TimeCasting01 {
    public static void main(String[] args) {
        // Time Casting: Bir numeric data type ı diger numeric data type cevirmek demektir.
       // byte < short<int<long<float<double
         /*
            NOTE1:  Auto widening: Kucuk data type ni buyuk data type a cevirmeye denir.
            NOTE: Explicit Narrowing: Buyuk data type ni kucuk data type a cevirmeye denir.

          */
         byte age =23;
         int newAge= age;
         long population =1234;
         int newPopulation = (int)population;
         // Example1: shortu double ceviren kodu yaziniz. floatı byte yapan kodu yaz.

        short height=170;
        double newHeight= height;
        System.out.println(newHeight);
        float alan= 22.2f;
        byte newAlan= (byte)alan;
        System.out.println(newAlan);
        // java ondalik sayiyiy tam sayiya cevirirken yuvarlama islemi yapmaz. peki ne yapar?
        //ondalık kismini siler.

        int number= 515;
        byte newNumber= (byte) number;
        System.out.println(newNumber);//3 ==> java 515/256 ya boldu kalanı return etti.

        int num= 510;
        byte newNum =(byte) num;
        System.out.println(newNum);//-2 yapti.



    }
}
