package Day5.Polymorphism;

public class Testoverloading {
    public static void main (String[] args){
        System.out.println(Adder.add(19000000,7));
        System.out.println(Adder.add(19000000,7,10));
        System.out.println(Adder.add(19000000,7,10, 0.2F));
        System.out.println(Adder.add(19000000,7,10,0.45F));
    }
}
