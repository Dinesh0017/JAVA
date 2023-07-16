// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(-5);
        try {
            double area = shape.calculateArea();
            System.out.println("Area: " + area);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }
}