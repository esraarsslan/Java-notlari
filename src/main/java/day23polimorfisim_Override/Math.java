package day23polimorfisim_Override;

public class Math extends Courses{


    public void practice(){
        System.out.println("Solve questions");


    }

  public Math(){
        super("Second");
      System.out.println( "Constructor 1");

    }
    public Math(int a){
        this();// Ayni clasin icinde bir constrocter kullandiktan sonra baska constroctur da kullanmak istediginizde thids yazin.

        System.out.println("Constrouctur 2");
    }
}
