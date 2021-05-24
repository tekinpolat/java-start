public class SplitIndex {

    public static int splitIndex(int [] arr){
        int arrLength = arr.length;
        int firstSum = 0;              //
        int lastSum = 0;
        for(int i = 0; i < arrLength; i++){
            lastSum = 0;
            firstSum += arr[i];                     //firstSum = 2    arr[0]   arr[1]   firstSum = firstSum + arr[1]
            for(int k = i+1; k  < arrLength; k++){
                lastSum += arr[k];
            }

            System.out.println(firstSum + " " + lastSum);
            if(firstSum == lastSum){
                return i+1;
            }
        }

        return -1;
    }
    
    public static void main(String[] args){
        //int[] arr = {5, 2, 3};
        int[] arr = {2, 3, 2, 1,1,1, 2,1,1};
        //int[] arr = {1, 1, 3};
        System.out.println(splitIndex(arr));
    }
}
