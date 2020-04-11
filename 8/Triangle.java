
public class Triangle extends Shape {
    // public Triangle() {
    //     super();
    // }

    public Triangle(double length) {
        super(length);
    }

    @Override
    public void setLength(double length) {
        super.length = length;
    }

    @Override
    public double getArea() {
        return 0.25 * Math.sqrt(3) * super.length * super.length;
    }

    @Override
    public double getPerimeter() {
        return 3 * super.length;
    }
}
