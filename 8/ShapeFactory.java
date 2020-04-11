
public class ShapeFactory {
    public enum Type {
        Triangle, Circle, Square
    }

    public Shape createShape(ShapeFactory.Type shapeType, double length) {
        if (shapeType == ShapeFactory.Type.Triangle) {
            Triangle triangle = new Triangle();
            triangle.setLength(length);
            return triangle;
        } else if (shapeType == ShapeFactory.Type.Circle) {
            Circle circle = new Circle();
            circle.setLength(length);
            return circle;
        } else {
            Square square = new Square();
            square.setLength(length);
            return square;
        }
    }
}
