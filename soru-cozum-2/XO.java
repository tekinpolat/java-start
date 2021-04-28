public class XO {
    public static boolean getXO (String str) {  
        //zpzpzpp
        //xooxx
        // 'x'  "x"
        str = str.toLowerCase();
        char character ;
        boolean flag = true;
        int str_length = str.length();

        for(int i = 0; i < str_length; i++){
            character = str.charAt(i);
            if(character == 'x' || character == 'o'){
                flag = false;
                break;
            }
        }
        if(flag){
            return true;
        }

        //x ve o sayisina bakacam
        //ooxXm
        int x_count = 0, o_count = 0;
        
        for(int i = 0; i < str_length; i++){
            character = str.charAt(i);
            if(character == 'x'){
                x_count++;
            }else if(character == 'o'){
                o_count++;
            }
        }

        if(x_count == o_count){
            return true;
        }
        return false;
    }

    public static void main(String [] args){
        getXO("zpzpzpp");
    }
}
