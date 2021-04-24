
public class Test2{
    public static void factoriyel(int sayi){
        int fact = 1;

        for(int i = 2; i <= 10; i++){
            fact *=i;
        }

        System.out.println(sayi + " Factoriyel sonuc => " + fact);

    }
    public static void main(String [] args){
        
        factoriyel(10);
        factoriyel(20);
        factoriyel(14);
        factoriyel(7);

        for(int i = 50; i <= 100; i++){
            factoriyel(i);
            //factoriyel(50)
            //factoriyel(51)
            //factoriyel(52)
            // ....
            //factoriyel(100)
        }
    }
}