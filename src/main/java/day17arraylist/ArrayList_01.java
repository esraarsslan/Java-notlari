package day17arraylist;

import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.List;

public class ArrayList_01 {


    /***
     Removeall()====Sadece ilk list degisir ikincisi parantez icindeki listdegismez...
     */
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");
        System.out.println(names);

        List<String> cities = new ArrayList<>();
        cities.add("Trump");
        cities.add("Tom");
        cities.add("Taceddin");

        names.removeAll(cities);
        System.out.println(names);// [Thomas, Tahsin]
        System.out.println(cities);// [Trump, Tom, Taceddin]

        List<String> myNames = new ArrayList<>();// Stringlerde buyuk kucuk harf farkeder her zaman...

        myNames.add("Thomas");
        myNames.add("Thasin");

        boolean sonuc1 = names.containsAll(myNames);// Bir listin icinde coklu elemanlarin var olup olmadigini kontrol eder.
        // hepsi varsa True; en az biri varsa false verir.


        List<String> a = new ArrayList<>();

        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");

        // EXP==="a" listinde " Shoes" elemaninin ilk gorunumunu siliniz...(3 kez gorunuyor da ondan)
        // Remove kullanacagiz silmekten bahsettigi icin...

        a.remove("Shoes");
        System.out.println(a);//[TV, Radio, Laptop, Shoes, Book, Shoes]

        //EXP@==="a" listesinde "shoes" elemaninin tum gorunumlerini siliniz.

        //tum dedigi icin RemoveAll kullanacagz ma tekrardan list olusturmamiz gerekir yoksa calisaz...

        List<String> silinecekler = new ArrayList<>();
        silinecekler.add("Shoes");
        a.removeAll(silinecekler);
        System.out.println(a);//[TV, Radio, Laptop, Book]

        // EXP#===Bir tane salary listi olusturun; eger salary 10000'den az ise %20 ;10000'den cokk ise %10 zam yapiniz.
        // java da para hep double' dir....
        List<Double> salary = new ArrayList<>();
        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);
        System.out.println(salary);

        for (Double w : salary) {
            if (w < 10000) {
                salary.set(salary.indexOf(w), w * 1.2);

            } else {

                salary.set(salary.indexOf(w), w * 1.1);

            }
        }
        System.out.println(salary);//[13579.500000000002, 10409.4, 16500.825, 11400.0, 22550.000000000004]

        // ExP4=== iki Array'in esit olup olmadigini kontrol eden kodu yaziniz...
  /*** NOTE=== iki Arraylist'in esit olabilmesi icin elemanlar esit olmali ve ayni elemanlar ayni indexte olmali...
   * Listlerin eleman sayilari farkli ise elemanlara birer birer bakmaya gerek yok.
   *

   */

        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

        // 1.YOL===

        int counter = 0;
        for(int i = 0; i<m.size(); i++){

                    if(m.size()!=n.size()){// BURASI LISTENIN ELEMAN SAYISI ESIT OLMADIGINDA YAZDIK...
                        counter++;
                        System.out.println("Listler esit degildir");
                        break;

                    }else if(m.get(i) != n.get(i)){
                        counter++;
                        System.out.println("Listler esit degildir");
                        break;
                    }
                }
                if(counter==0){ // BUNA "FLAG" DENIR....
                    System.out.println("Listler esittir");
                }

                //2.Yol:
                boolean esitmi = m.equals(n);

                if(esitmi){
                    System.out.println("Listler esittir");
                }else{
                    System.out.println("Listler esit degildir");


            }
        }
    }

