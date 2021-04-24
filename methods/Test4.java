import java.util.Scanner;

public class Test4 {

    public static void test(){

    }

    public static void yazdir(){   //static 
        System.out.println("Merhaba Tekin");
    }

    public static void yazdir2(String ad){
        System.out.println("Merhaba " + ad);
    }

    public static void topla1(int sayi1, int sayi2){    //sayi1 , sayi2 --> parametre
        System.out.println("Toplam => " + sayi1 + sayi2);   //Toplam => 1                5 + 2 + 4  => 7+4 => 11   5 + 4 +3
        //Toplam => 1  => string  Toplam => 14
    }
    
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        topla1(1, 4);

        yazdir();
        yazdir();
        yazdir();
        yazdir();
        yazdir2("Tekin");
        yazdir2("Özkan");
        yazdir2("Ali");
        yazdir2("Ayşe");

        // int boolean double float => ilkel veri tipleri (Primivite)
        // String, StringBuilder, Integer, Boolean, Double

        String ad;
        for(int i = 1; i < 10; i ++){
            ad = input.next();
            yazdir2(ad);
        }


        //method parametreye  göre 2 ayrılır
        //1-parametre almayan 
        //2-parametre alan
    }
}
