import java.util.Locale;
import java.util.Date;
public class PrintfTest {
    
    public static void main(String [] args){
        //args  --> arguments
        System.out.printf("Merhaba %s\n", "Tekin");   //f --> format
        System.out.printf("ilk sayi %d ikinci sayi %d\n", 23, 34);

        System.out.format("");

        Date data = new Date();
        System.out.printf(Locale.FRANCE, "Printing current data and time: %tc", data);
    }
}
