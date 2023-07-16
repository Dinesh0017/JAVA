import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        try{
            File f1=new File("C:\\Users\\dines\\OneDrive\\Desktop\\cloud computing\\New Text Document.txt");
            Scanner w=new Scanner(f1);

            while (w.hasNextLine()){
                String l=w.nextLine();
                System.out.println(l);
            }
            w.close();
        }catch(FileNotFoundException a){
            System.out.println(a.getMessage());
        }
    }
}