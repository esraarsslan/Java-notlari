package day23polimorfisim_Override;

public class Animal {

    public void eat(){
        System.out.println("Animals eat");
    }

    public int add(int a, int b){
        return a+b;

        }
public Integer multiply(int a, int b){
        return a*b;
}
// Asagidaki method " Overridden Method"==override edilmis.
        public Animal creat (){
        return new Animal();
        }
        // Final methodlar override edilemezler...
        public final double divide(int a, int b){
        return a/b;
        }
}
