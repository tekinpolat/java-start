
public class Test1{
    public static void main(String [] args){
        
        int fact = 1;

        for(int i = 2; i <= 10; i++){
            fact *=i;
        }

        System.out.println("Factoriyel sonuc => " + fact);


        fact = 1;

        for(int i = 2; i <= 10; i++){
            fact *=i;
        }


        // 2 <= 10  true
        // 10 <= 10 true
        // 11 <= 10 false

        System.out.println("Factoriyel sonuc => " + fact);
    }
}