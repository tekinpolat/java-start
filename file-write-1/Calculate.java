import java.util.Random;
import java.io.FileWriter; 
import java.io.IOException;
public class Calculate{

    public static double calculate(int n){
        double total = 0;
        /*
        for(int i = 1; i <= n; ++i){
            //total += 1/(Math.pow(2, i));
            total += Math.pow(0.5, i);
        }
        */

        int i = 1;
        while (i <= n){
            total += Math.pow(0.5, i);
            //System.out.println(total);
            i++;
        }

        return total;
    }

    public static void main(String [] args){
        Random ran = new Random();
        double cal; 
        for(int i = 1; i <= 100; i++){
            //int randomNumber = ran.nextInt(10);
            //cal = calculate(randomNumber);
            //System.out.println(randomNumber + " => " + calculate(randomNumber));
            try {
                FileWriter fileWriter = new FileWriter("sonuc.txt", true);
                //FileWriter fileWriter = new FileWriter("/home/tekinpolat/Desktop/sonuc.txt", true);
                fileWriter.write(i + "=>" + calculate(i) + "\n");
                fileWriter.close();
            }catch(IOException e){
                System.out.println(e);
            }
        }
        
        //dir
        
    }
}