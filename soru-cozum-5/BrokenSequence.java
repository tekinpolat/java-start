import java.util.Arrays;
public class BrokenSequence {
    public static int findMissingNumber(String sequence) {	
        String[] arr = sequence.split(" ");
        int arrLength = arr.length;
        int[] arrInt = new int[arrLength];
        for(int i = 0; i < arrLength; i++){
            try{
                arrInt[i] = Integer.parseInt(arr[i]);  
            }catch(Exception ex){
                return 1;
            }
        }

        Arrays.sort(arrInt);

        for(int i = 0; i < arrLength; i++){
            if(arrInt[i] +1 != arrInt[i+1]){
                return arrInt[i] +1;
            }
        }

        return arrInt[0]-1;
    }

    public static void main(String[] args){
        // "5 1" --> [1, 5]
        //int result = findMissingNumber("2 1 3 a");
        int result = findMissingNumber("1 3 2 4"); // [1, 2, 3, 4]
        System.out.println(result);
    }

}