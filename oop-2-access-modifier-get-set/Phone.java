public class Phone {
    
    // marka
    // yıl
    // fiyat
    private String brand;
    private int year;
    public double price;

    public Phone(String  brand, int year){
        this.brand = brand;
        this.year = year;
    }


    //set/get methodları
    //set --> ayarlamak
    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return this.brand;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return this.year;
    }

    public void print(){
        //System.out.println(this.brand.equals(this.getBrand()));
        //System.out.println("Marka = " + this.brand);
        //System.out.println("Marka = " + getBrand());
        System.out.println("Marka = " + this.getBrand());
        System.out.println("Year = " + this.year);
        System.out.println("Price = " + this.price);
        System.out.println("********");
    }

}
