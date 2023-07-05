import java.text.DecimalFormat;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int grd,count=0;
        int [] Grades=new int[20];
        double avge;
        int sum=0;



        Scanner grades=new Scanner(System.in);
        System.out.println("Enter your Grades(up to 20 grades, when -1 enter stop)..!");

        for(int i=0;i<20;i++){
            System.out.println("Enter Your Grade: ");
            grd=grades.nextInt();

            if(grd==-1){
                break;
            }
            Grades[count]=grd;
            sum=Grades[i]+sum;
            count++;
        }
        System.out.print("Grades Array is ");
        for(int j=0;j<count;j++){
            System.out.print(Grades[j]);

                if(j!= count-1){
                    System.out.print(",");
                }

        }
        System.out.println();
        avge=sum/count;

        DecimalFormat  c= new DecimalFormat("#0.00");
        String average = c.format(avge);

        System.out.println("Average of Grades are "+average);
        System.out.println("There are "+count+" grades in this array.");
    }
}