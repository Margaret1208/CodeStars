package Day5.Abstract;

public class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("Vẽ Circle với màu "+ getColor());
    }
}
