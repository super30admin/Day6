import java.util.HashSet;

/*  Problem 3
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

 */
public class LongestProblem {
        public int longestPalindrome(String s) {
            HashSet<Character> h = new HashSet<>();
            int counter = 0;
            for(int i=0; i<s.length(); i++)
            {
                if(h.contains(s.charAt(i))){
                    h.remove(s.charAt(i));
                    counter = counter + 2;
                }
                else{
                    h.add(s.charAt(i));
                }
            }
            if(h.size()>0)
            {
                counter++;
            }
            return counter;
        }
}
