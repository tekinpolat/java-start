//https://www.codewars.com/kata/5a092d9e46d843b9db000064/train/java
public class Solution{
    public static int solve(int [] arr){
        int arrLength = arr.length;
        boolean isExist;
        for(int i = 0; i < arrLength; i++){
            isExist = false;
            for(int k = 0; k < arrLength; k++){
                if(-1*arr[i] == arr[k]){
                    isExist = true;
                    break;
                }
            }

            if(!isExist){ 
                return arr[i];
            }
        }
        return 0;
    }

    public static void main(String [] args){
        solve(new int [] {-3,1,2,3,-1,-4,-2});
        solve(new int [] {1,-1,2,-2,3,3});
        solve(new int [] {-110,110,-38,-38,-62,62,-38,-38,-38});
        solve(new int [] {-9,-105,-9,-9,-9,-9,105});
    }
}