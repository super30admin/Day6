// Time Complexity : O(n)
// Space Complexity : O(1) //limited to alphabets
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Storing the character when apperared first time in the hashset
// Removing from the hashset when appeared second time to increase the result counetr by 2.
//if hashset is not empty at the end add one to the counter or else jus return the counter
import java.util.HashSet;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        int counter = 0;
        HashSet<Character> mySet = new HashSet<>();

        for (int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(mySet.contains(ch)){
                counter += 2;
                mySet.remove(ch);
            }else if(!mySet.contains(ch)){
                mySet.add(ch);
            }
        }
        if(!mySet.isEmpty()){
            counter++;
        }
        return counter;

    }
}
