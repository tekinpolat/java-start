public class FindUniq {
    public static double findUniq(double arr[]) {
        boolean flag = true;
        for(int i = 0; i < arr.length; i++){
          flag = true;
          for(int j = i+1; j < arr.length;j++){
            if(arr[i] == arr[j]){
               flag = false;
               break;
            }
          }
          if(flag){
            return arr[i];
          }
          
        }
        return 0;
    }
}
