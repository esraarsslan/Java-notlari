package day12loopss;

public class DoWhileLoop_01 {
    public static void main(String[] args) {
// While loop bazi durumlarda hic calimayabilir....yani' whileloop icin zero execution (sifir uygulama)  mumkundur.
// while-loop için loop body'si içindeki kodun hiç çalıştırılmama ihtimali vardır.
//do-while-loop'un body'si içindeki kod her halükarda en az bir kere çalışır.      int i= 1;
       /*
        while (i<1){

            System.out.println("While Loop");
          i++;
        }
        int k =1; // do while loop kullanidiginizda kod en az bir kez calisir...
        do {
            System.out.println("do-while loop");
            k++;
        }while(k<1);
*/
        //Example 1: Bir ondalik sayinin ondalik kismindaki rakamlarinin toplamini bulunuz
        // 24.5673 ==>5+6+7+3=23

        double num = 24.5673;



        System.out.println(num);

        String str = String.valueOf(num);
        System.out.println(str);// 24.5673

        // Regex icin nokta kullandiginizda onune \\ koyunuz... yani nokta "\\" seklinde kullanilir

        String decimalPart = str.split("\\.")[1];
        System.out.println(decimalPart);//5673

                int decimalInt = Integer.valueOf(decimalPart);
        System.out.println(decimalInt); // 5673

        int sum=0;

        do {

            sum= sum+ decimalInt%10;
            decimalInt = decimalInt/10;


        }while (decimalInt>0);
        System.out.println(sum);//21


    }
}
