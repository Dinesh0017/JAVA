import java.text.DecimalFormat;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // interface of A
        MyClass obj=new MyClass();

        obj.meth1();
        obj.meth2();

        //interface of Test

        Circle my=new Circle();

        double area_of_circle=my.area(7.00);
        DecimalFormat s=new DecimalFormat("#.000");
        String fin=s.format(area_of_circle);
        System.out.println("Area of circle is "+fin);


    }
}