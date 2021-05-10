import java.util.Arrays;
public class RemoveDuplicateWords{

    public static boolean includes(String [] arr, String val){
        //System.out.println(Arrays.toString(arr));
        //{"alpha", "beta", "beta", "gamma", "gamma", "gamma"} 
        for(String item:arr){
            
            if (item != null && item.equals(val)){
                return true;
            }
            //System.out.println(item + " " + val);
        }   

        return false;
    }

    public static String removeDuplicateWords(String s){
        String [] sWord = s.split(" ");  // {"alpha", "beta", "beta", "gamma", "gamma", "gamma"}
        //System.out.println(Arrays.toString(sWord));
        int sWordLength = sWord.length;
        String [] sWordDifferent = new String[sWordLength];  // {"alpha", "beta", "gamma"}
        //System.out.println(Arrays.toString(sWordDifferent));

        int index = 0;
        for(String word:sWord){
            if(!includes(sWordDifferent, word)){
                sWordDifferent[index] = word;
                index++;
            }
        }

        String result = "";

        for(String word:sWordDifferent){
            if(word != null){
                result += word + " ";
            }
        }

        return result.substring(0, result.length()-1);

    }

    public static void main(String [] args){
        String test = "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta";
        removeDuplicateWords(test);
    }
}