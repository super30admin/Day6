// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
import java.util.*;
class Problem3 {
    public static void main(String args[]) {
        String str = "abccccdcddb";
        // create a set to store the characters to be added to palindrome
        HashSet<Character> set = new HashSet<Character>();
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // Whenever the duplicate character is encountered, remove it from set and increase the palindrome length by 2
            if(set.contains(c)){
                count +=2;
                set.remove(c);
            }
            else {
                // Add the element which is not present in set
                set.add(c);
            }
        }
        // After traversing string if set is empty write a character to array
        if (set.isEmpty())
            System.out.println(count);
        
        else {
            System.out.println(count + 1);    
        }
        
    }
}