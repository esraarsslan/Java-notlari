package day12loopss;

import java.util.Scanner;

public class NestedForLoops01 {
    public static void main(String[] args) {

        //Asagidaki sekli ekrana yazdiran kodu yazinin
        // ****
        // ****
        // ****
        // yukardan asagiya loop yazdirmaliyim ve sagdan sola giden bir loop vaa...


        Scanner input = new Scanner(System.in);

        System.out.println("SAtir sayisini giriniz...");
        int satir = input.nextInt();

        System.out.println("Sutun sayisini giriniz...");
        int sutun = input.nextInt();

        System.out.println("Karakter seciniz");
        char ch = input.next().charAt(0);

        for (int i = 1; i <= satir; i++) {
            for (int k = 1; k <= sutun; k++) {
                System.out.print(ch);
            }

            System.out.println();// ust satirdakileri al asagiya yaz demek...

        }

         /*

        Example 2: Aşağıdaki şekli çizen kodu yazınız.
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
                */


      /*
        for (int i=1; i< 6;  i++){

            for (int k=1; k<=i ; i++){
                System.out.print(k + " ");
            }
            System.out.println();
        }

           */
          /*

        Example 3: Asagidaki sekil cizen kodu yaziniz

                    * * * *
                    * * *
                    * *
                    *
 */ /*
        Example 3: Asagidaki sekil cizen kodu yaziniz

                    * * * *
                    * * *
                    * *
                    *
            */

        int row =4;


        for (int i=1; i<=row;   i++  ){
            for (int  k= row; k>= i; k-- ){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
