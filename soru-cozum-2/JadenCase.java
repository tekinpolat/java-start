public class JadenCase {
    //int float null
    public String toJadenCase(String phrase) {
        if(phrase == null || phrase.equals("")){
            return null;
        }
        //"How can mirrors be"
        String phraseWords [] = phrase.split(" ");    // {"How","can","mirrors"}
        int phraseWordsLength = phraseWords.length;
        String firstLetterUpper;
        for(int i = 0; i < phraseWordsLength; i++){
            firstLetterUpper  = String.valueOf(phraseWords[i].charAt(0)).toUpperCase();
            phraseWords[i]    = firstLetterUpper + phraseWords[i].substring(1);
        }

        //{"How","Can","Mirrors","abc","xyz"}
        String result = "";

        for(String value:phraseWords){ //foreach
            result = result + " " + value ;
        }

        //" How Can Mirrors abc"

        return result.substring(1);
        
	}
}
