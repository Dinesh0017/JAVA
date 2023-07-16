// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try {
            int number = -10;
            if (number < 0) {
                throw new NegativeNumberException("Negative numbers not allowed.");
            }
            System.out.println("Number: " + number);
        } catch (NegativeNumberException e) {
            System.out.println("Caught NegativeNumberException: " + e.getMessage());
        }
    }
}