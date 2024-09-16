import java.util.Arrays;
import java.util.HashMap;
public class LongPalindrome {
	    public int longestPalindrome(String s) {
	        int[] charArr = new int[128];
	        Arrays.fill(charArr,0);
	        int count = 0;
	        HashMap<Character,Integer> hm= new HashMap<>();
	        for(char c : s.toCharArray()){
	            if(++charArr[c] == 2){
	                count += 2;
	                charArr[c] = 0;
	            }
	        }
	        return (count == s.length())?count:(count+1);
	        
	    }
}

//Time Complexity = O(n)
//space complexity = O(1)
