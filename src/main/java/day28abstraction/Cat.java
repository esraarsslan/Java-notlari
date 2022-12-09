package day28abstraction;

public class Cat extends Mamal{

        /*** ABSTRACT OLMANIN 2. FAYDASI
         * Bir method parent class' da abstract method ise;
         * child class o method'u OVERRIDE edip kullanmak zorundadir.
         * Bu yuzden ; herhangibir fonksiyonu
         * child class icin MECBURI YAPMAK istersenizo method'u ABSTRACT yapmalisiniz.

         */
        @Override
        public void eat() {
                System.out.println(" Cats eat");

        }

        @Override
        public void move() {
                System.out.println("Cats move");

        }
}
