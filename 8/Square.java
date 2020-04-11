
public class Square extends Shape {
    public Square() {
        super();
    }

    @Override
    public void setLength(double length) {
        this.length = length;
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
