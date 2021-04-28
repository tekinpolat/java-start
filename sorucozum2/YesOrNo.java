public class YesOrNo {
    public static String boolToWord(boolean b)    //boolean => true or false
    {
        //true
        //false
        if (b==true) {
            return "Yes";
        }
        else {
            return "No";
        }
    }

    public static String boolToWordV2(boolean b){

        if(b){                      //
            return "Yes";
        }else{
            return "No";
        }
    }

    public static String boolToWordV3(boolean b){
        if(b){
            return "Yes";
        }

        return "No";
    }

    public static String boolToWordV4(boolean b){
        //Ternary Operator
        return b ? "Yes": "No";
    }

    public static void main(String [] args){
        boolToWord(true);
        boolToWord(false);
    }
}
