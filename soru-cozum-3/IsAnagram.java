import java.util.Arrays;
public class IsAnagram{

    public static boolean isAnagram(String test, String original) {
        if(test.length() != original.length()){
            return false;
        }

        test = test.toLowerCase();
        original = original.toLowerCase();

        char[] testArray        = test.toCharArray();
        char[] originalArray    = original.toCharArray();

        Arrays.sort(testArray);
        Arrays.sort(originalArray);

        for(int i = 0; i < testArray.length; i++){
            if(testArray[i] != originalArray[i]){
                return false;
            }
        }

        return true;
    }
}