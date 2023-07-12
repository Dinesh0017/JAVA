public class Circle implements Test{
    @Override
    public double area(double r) {
        double circlearea;
        circlearea=Math.PI*r*r;
        return circlearea;
    }
}
