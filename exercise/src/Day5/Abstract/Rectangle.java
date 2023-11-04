package Day5.Abstract;

public class Rectangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Vẽ rectangle với màu " + getColor());
    }
}
