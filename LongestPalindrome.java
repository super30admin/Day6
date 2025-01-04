//Time Complexity : O(n)
//Space Complexity: O(1)
package Interview;

import java.util.HashSet;

public class LongestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getlongestPalindrome("abccccdd"));
	}
	
	public static int getlongestPalindrome(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(int i = 0 ;i <s.length(); i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                count = count + 2;
                set.remove(c);
            }
            else{
                set.add(c);
            }
        }
        if(!set.isEmpty()){
            count++;
        }
        return count;
    }

}
