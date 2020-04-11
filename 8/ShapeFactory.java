
public class ShapeFactory {
    public enum Type {
        Triangle, Circle, Square
    }

    public Shape createShape(ShapeFactory.Type shapeType, double length) {
        if (shapeType == ShapeFactory.Type.Triangle) {
            Triangle triangle = new Triangle(length);
            return triangle;
        } else if (shapeType == ShapeFactory.Type.Circle) {
            Circle circle = new Circle(length);
            return circle;
        } else {
            Square square = new Square(length);
            return square;
        }
    }
}
