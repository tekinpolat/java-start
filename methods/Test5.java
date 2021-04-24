
public class Test5 {
    public static void topla(int sayi1, int sayi2){
        sayi1 = 7;
        System.out.println(sayi1);
    }

    public static void test_arr(int [] sayilar){
        sayilar[0] = 21;
    }
    public static void main(String []args){
        //double kdv = 0.8;
        int sayi1 = 3, sayi2 = 5;
        topla(sayi1, sayi2);

        System.out.println("Sayi1 => " + sayi1);

        //                0 1 2 3
        int sayilar[] = { 1,2,3,5};
        test_arr(sayilar);

        System.out.println("Dizinin 0. index => " + sayilar[0]);


        //call by value
        //call by refrence (ramdaki adresi)
    }
}
