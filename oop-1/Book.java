public class Book {
    //1 class adıyla aynı olmak zorundadır
    //constructor özel bir methoddur.

    public  Book(){   //constructor --> yapıcı
        String a="Book constructor çalıştır";
        System.out.println(a);
    }

    public void yazdir(){
        System.out.println("Book classında yazdir methodunu çalıştı");
    }
}
