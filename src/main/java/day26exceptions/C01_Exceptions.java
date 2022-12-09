package day26exceptions;

public class C01_Exceptions {

    public static void main(String[] args) {


            String str = "123";
          int result =   convertStringToInteger(str);
        System.out.println(result+5);  //128

        String st = "1a2b";
      int r =   convertStringToInteger(st);//NumberFormatException// eger icinde rakandqn farkli karaker barindiran
        // bir stringin valueof methodu kullanaak Integer'a cevirmek isterseniz NumberFormatException/ airsiniz.

        System.out.println(r + 10);
    }
    public static int convertStringToInteger(String str) { // stringken integer oldu.
        //return Integer.valueOf(str);// return type voidden farkliysa return demek zorunda idik....

        int i = 0;
        try {
            // Herhangi br satirda "Exception" atilirsa Java direkt "Catch bolumune geceert.
            //Try icindeki sOnraki kodlari calistirmaz.
            i = Integer.valueOf(str);
            System.out.println("Burasi try bolumu");
        }catch (NumberFormatException e){

            System.out.println("Rakam olmayan karakter iceren string'ler Integer'a cevrilemez");
        }

        return i;
    }



}

