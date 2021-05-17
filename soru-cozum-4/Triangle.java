//https://www.codewars.com/kata/5a25ac6ac5e284cfbe000111/train/java
public class Triangle{
    //RBRGBRB
    public static char triangle(final String row) {

        String tempRow = row;
        int temRowLength;
        String tempStr = "";
        while(true){
            temRowLength = tempRow.length();

            if(temRowLength == 1){
                return tempRow.charAt(0);
            }
            tempStr = "";
            for(int i = 0; i < temRowLength-1; i++){
                if ( tempRow.charAt(i) ==  tempRow.charAt(i+1)){
                    tempStr += tempRow.charAt(i);
                }else if( (tempRow.charAt(i) == 'B' && tempRow.charAt(i+1) == 'G') || (tempRow.charAt(i) == 'G' && tempRow.charAt(i+1) == 'B')){
                    tempStr += "R";
                }else if( (tempRow.charAt(i) == 'R' && tempRow.charAt(i+1) == 'G') || (tempRow.charAt(i) == 'G' && tempRow.charAt(i+1) == 'R') ){
                    tempStr += "B";
                }else{
                    tempStr += "G";
                }
            }
            tempRow = tempStr;
            //System.out.println(tempStr);
        }
        
        //return '?';
    }

    public static void main(String [] args){
        //triangle("RGBG");
        triangle("RBRGBRBGGRRRBGBBBGG");
    }
}