public class Book{

    private String author;
    public int pageCount;
    public double price;

            //
           //new Book("Ahmet Ümit", 300, 37.7) 
        //Book book1 = new Book("Test", 100, 13.5)
    public Book(String author, int pageCount, double price){
        this.author     = author;
        this.pageCount  = pageCount;
        this.price      = price;
    }

    public void print(){
        System.out.println("Yazar:" + this.author+ "\nSayfa Sayısı: " + this.pageCount + "\nPrice " + this.price);
        System.out.println("********");
    }

    
}