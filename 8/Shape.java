
public abstract class Shape {
    protected double length;

    public abstract void setLength(double length);

    public abstract double getArea();

    public abstract double getPerimeter();

    public String getInfo() {
        return String.format("Area = %.2f, Perimeter = %.2f", this.getArea(), this.getPerimeter()) ;
    }

}
