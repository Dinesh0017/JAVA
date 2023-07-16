// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        try {
            int a = 5;
            int b = 0;
            int c = a / b;                           // ArithmeticException

            int num = Integer.parseInt("Hello"); // NumberFormatException

            int[] numbers = new int[5];
            numbers[10] = 45;                     // ArrayIndexOutOfBoundsException

        } catch (ArithmeticException e) {
            System.out.println("Divided by 0" + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

    }
}