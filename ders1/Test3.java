public class Test3 {
    
    public static void main(String [] args){
        //değişken isimlendirme kuralları
        //1- _ veya harfle başlamalı
        //2- değişken adında özel karakter olmamalı(%, +, -, ^, )
        //3- değişken adında boşluk olmamalı
        //4- !!! Değişken adlarında türkçe karakter olmamalıdır(ğ, ü, ş, ı, ö, ç,)

        int buyuk_sayi = 21;  //kepap Case?
        int buyukSayi = 35;   //camel Case   (Javacılar bu kullanır)

        int sayı = 45;             //değişkende türkçe karakter kullanmıyor
        System.out.println(sayı);
    }
}
