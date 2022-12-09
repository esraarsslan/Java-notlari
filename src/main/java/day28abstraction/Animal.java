package day28abstraction;

    public abstract class Animal {

    public  abstract  void eat();
    // Body'si olmayan methodlar "Abstract method olarak adlandirilirlar"...
// bir methodu abstact yapmak icin 1. body i sil.
       // 2) Access modifer ile return type arasina abstract yazmalisiniz
// abstract methodlar abstract class icinde olmalidir.

        // Abstract classlarda hem abstract  hem de " concrete"( non- abstract) method kullanilabilir.
        public void drink () {
            System.out.println(" Animald drink");

        }
        // abstract "move" method olusturunuz.

        public  void move(){
            System.out.println("Animal move");
        }
    }

