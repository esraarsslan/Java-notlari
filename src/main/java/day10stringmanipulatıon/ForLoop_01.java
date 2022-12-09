package day10stringmanipulatıon;

public class ForLoop_01 {

    public static void main(String[] args) {
        //Example: Ekrana 5 kere "Hi" yazdiirnz.
// her gun yaptıgım seyler loop System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
      /*
    tekrarlı isler icin LOOP kullanilir...
    Dort cesit loop vardr...
    1)for-loop
    2)while-loop
    3)do-while-loop
    4)for-each-loop
         */


        //1)for-loop
        //Example===Ekrana 5 kere "Hi" yazdiriniz....

        // İlk bolum baslangıc degeri
        //ikinci yere loop hangi sart altında calısacak onu yazacagız
        //3. boume increment(arttırma) ya da azaltma(decrement) yazacagız



          /*
           for ( int i=1 ; i<6 ;  i = i+1 ){

               System.out.println("Hi");
            }
    */
        //Exp3= 4'ten 7'e kadar tum tamsayiları ekrana yazdiran kodu yaziniz...
        for (int i = 4; i < 8; i = i + 1) {
            System.out.print(i + " ");
        }
        System.out.println();
        // 14'den 5'e kadar tum tamsayiları ekrana yazdıran kodu yaziniz...
        for (int i = 14; i > 4; i--) {
            System.out.print(i + " ");
        }
        // Example 5: 14'den 5'e kadar tum cıft sayiları yazdiriniz.
        for (int i = 14; i > 4; i = i - 2) {
            System.out.print(i + " ");//14,12,10,8,6
            System.out.println();
        }

        // 2.YOL:
           /* for (int i=14; i>4  ; i--) {
                if (i%2 == 0) {
                    System.out.print(i + " ");
                }
                System.out.println();



            // Example 6: 28'den 157'ye kadar tum tek sayilari ekrana yazdiran kodu yaziniz.

            for (int i=28; i<158; i++) {
                System.out.println(i + " ");
            }
                if (i % 2 != 0) {
                    System.out.println(i);

                }

            */
        System.out.println();
        //Example 7: "Java" String'ini "J*a*v*a*" String'ine ceviren kodu yaziniz..


        String str = "Java";

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + "*");
        }
        // Exp8: Size verilen String'de tekrarsız karakterleri ekrana yazdirin...
        // "Helloooo Ali ==>HeAi
        System.out.println();

        String s = "Hellooo Ali";
                for (int i=0; i<s.length(); i++){
                    char c =s.charAt(i);
                    if (s.indexOf(c)==s.lastIndexOf(c)){
                    System.out.print(c);// He Ai

                }



                }}}



