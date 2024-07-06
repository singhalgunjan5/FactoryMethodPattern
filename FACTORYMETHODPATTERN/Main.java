package FACTORYMETHODPATTERN;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Get an object of Circle and call its methods
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();
        circle.shape();

        // Get an object of Rectangle and call its methods
        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();
        rectangle.shape();
        
    }
}
