package day24statickeywordEncapsilation;

public class CarRunner {

    public static void main(String[] args) {

        Car car1= new Car();
        Car car2= new Car();
        Car car3= new Car();
        Car car4= new Car();

        /****Interview SORUSU*****
         *
         * /*
         *     Static keyword classa baglanmıs class elemanlaridir
         *    1= Static class elemanlari butun objelerin ortak elemanidir(Gokteki ay gibi)
         *   2=  Staticler uzerinde yapilan her degisiklik butun obeleri etkiler, butun objeler tarafindan gorulur.
         *    3= Static class elemanlarina class uzerinden ulasilir. Objeler staticlere ulasmak icin kullanilmaz.
         *        kullanimda hata vermez ama tavsiye edilmez.
         *
         *
         *        ****
         *) Static keyword, class'a bağlanmış class elemanlarıdır.
         *         static variable/method class'a bağlıdır.
         * 2) Static class elemanları, tüm objelerin ortak elemanıdır. gokteki ay gibi...
         * 3) Static'ler üzerinde yapılan her değişiklik, tüm objeleri etkiler ve tüm objeler tarafından görülür.
         * ayin ustune cizik atinca herkes gorur...
         * 4) Static class elemanlarına, class üzerinden ulaşılır. Objeler, static'lere ulaşmak için kullanılmaz.
         *         Kullanılırsa hata vermez, fakat tavsiye edilmez.
         *         ****
        Static keyword=classa baglanmis class elemanlaridir...Butun objelerin ortak elemanidir.
         Sratic class elemanlari her objenin ortak elemanidir.
         static uzerinde yapilan degisiklikler her class tarafindan gorulur.
         ==== Staticler override edilemez. neden? gokteki ay gibi yapilan degisikligi herkes gordugu icin.
         =====override begenmeyip alip degistirip kullanirdi.
         */
        //Static variabl'lara objeleri kullanarak ulasmak mumkun ama tavsiye edilmez.
        // Static variable'lere class ismi kullanarak ulasilabilir...
        System.out.println(car1.counter);
        System.out.println(car1.price);

        System.out.println(car2.counter);
        System.out.println(car2.price);
    }
}
