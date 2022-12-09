package day18arraylistpassbyvalue;

public class C03postPreIncrementDEcrement {
    public static void main(String[] args) {
        /*** SERTIFIKA SINAVINDA CIKIOMUSS*****
        POST INCREMENT==sonra arttir demek
         PRE INCREMENT===once arttir
         */

        // POST INCREMENT
        int a= 5;
        int b= a++;// anin degerini b'ye koy demek. yani 5 i b'ye koy demek
        System.out.println(b);//5 java anlamli bir cumle duydugunda hemen uygular
        System.out.println(a);//6

        //PRE INCREMENT=== ONCE ARTTIR

        int c =10;
        int d = ++c;
        System.out.println(c);//11

        //POST DECREMENT ===SOnra azalt

        int e= 20;

        int f= e--;
        System.out.println(f);//20
        System.out.println(e);//19

        // PRE DECREMENT
        int h =30;
        int  i =--h;
        System.out.println(h);//29
        System.out.println(i);//29
    }
}
