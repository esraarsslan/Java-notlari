package DAY19DATETIME;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class C01_DateTime {
    public static void main(String[] args) {


        // EXP===1 "anlik tarihi (Current Date) ekrana yazdran kodu yaziniz.

        LocalDate currentDate = LocalDate.now();// java bulundugun mekandaki anlik tarihi bana ver demek...(LOCALDATE.NOW)
        System.out.println(currentDate);//2022-10-21// bunu istersek degistirebiliriz.

        // EXP2===="Anlik zamani (Current Time) ekrana yazdiran kodu yaziniz.

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);//20:42:03.597039

        //EXP#==="Anlik Tarihi ve anlik zamani yazdir

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);//2022-10-21T20:45:35.331126


        // EXP4===Japonya'daki anlik tarihi ve anlik zamani ekrana yazdiran kodu yaziniz.

        LocalDateTime currentDateTimeJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo")); //Tokyonun ZOnid sine bak oradaki tarih ve zamani ver demek.
        System.out.println(currentDateTimeJapan); //2022-10-22T02:50:47.156622

        // EXP5===Istanbul'daki "Anlik Tarihi ve anlik zamani ekrana yaz.

        LocalDateTime currentDateTimeIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeIstanbul);//2022-10-21T20:54:44.313634

        // EXP6=== Bugunden  789 gun sonra emekli olacaginiza gore emeklilik tarihini hesaolayan kodu yaziniz.

       LocalDate  countDate =  LocalDate.of(22,10,21);// LocalDate.of ile spesifik tarihli kod olusturduk ve hard code dan kurtardik.

        LocalDate retireDate=  currentDate.plusDays(789);// bu kod sadece calistirilan gun ici gecerlidir. o yuzden yukarida daha genis bir kod yazildi.
        System.out.println(retireDate); //2024-12-18

        // EXP7====Iki cocygunuzun dogum tarihleri arasindaki farki gun olarak hesaplayan kodu yaziniz.
        //dateOfBirthAli ===dobAli
        LocalDate  dobAli = LocalDate.of(2005, 5, 17);
        LocalDate dobVeli = LocalDate.of(2013, 2 ,8);

// Between methodu() kullanildiginda daha eski(gecmis) olan tarih once yazilmalidir.
          Long diff =  ChronoUnit.DAYS.between(dobAli, dobVeli);// ali ile velinin arasindaki farki gun olarak verecek. sonucu LONG olacak. iki zamanin farki 2 milyari gecebilir o yuzden long secilimis.
             System.out.println(diff); //2824

        /*
         ExP8=== Tom, Ali'den 3 yil 8 ay 13 gun sonra dogdu. Ali ise Veli'den 1 yil 15 gun once dogdu.
         Tom'un dogum tarihi' 18 kasim 2011 ise Veli ve Alinin dogum tarihlerini bulunuz.
            */

        LocalDate dobTom = LocalDate.of(2011, 11, 18);

       LocalDate  dobofAli =  dobTom.plusYears(3).plusMonths(8).plusDays(13); //Method chain buna method zinciri deniyor.

            // EXP8=== Istanbul'un fethi ile cumhuriyet'in kurulmasi arasinda kac ay oldugunu gosteren kodu yaziniz.
            //   29 Mayis 1453 ===>> Istanbul'in Fethi

         LocalDate IstanbulunFethi = LocalDate.of(1453,5,29);
         LocalDate CumhuriyetinKurulusu = LocalDate.of(1923, 10, 29);

         Long aySayisi = ChronoUnit.MONTHS.between(IstanbulunFethi, CumhuriyetinKurulusu);
        System.out.println(aySayisi);//5645


        //EXP 9====Verilen tarihin hangi burcta oldugunu gosteren kodu yaziniz...
       //getDayOfMonth()====olusturdugunuz tarihdeki gunu alir sadece...
        LocalDate myDate = LocalDate.of(1989, 5, 13);

        int day = myDate.getDayOfMonth();
        int month = myDate.getMonthValue();
        //1.Yol:
        if(day>=21 && month==3){
            System.out.println("Koc");
        }else if(day<=20 && month==4){
            System.out.println("Koc");
        }else if(day>=21 && month==4){
            System.out.println("Boga");
        }else if(day<=20 && month==5){
            System.out.println("Boga");
        }
        //2.Yol:
        if((day>=21 && month==3) || (day<=20 && month==4) ){
            System.out.println("Koc");
        }else if((day>=21 && month==4) || (day<=20 && month==5)){
            System.out.println("Boga");
        }

    }
}


