package pratice;

public class Circle extends Shapes {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.colorShape();
        
    }
    @Override
    public void drawShape() {
        System.out.println("This is a Drawing circle");
    }

    @Override
    public void colorShape() {
        System.out.println("This is a color shape");
    }

    @Override
    public void moveShape() {
        System.out.println("This is moving shape");
    }
}
