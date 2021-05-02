import java.util.Scanner;
public class JadenCase {

    public static String toJadenCase(String phrase) {
         if(phrase == null || phrase.equals("")){
             return null;
         }
         //"How can mirrors be"
         String phraseWords [] = phrase.split(" ");    // {"How","can","mirrors"}
         int phraseWordsLength = phraseWords.length;
         String firstLetterUpper;
         for(int i = 0; i < phraseWordsLength; i++){
             firstLetterUpper  = String.valueOf(phraseWords[i].charAt(0)).toUpperCase();
             phraseWords[i]    = firstLetterUpper + phraseWords[i].substring(1);
         }
 
         //{"How","Can","Mirrors","abc","xyz"}
         String result = "";
 
         for(String value:phraseWords){ //foreach
             result = result + " " + value ;
         }
 
         //" How Can Mirrors abc"
 
         return result.substring(1);
         
   }

   public static void toJadenCase2(){
        Scanner giris=new Scanner(System.in);
        char ilk;
        String sonuc = "";
        String ilks;
        System.out.print("Cumle giriniz:");
        String cumle=giris.nextLine();
        String kelime[]=cumle.split(" ");
        //int uzunluk =cumle.split(" ").length;
        int uzunluk = kelime.length;
        for (int i=0; i<uzunluk; i++) {
            ilks = kelime[i].charAt(0) + "";
            //ilks = String.valueOf(ilk);
            //System.out.print(ilks);
            kelime[i] = kelime[i].replace(ilks, ilks.toUpperCase());
            sonuc =  sonuc+" "+kelime[i];
            //System.out.println(sonuc);
            
        }
        //"merhaba" "ben" "can"
        //3
        //Merhaba
        System.out.println(sonuc);
   }

   public static void main(String [] args){
       toJadenCase2();
   }
 
 }