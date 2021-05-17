import java.util.ArrayList;
public class Solve{
    public static int [] solve(int [] arr){
        ArrayList<Integer> results = new ArrayList<Integer>();
        int arrLength = arr.length;
        boolean isExits;
        for(int i = 0; i < arrLength; i++){
            isExits = false;
            for(int k = i+1; k < arrLength ; k++){
                if(arr[i] == arr[k]){
                    isExits = true;
                    break;
                }
            }

            if(!isExits){
                results.add(arr[i]);
            }
        }

        int resultsLength = results.size();
        int[] list = new  int [resultsLength];   

        for(int i = 0; i < resultsLength; i++){
            list[i] = results.get(i);
        }

        return list;

    }
}