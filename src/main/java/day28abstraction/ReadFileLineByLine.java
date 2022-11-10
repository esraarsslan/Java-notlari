package day28abstraction;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

        /****INTERVIEW SORUSU****
         * "throw" ile "throws"  aradinDAKI FARKLAR NELERDIR?
        1)  * THROW;  METHOD'UN BODY'SI ICINDE KULLANILIR.
         ---throws ise; method'un isminden sonra kullanilir.
        2)  * "throw"  ; 'DAN SONRA OBJE OLUSTURULUR. NEW DEMEK YANI...
         ---throws'dan sonra ise; sadece exception class'in ism,i yazilir.

        3) *  THROW" (exception uretir) METHOD'UN ICINDE ISTEDIGIMIZ YERDE EXCEPTION ATMAK ICIN KULLANILIR.
        --- throws ise; (var olan exception i atar)varolan checked exception'u atmak icin kullanilir...

         4)  *  THROW 'DAN SONRA SADECE BIR TANE EXCEPTION OLABILIR.
         ---throws'dan sonra birden fazla  Exception olabilir...limit yok virgul koy digerini yaz...
 */

public class ReadFileLineByLine {

    public static void main(String[] args) {
        readFileLineByLine(); // textfile i satir satir okur. bunun icin de vuffer reader objesina ihtiyac var.
    }

    public static void readFileLineByLine(){

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/java/day27exceptions/File1.txt"));

            String line = br.readLine();

            while(line!=null){
                System.out.println(line);
                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Ya path yanlis ya da dosya silinmis - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Okunamayacak character veya characterler var - " + e.getMessage());
        }

    }
}