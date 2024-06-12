/*Time Complexity O(n)
Space Complexity O(1) as the maximum number of asci values is 256*/
import java.util.HashSet;
class Solution {
    public int longestPalindrome(String s) {
        char[] c=s.toCharArray();
        HashSet<Character> a=new HashSet<Character>();
        int count=0;
        char temp;
        for(int i=0;i<c.length;i++){
            temp=s.charAt(i);
        	if(a.isEmpty()){
                a.add(temp);
            }
        	else if(a.contains(temp)){
        	a.remove(temp);	
        	count=count+2;
        	}
        	else {
        	a.add(temp);	
        	}
        }
        if(a.isEmpty()) {
        	return count;
        }
        else {
        	return count+1;
        }
    }
}