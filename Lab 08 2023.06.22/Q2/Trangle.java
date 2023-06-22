public class Trangle implements Shape{
    private double base,perpendicular;
    private double side1,side2,side3;

    public Trangle(double base, double perpendicular, double side1, double side2, double side3) {
        this.base = base;
        this.perpendicular = perpendicular;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getPerpendicular() {
        return perpendicular;
    }

    public void setPerpendicular(double perpendicular) {
        this.perpendicular = perpendicular;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        return 0.5*base*perpendicular;
    }

    @Override
    public double calculatePerimeter() {
        return side1+side2+side3;
    }
}
