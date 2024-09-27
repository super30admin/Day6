// Time Complexity : O(n)
//Space Complexity: O(1).
//Any issues faced while coding: No

public class LongestPalindrome {

    public int longestPalindrome(String s) {
        
        if(s==null || s.length()==0) return 0;
        
        HashSet<Character> set= new HashSet();
        int count=0;
        for(int i=0;i<s.length();i++){
            
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }else{
                count+=2;
                set.remove(s.charAt(i));
            }
        }
        if(!set.isEmpty()){
            count++;
        }
        return count;
        
    }
}
