// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int[] num={1,2,3,4,5,6,7};
        try {
             num[10]=45;        //ArrayIndexOutOfBoundsException
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception /" + e.getMessage());
        } finally {
           for(int i=0; i<num.length;i++){
               System.out.println(num[i]);
           }
        }
    }
}