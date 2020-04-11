
public class Square extends Shape {
    @Override
    public void setLength(double length) {
        super.length = length;
    }

    @Override
    public double getArea() {
        return super.length * super.length;
    }

    @Override
    public double getPerimeter() {
        return 4 * super.length;
    }

}
