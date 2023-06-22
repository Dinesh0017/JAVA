// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Circle c1=new Circle(7);
    double Carea =c1.calculateArea();
    double Cperimeter =c1.calculatePerimeter();
    System.out.println("AREA OF CIRCLE:- "+Carea);
    System.out.println("PERIMETER OF CIRCLE:- "+Cperimeter);

        System.out.println();

    Rectangle r1=new Rectangle(10.00,20.00);
    double Rarea = r1.calculateArea();
    double Rperemiter =r1.calculatePerimeter();
    System.out.println("AREA OF RECTANGLE:- "+Rarea);
    System.out.println("PERIMETER OF RECTANGLE:- "+Rperemiter);

        System.out.println();

    Trangle t1=new Trangle(10.00,5.00,10.00,15.00,12.00);
    double Tarea =t1.calculateArea();
    double Tperemiter=t1.calculatePerimeter();
    System.out.println("AREA OF TRANGLE:- "+Tarea);
    System.out.println("PERIMETER OF TRANGLE:- "+Tperemiter);

    }
}