package day18arraylistpassbyvalue;

import static day18arraylistpassbyvalue.C05_MethodOverloading01.add;

public class C04Varargs01 {
    /***
     * 1)Farkli sayilardaki parametrelerle calisabilen bir method olusturmak isterseniz 'varargs' kullanmalisiniz.
     * 2) "Varargs" arka tarafta array kullanir. bu yuzden varagslarla calisirken "Arraylerle calisiyormus gibi davranabilirsiniz.
     * 3) "Varargs" olusturmak icin "<datas type>.....<varargs ismi>" veya "<data type>...<varargs ismi>
     * 4)  Bir method'da varargs in yaninda baska bir porametre kullanilabilir mi?
     * "VArargs en sonda olmak kaydi ile kullanilabilir.
     * 5)Bir methodda birden fazla 'varargs kullanilabilir mi?
     * "varargs en sonda olmak zrunda oldugundan birden fazla kullanirsaniz en az biri olmayacaktir. bu da 4. kural ile celisir.

     */


      /*
    1- Farkli satilardaki parametrelerle calisabilen bir method olusturmak isterseniz.
        varargs kullanmalisiniz...
    2- varargs  arka tarafta array kullanir bu yuzden varargs larla calisiken arraylerle calisiyormus
        gibi davvranabilirsiniz...
    3- varargs olusturmak icin <data type>  ...<varargs ismi> veya <data type>... <varargs ismi>
    4- varargs in yaninda baska bir parametre kullanilabilir mi?
        "varargs" en sonda olmak sartiyla kullanilir
    5- Bir method da biden fazla varargs kullanilabilir mi?
        "varargs en sonda olmak zorunda oldugundan birden fazla kullanirsaniz en az biri en sonda olmayacaktir.
        buda 4. kural ile celisir.
     */
    public static void main(String[] args) {
        int r1 = toplama(2, 3);
        System.out.println(r1);
        int r2 = toplama(2, 3, 4 );
        System.out.println(r2);
        int r3 = toplama(2, 3, 4,5,6,7,8,9 );
        System.out.println(r3);
    }
    //    //iki sayinin toplamini return eden bir method olusturunuz..
//
//    public static int toplama(int a, int b ){
//       return a+b;
//    }
//    //uc sayinin toplamini return eden bir method olusturunuz..
//    public static int toplama(int a, int b, int c ){
//        return a+b+c;
//    }
//    //dort sayinin toplamini return eden bir method olusturunuz..
//    public static int toplama(int a, int b, int c, int d ){
//        return a+b+c+d;
//    }
//
//    //// Istedimiz kadar sayiyi toplayabilecegimiz bir method olusturalim
//    // ...a  varargs denir... varargs in arkasina array calisir...
    public static int toplama(int ...a){
        int sum = 0;
        for (int w : a ) {
            sum = sum+w;
        }
        return sum;
    }
}
