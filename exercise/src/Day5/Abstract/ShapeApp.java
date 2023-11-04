package Day5.Abstract;

public class ShapeApp {
    public static void main (String[] args){
        Circle c = new Circle();
        c.setColor("green");
        c.draw();
        System.out.println("____________________________________");
        Rectangle r = new Rectangle();
        r.setColor("blue");
        r.draw();
    }
}
