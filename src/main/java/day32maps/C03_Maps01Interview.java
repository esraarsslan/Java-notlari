package day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class C03_Maps01Interview {

    public static void main(String[] args) {

        // Size verilen bir cumledeki her kelimenin kac kere kullanildigini gosteren kodu yaziniz.
        // I like to move , it move it...==> i=1' like= 1; to= 1, moe=2, it= 2
        // akliniza map gelecek. Ama noktalama isasretlerini de unutmuycaz.

        String str = "I like to move it, move it.";
        // ilk olarak noktalama isaretlerini silecegiz. cunku java farkli kelime sanir tektar edenleri...

        str.replaceAll("\\p{Punct}", "");

        System.out.println(str);//I like to move it move it

        // Kleimleri almak icin split() kullanalim. split () bize String array verir.

       String [] kelimeler=  str.split(" ");

        System.out.println(Arrays.toString(kelimeler));// [I, like, to, move, it,, move, it.]


        HashMap<String, Integer> gorunum = new HashMap<>();

        System.out.println(gorunum);// {} bos bir map olstu.

        for (String w: kelimeler){
           Integer gorunumSayisi=  gorunum.get(w);// Eger bu kelime burda kullanilmissa value sini verir. Kullnailmadiysa null verir.

            if (gorunumSayisi == null) {

                gorunum.put(w, 1);

            }else{
                gorunum.put(w, gorunumSayisi+1);

            }

        }

        System.out.println(gorunum);// {it,=1, move=2, it.=1, like=1, I=1, to=1}

    }
}
