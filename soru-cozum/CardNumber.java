import java.util.Scanner;

public class CardNumber{
    public static void DEBITCARD() {
        Scanner giris = new Scanner (System.in);
        System.out.println("Kart numaranızı giriniz:");
        String kartNo = giris.next();
        int BASLANGICUZUNLUGU = 12;
        
        int maskedLength = kartNo.length() - BASLANGICUZUNLUGU ;
        StringBuilder yeni = new StringBuilder();
        for (int i = 0; i < maskedLength; i++) {
            yeni.append('#');
        }
        String yenii = kartNo.substring(0,BASLANGICUZUNLUGU ) + yeni ;
        System.out.println(yenii);
        giris.close();
    }

    public static void debitCardControl(){
        //variable == değişken
        Scanner giris = new Scanner (System.in);
        //System.out.print("Kart numaranızı giriniz:");
        String kartNo =  "1234567891234567"; //giris.next();
        final int CARD_LENGTH = 16;

        //012345         15
        //1234567891234567
        String result = "";
        for(int i = 0; i < CARD_LENGTH - 4; i++){
            //System.out.print(kartNo.charAt(i)+"####"); 
            //result = result + String.valueOf(kartNo.charAt(i));     // String + char
            //result = result + ""  + kartNo.charAt(i) ;  //char + String    String + char
            result = result + kartNo.charAt(i);        // string > char    double > int    12.5 + 14 upcasting
        }

        result += "####";

        System.out.println(result);
        giris.close();
    }



    public static void main(String [] args){
        //String class -->methodları
        //               012345
        //String number = "Tekin";
        //length, charAt(1)
        debitCardControl();

        
    }
}