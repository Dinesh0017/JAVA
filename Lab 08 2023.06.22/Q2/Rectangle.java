public class Rectangle implements Shape{

    private double len,wid;


    public Rectangle(double len, double wid) {
        this.len = len;
        this.wid = wid;
    }

    public double getLen() {
        return len;
    }

    public void setLen(double len) {
        this.len = len;
    }

    public double getWid() {
        return wid;
    }

    public void setWid(double wid) {
        this.wid = wid;
    }

    @Override
    public double calculateArea() {
        return len*wid;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(len+wid);
    }
}
