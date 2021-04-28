public class Isogram{
    public static boolean isIsogram(String str) {
        str = str.toLowerCase();
        int strLength = str.length();
        for(int i = 0; i <strLength-1; i++){
            for(int j = i+1; j < strLength; j++){
                if ( str.charAt(i) == str.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    } 
}