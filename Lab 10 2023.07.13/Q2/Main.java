// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] numbers={1,56,78,5,41,9,62,58};
        //             0, 1, 2,3, 4,5, 6, 7
        try{
            numbers[3]=89;
            System.out.println("Result is "+numbers[3]);
            int ans=numbers[2]/0;
        /*int value = numbers[10];
            System.out.println("Value "+value);*/
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Array Index Out Of Bounds Exception");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            for(int i=0;i< numbers.length;i++){
                System.out.println(numbers[i]);
            }
        }

    }
}