
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class TestBufferReadWrite{

    public static void test(String name){

    }

    public static int fact(int number){
        int factResult = 1;
        for(int i = number; i  > 0; i--){
            factResult *= i;
        }

        return factResult;  //6
    }

    public static void write(String filename, int number){
        try{
            //FileWriter file = new FileWriter(filename, true);
            //BufferedWriter buffer = new BufferedWriter(file);

            BufferedWriter buffer = new BufferedWriter(new FileWriter(filename, true))
            int factResult;
            for(int i = 0; i < number; i++){
                factResult = fact(i);
                buffer.write(factResult + "\n");
                System.out.println(i + " faktöriyeli hesaplandı");
            }

            buffer.close();
            //file.close();
        }catch(Exception ex){
            System.out.println("Hata => " + ex);
        }
        
    }

    public static void readFile(String filename){
        //Scanner dosya okuduk
        try{
            //FileReader file = new FileReader(filename);      //dosyayı okuyor RAM atıyor
            //BufferedReader input = new BufferedReader(file); //RAM'den okuyoruz

            BufferedReader bf = new BufferedReader(new FileReader(filename));
            String line;
            int result;
            while ((line = bf.readLine()) != null) {
                result = fact(Integer.parseInt(line));
                System.out.println(line + " --> " + result);
            }

            bf.close();


        }catch(Exception ex){
            System.out.println("Hata => " + ex);
        }
        
    }


    public static void main(String [] args){
        //readFile("numaralar.txt");
        write("fact_result.txt", 10);
    }
}