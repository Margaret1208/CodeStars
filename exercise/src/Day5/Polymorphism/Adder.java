package Day5.Polymorphism;

public class Adder {
    static int add (int a, int b){
        return  a*b;
    }
    static int add (int a, int b, int c){
        return a*b*c;
    }
    static float add (int a, int b, int c, float d){
        return a*b*c*d;
    }
}
