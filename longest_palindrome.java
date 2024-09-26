//Time Complexity is O(n) ;
//Space complexity is constant which is O(52)

/**
 * 
 */

/**
 * @author aupadhye
 *
 */

public class longest_palindrome {

	/**
	 * @param args
	 */
	   public static int longestPalindrome(String s) {
	        int count =0;
	        int[] f = new int[52];
	        char[] st = s.toCharArray();
	        
	        for(int i=0;i<st.length;i++){
	            char c= st[i];
	            if(Character.isUpperCase(c))
	            {
	                f[(c-'A')+26]++;
	            }
	            else{
	                
	                f[c-'a']++;
	            }
	        }
	        
	        for(int i=0;i<f.length;i++){
	            
	            int num = f[i];
	            if(num%2==0){count+=num;}
	            else{count += num-1;}
	        }
	        
	        if(st.length > count){count+=1;}
	        
	        return count;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abccccdd";
		int length = longestPalindrome(s);
		System.out.println(length);
	}

}

