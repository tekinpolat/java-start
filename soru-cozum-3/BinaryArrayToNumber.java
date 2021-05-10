import java.util.List;
import java.util.ArrayList;
public class BinaryArrayToNumber{
    public static int ConvertBinaryArrayToInt(List<Integer> binary) { 
        int binaryLength  = binary.size();
        int count         = binaryLength ;
        int decimalResult = 0;
        for(int i = 0; i < binaryLength; i++){
            //System.out.println(binary.get(i) != 0);
            if( binary.get(i) != 0 ){
                //System.out.println(i + "**");
                decimalResult +=   (int)binary.get(i)*Math.pow(2, count-1);
            }

            count--;
            
        }
        return decimalResult;
    }

    public static int ConvertBinaryArrayToInt(int [] binary){

        return 0;
    }

    public static void main(String [] args){
        //  2^3 2^2 2^1
        // [1, 0, 1, 1]
        List<Integer> binary = new ArrayList<Integer>();
        binary.add(1);
        binary.add(1);
        binary.add(0);

        int[] binaryArray = { 1, 0, 0, 1};
        ConvertBinaryArrayToInt(binary);
    }
}

//2^3,  2^2  2^1   2^0
//0,    1,   1,    0
//2^3*0 + 2^2*1 + 2^1*1 + 2^0*0

//  (10110101)          -> 8 bit (1 byte)
//  (1011010110100001)  -> 16 bit (2 byte)