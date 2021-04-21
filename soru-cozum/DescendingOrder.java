import java.util.Arrays;
public class DescendingOrder {
    public static int sortDesc(final int num) {
      String num_str = num + "";        //"42145"
      int[] num_arr = new int[num_str.length()];
      
      for(int i = 0; i < num_arr.length; i++){
        num_arr[i] = Character.getNumericValue(num_str.charAt(i));      //'4'
	  }
	  
	  // 54635  --> [5,4,6,3,5]
	  Arrays.sort(num_arr);
	  
	  String result = "";

	  for(int i = num_arr.length-1; i >= 0; i-- ){
		result = result + num_arr[i];     //String + int    string > int upcasting
	  }

      return Integer.parseInt(result);
       
	}
	
	//break continue
	
	public static void main(String [] args){

		//descending büyükten küçüğü
		//ascending küçükten büyüğü
		sortDesc(5425);   //"5542"
	}
  }