package shiyi;

public class Solution {

	public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
		String result = getResult(n);
        System.out.println(result);
	}
    
	public static String getResult(int n) {
		
        if(n < 0){
        	return "Input number is negative, please try again.";
        }
        if(n > 92){
        	return "Input number is too large, please try again.";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= n; i++){
        	sb.append(fibonacci(i));
        	sb.append(" ");
        }
        String result = sb.deleteCharAt(sb.length() - 1).toString(); 
		return result;
	}
	
	
    private static long fibonacci(int n) {
    	
        long result =0;  
        long preOne = 1;  
        long preTwo = 0;  
        if(n == 0){  
            return preTwo;  
        }  
        if(n == 1){  
            return preOne;  
        }  
        for(int i = 2; i <= n; i++){  
            result = preOne + preTwo;  
            preTwo = preOne;  
            preOne = result;  
        }
        return result;  
    }

}