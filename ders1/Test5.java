public class Test5 {
    public static void main(String [] args){
        //condition switch   (ALU)
        int not = 72;

        if (not > 90){                                 // 95 > 90  => true   72 > 90 => false
            System.out.println("Notunuz AA");
        }else if(not > 80){                            // 72 > 80  => false
            System.out.println("Notunuz BA");
        }else if(not > 70){                            // 72 > 70  => true    
            System.out.println("Notunuz BB");
        }else if(not > 60){
            System.out.println("Notunuz CC");
        }else{
            System.out.println("Kaldı");
        }


        
        


    } 
}
