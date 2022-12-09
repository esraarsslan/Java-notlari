package day27compileexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_Exceptions {
    /****
     * 1) FileInputStream fis = new FileInputStream("src/main/java/day27compileexception/File1.txt");
     * "new'den" snraki FileInputScream hata verir. Cunku' biz javaya verilen adresteki dosyaya git dedik.
     * Java 2 adet endiseye kapildi.
     * a)ya adres yanlissa
     * 2) ya verilen adresteki dosya yoksa;
     * Biz method isminden sonra; "throws(atmak)  FielNotFoundExceptions " yazarak javatya bu iki endise
     * duydugun durum olusursa; "exception at" dedik.
     *
     2) while ((k = fis.read() )!= -1) { yazdigimizda "read methodu hata verir.
     cunku biz javaya dosyadaki karakterleri oku dedik.
     Java ; bir endiseye kapildi nedir o endise? ya okumasi gerekn karakterler javanin bilmedigi karakterler ise;
     Biz method isminden sonra "throws IOException' yazarak; javaya bu durumla karsilastiginda exception at dedik.
     Yine java kurken mesela cince bir karakter gouruse java exception atar.


     3) Method isminden sonra, "throws IOEXception" yazarsaniz java File NotFoundException 'i siler.
     Cumku IOEXCEption" ; FileNotFoundException' u kapsar.
     IOEXCEption" FileNotFoundException' u n parentidir. Onun yaptigi her seyi yaparnilir.
     o yuzden IOexception varken FileNotFoundException'a gerek yoktur....

  ==   IOEXCEption"== Input Output Exception demektir.112 gibidir... Butun problemleri halleder.

4      4) Gordugunuz gibi; "IOEXCEption" ve FileNotFoundException' biz kodu yazarken ortaya cikti. D
     daha run butonuna basmadan ortaya cikti. bu tarz Exceptionlara COMPILE Time ExCEPTION denir. diger adi "CHECHED EXCEPTION  'dir..

     Compile Time EXceptionlar KESINLIKLE halledilmelidir. Halletmeden coda yazmaya devam etmeyiniz.

     Exception'u halletmeye HAndle etmek deniyor. yani Exception Handling. Bir isi alip basindan sonuna kadar bitirmeye Handle etmek denir.

     */

    public static void main(String[] args) throws IOException {
        readtheTextFromTheFile();
        readTheText();
    }

    // Bir text file'daki text 'i okuyan kodu yaziniz.
      /// YOL  1 ==== ADRES YANLIS OLDUGUNDA APP DURSUN DERSE BUNU YAPMALISIN.
     public static void readtheTextFromTheFile() throws IOException {// FileNotFound in parent idir...

         FileInputStream fis = new FileInputStream("src/main/java/day27compileexception/File1.txt");

        int k = 0;

         while ((k = fis.read() )!= -1) {
             System.out.print((char)k);

         }
     }

    /// YOL2====ADRES YANLISSA BASKA YOL BULSUN. GENELLIKLE DAHA COOK KULANILIR...

    public static void  readTheText() {
        try {
            FileInputStream fis = new FileInputStream("src/main/java/day27compileexception/File1.txt");


            int k = 0;

            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosyanin adresi veya varligi ile ilgili bir problem var");

        } catch (IOException e) {
            System.out.println("Dosyada okunamayan bir karakter var");
        }
    }
}
