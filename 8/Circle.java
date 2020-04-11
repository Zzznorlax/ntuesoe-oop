
public class Circle extends Shape {
    @Override
    public void setLength(double length) {
        super.length = length;
    }

    @Override
    public double getArea() {
        return Math.PI * 0.25 * super.length * super.length;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * super.length;
    }

}
