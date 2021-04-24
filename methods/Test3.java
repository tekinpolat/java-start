
public class Test3 {

    public static void test(){
        System.out.println("Test method");
    }

    public static int test2(){
        return 35;   
    }


    public static double test3(){
        return 3.67;
    }

    public static boolean isMarried(){
        return true;
    }
    
    public static void main(String [] args){
        /**
         * 
         * methodlar dönüş tipine göre 2 ayrılır 
         * 1 - değer dönderen      return 
         * 2 - değer döndermeyen   (non-return)  => void
         * 
         */

         test();
         int sonuc1 = test2();
         System.out.println("sonuc1 => " + sonuc1);

         double sonuc2 = test3();
         System.out.println("sonuc2 => " + sonuc2);


         //boolean => true, false

         if(4 > 2){  //4 > 2    ==> true
            System.out.println(4 > 2);
         }

         // 4 < 7 => true   5 > 8 => false   true && false  ==> false
         if( 4 < 7 && 5 > 8){   
            System.out.println(" 4 < 7 5 > 8 ");
         }
    }
}
