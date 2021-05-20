import java.util.ArrayList;
public class StringCombination{

    public static boolean isExists(ArrayList<String> arr, String str){
        for(String val:arr){
            if(val.equals(str)){
                return true;
            }
        }
        return false;
    }

    public static void combination(String str){
        ArrayList<String> results = new ArrayList<String>();

        int strLength = str.length();
        char firstLetter, secondLetter;
        String temp;
        results.add(str);
        for(int i = 0; i < strLength; i++){
            firstLetter = str.charAt(i);
            for(int k = i+1; k < strLength; k++){
                temp = "";
                secondLetter = str.charAt(k);
                for(int j = 0; j < strLength; j++){
                    if(i == j){
                        temp += str.charAt(k) + "";
                    }else if( k == j){
                        temp += str.charAt(i) + "";
                    }else{
                        temp += str.charAt(j) + "";
                    }
                }
                if(!isExists(results, temp)){
                    results.add(temp);
                }
            }
            
        }

        System.out.println(results);
    }

    public static void main(String[] args){
        combination("abcd");
    }
}