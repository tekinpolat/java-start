import java.io.File;
import java.util.Scanner;
public class File2{
    public static void main(String [] args){
        try{
            File file =  new File("test1.txt");

            Scanner scanner = new Scanner(file);
            String line ;
            while (scanner.hasNextLine()) {   //true  true true false
                line = scanner.nextLine();
                System.out.println(line);
            }
            /* 
                Tekin POLAT
                Özkan TÜZER
                Ali KOÇ
            */
        }catch(Exception ex){

        }
    }
}