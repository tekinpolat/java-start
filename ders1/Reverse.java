import java.util.Scanner;

public class Reverse{

    public static void main(String [] args){
        Scanner giris=new Scanner(System.in);

    	System.out.print("Ters cevirmek istedginiz kelimeyi giriniz =>");
        String kelime=giris.next();
        
        //01234
        //world

        //println
        //print
        char sonuc;
    	for(int i=kelime.length(); i>0; i-- ) {
    		sonuc = kelime.charAt(i-1);
            System.out.print(sonuc);
        }
        System.out.println();
    }
}
