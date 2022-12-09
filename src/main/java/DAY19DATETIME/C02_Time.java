package DAY19DATETIME;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class C02_Time {

    public static void main(String[] args) {


        // EXP1===Java'dan aldiginiz Date'i "ay/gun/yil olarak yaziniz.

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);//2022-10-21;
                                                            // 2 M 10'dan kucuk aylari 01,02,03 seklinde yazar....
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        String formattedDate = dtf.format(currentDate);

        System.out.println(formattedDate);//10/21/2022

        //=====
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM/dd/yyyy");

        String formattedDate2 = dtf2.format(currentDate);

        System.out.println(formattedDate2);//Oct/21/2022

        //====
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");

        String formattedDate3 = dtf3.format(currentDate);

        System.out.println(formattedDate3);//October/21/2022=== 4 adet M den kaynakli

        //*****
                                                            //  tek M 10'dan kucuk aylari 1,2,3 seklinde yazar....
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("M/dd/yyyy");

        String formattedDate4 = dtf4.format(currentDate);

        System.out.println(formattedDate4);//10/21/2022
///===

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("MM/dd/yy");

        String formattedDate5 = dtf5.format(currentDate);

        System.out.println(formattedDate5); //10/21/22

        //*****
       // TEK d  10'dan kucuk gunleri 1,2,3 seklinde yazar...
        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("MM/d/yy");

        String formattedDate6 = dtf6.format(currentDate);

        System.out.println(formattedDate6); //10/21/22



        /////////////////////
        //EXP 2=== Javadan aldiginiz time'in formatini degistiriniz

        LocalTime myTime = LocalTime.of(16,23, 54,2345);
        System.out.println(myTime); //16:23:54.000002345



        // Buyuk H 24 saat sistemini kucuk h ise 12 saat sistemini kullanir...
        DateTimeFormatter dft8= DateTimeFormatter.ofPattern("hh:mm a");
        String formattedMyTime2 = dft8.format(myTime);

        System.out.println(formattedMyTime2);//04:23 PM==== a pm koydu

        DateTimeFormatter dft9= DateTimeFormatter.ofPattern("HH:mm ");
        String formattedMyTime3 = dft8.format(myTime);
        System.out.println(formattedMyTime3);

    }
}
