package assign2;

abstract class DifferentShapes {
    abstract void draw();
}

class Circle extends DifferentShapes {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle extends DifferentShapes {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class Shape {
    public static void main(String[] args) {
    	DifferentShapes shape1 = new Circle();
    	DifferentShapes shape2 = new Rectangle();

        shape1.draw();
        shape2.draw();
    }
}