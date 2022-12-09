package day31maps;

import java.util.*;

public class C01_HashMap {


    /**
     * 1) MAp'ler key-value structure kullanilir.
     * 2) Key'ler unique'dir.
     * 3)Value'lar tekrarli data icerebilir.
     * 4) Map'lerde eleman degil Entry kullaniriz.
     * 5)Key'lerde null tekrarsiz olarak kullanilir...
     * 6) Vaue'lar null kabul eder.
     * 7) Hasmapler EntrySet'leri herhangibir siralamaya tabi tutmaz; rastgele siralar.
     * 8) Sirlama ile vakit kaybetmedigi icin HashMap'ler cok hizli calisirlar.
     */

    public static void main(String[] args) {

        HashMap<String , Integer> studentAges = new HashMap<>();

        studentAges.put("Ali" , 13);
        studentAges.put("Tom", 21);
        studentAges.put("Brad" , 12);
        studentAges.put("Ajda", 76);
        studentAges.put("Cuneyt", 75);

        studentAges.put("Ali", 88);
        studentAges.put("null", 55);
        studentAges.put("null", 66);
        studentAges.put("Ayhan isik", null);
        studentAges.put("Sadri Alisik", null);

        System.out.println(studentAges);//{Tom=21, null=55, Ajda=76, Brad=12, Cuneyt=75, Ali=88} Ali=88}

        // Map'den sadece key'ler nasil alinir?

       Set<String>keys=  studentAges.keySet();// key leri set'in icinde koyarak verecek.
        System.out.println(keys);//[Ayhan isik, Sadri Alisik, Tom, null, Ajda, Brad, Cuneyt, Ali]

        // MAP'DEN SADECE VALUE'LAER NASIL ALINIR?

        Collection<Integer> values = studentAges.values();

        System.out.println(values);//[[null, null, 21, 66, 76, 12, 75, 88]

        // BELLI BIR KEY' E AIT VALUE NASIL ALINIR?
        // MESELA CUNEYT'IN YASI?map e git get (object key) sec.
        //get= verilen key'e ait valueyi size dondurur.'

        Integer  cunAge = studentAges.get("Cuneyt");
        System.out.println(cunAge);// 75

        // ExP1===Tum INTEGER YASLARIN ORTALAMASINI HESAPLAYAN KODU YAZINIZ...

        Collection<Integer> ages =  studentAges.values();

        Integer sum=0;
        int counter=0;
        for(Integer w : ages){
            if(w!=null){
               sum = sum +w;
                counter++;
            }
        }
        System.out.println("Ortalama yas : "+(sum/counter));//56



        //Example 2: A ile baslamayan isimlerin icerdigi toplam karakter sayisini bulan kodu yaziniz.
        //           [null, Ayhan Isik, Sadri Alisik, Tom, Ajda, Brad, Cuneyt, Ali]
        Set<String> names = studentAges.keySet();
        int sum1 = 0;
        //[null, Ayhan Isik, Sadri Alisik, Tom, Ajda, Brad, Cuneyt, Ali]
        for(String w : names){
            if(w!=null && !w.startsWith("A")){
                sum1 = sum1 + w.length();
            }
        }
        System.out.println(sum1);

        //remove("Ajda", 76) key'si Ajda ve value'su 76 olan EntrySet i siler ve size boolean return eder.
        boolean result = studentAges.remove("Ajda", 76);
        System.out.println(result);

        Integer result1 = studentAges.remove(null);
        System.out.println(result1);

        //Key varsa value'u ver, key yoksa sizin istediginiz degeri verir
        Integer result2 = studentAges.getOrDefault("Sadriye", 0);
        System.out.println(result2);//12

        //Value null ise ekleme yapar, value null degilse ekleme yapmaz.
        Integer result3 = studentAges.putIfAbsent("Brad", 100);
        System.out.println(result3);//12
        System.out.println(studentAges);

        Integer result4 = studentAges.putIfAbsent("Ayhan Isik", 100);
        System.out.println(result4);
        System.out.println(studentAges);

        //Key yoksa ekleme yapar
        Integer result5 = studentAges.putIfAbsent("Acun Ilicali", 200);
        System.out.println(result5);
        System.out.println(studentAges);

        //replace() method'u value'lari key'e bakarak degistirdi
        studentAges.replace("Acun Ilicali", 49);
        System.out.println(studentAges);

        //replace() method'u value'lari key ve value'yu kontrol ettikten sonra degistirdi
        studentAges.replace("Acun Ilicali", 47, 53);
        System.out.println(studentAges);


        //Example 3:Map deki herbir entry'i ekrana farkli bir satirda olacak sekilde yazdiriniz.
        //          {Ayhan Isik=100, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Acun Ilicali=49, Ali=88}

        //entrySet() method'u Map'deki elemanlari bir Set'in icine koyarak size verir
        Set<Map.Entry<String,Integer>> entries = studentAges.entrySet();
        for(Map.Entry<String,Integer> w : entries){
            System.out.println(w);
        }
    }
}