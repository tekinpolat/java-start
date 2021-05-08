import java.io.File;
import java.util.Scanner;
import java.util.Arrays;
public class Distance{

    public static double distanceCal(int x1, int y1, int x2, int y2){
        // ((x1-x2)^2 + (y1-y2)^2)^0.5
        int xArasiUzaklik = x1-x2;
        int yArasiUzaklik = y1-y2;
        return Math.pow(Math.pow(xArasiUzaklik, 2) + Math.pow(yArasiUzaklik, 2), 0.5);
    } 

    public static void fileRead(){
        // linux macos 
        try{
            //
            //File file =  new File("/home/tekinpolat/Downloads/uzaklik.txt");
            File file =  new File("data/uzaklik.txt");
            //File file =  new File("uzaklik.txt");
            //File file =  new File("C://Users/Can/OneDrive/Masaüstü");
            Scanner scanner = new Scanner(file);

            String line [] ;
            int x1, x2, y1, y2;
            double sonuc;
            int satir = 1;
            while (scanner.hasNextLine()) { 
                line = scanner.nextLine().split(";");
                //System.out.println(Arrays.toString(line));  // String uzaklik [] = { "1", "3", "2", "5"}
                x1 = Integer.parseInt(line[0]);
                y1 = Integer.parseInt(line[1]);
                x2 = Integer.parseInt(line[2]);
                y2 = Integer.parseInt(line[3]);
                sonuc = distanceCal(x1, y1, x2, y2 );

                System.out.println(satir + ". satir => " + sonuc);
                satir++;
            }

        }catch(Exception ex){
            System.out.println("Hata " +  ex);
        }
    }

    public static void main(String [] args){
        fileRead();
    }
}