// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Shape c=new Circle();
        Shape t=new Triangle();
        Shape s=new Square();

        //polymorphic concepts

        c.draw();
        c.erase();

        t.draw();
        t.erase();

        s.draw();
        s.erase();

        //Testing method

        Test t1=new Teacher();
        Test p1=new PoliceMan();
        Test p2=new PoliceMan();

        t1.said();

        p1.said();

        p2.said();
    }
}