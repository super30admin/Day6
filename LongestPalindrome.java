// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        HashSet<Character> sSet = new HashSet<>();
        int counter = 0;
        if(s.length() == 0) return 0;
        for(int i=0; i<s.length(); i++){
            char sChar = s.charAt(i);
            if(sSet.contains(sChar)){ //checking if the character is already present in the hashset, if it increase counter by 2 and remove that character from the hashset, so as to be able to increament counter only when two of these elements appear 
                counter +=2;
                sSet.remove(sChar); 
            }else{ //if not present in the hashset, add it to the hashset
                sSet.add(sChar); 
            }
        }
        if(!sSet.isEmpty()) {counter++; return counter;}
          else return counter;
    }
}
