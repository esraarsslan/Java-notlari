package day22inheritancepolymorphism;

public class MAmal extends Animal {

    public int a = 13;
    public int b = 34;

    public void eat() {
        System.out.println("MAmal Eat");
    }

    public void drink(){
        System.out.println("MAmal drink");
    }
    public MAmal(){
        System.out.println("MAmal");
    }
}