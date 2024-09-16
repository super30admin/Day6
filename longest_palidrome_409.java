    /*  Explanation
    # Leetcode problem link : https://leetcode.com/problems/longest-palindrome/
    Time Complexity for operators : o(n)
    Extra Space Complexity for operators : o(n) 
    Did this code successfully run on Leetcode : Yes
    Any problem you faced while coding this : No
# Your code here along with comments explaining your approach

        # Optimized approach: The main idea behind this is to check the max length of palindorme can be formed thru the given string. 
                              
            # 1. Declare hashset and add iterate over the string.
            # 2. if hashset already contains the charater then increse the counter by 2 and remove it from hashset. 
                 (it is becase, we can use these two characters for the formation of plindrome string)
            # 3. If it is not found then add it into the hashset.
            # 4. at the end check the hashset if it is empty then return count as it is else return count +1;
                 (it is because, the middle string can be utilized if hashset has any character)
    */
    
import java.util.*;
public class longest_palidrome_409 {
    public static void main(String args[]) {
        String s = "abccccdd";
        int val = longest_palidrome(s);
        System.out.println(val);
    }

    public static int longest_palidrome(String s) {
        int count = 0;
        
        HashSet<Character> hashset = new HashSet<>();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if(hashset.contains(ch)){
                count += 2;
                hashset.remove(ch);
            }else{
                hashset.add(ch);
            }
        }
        
        return hashset.isEmpty() ? count:count+1;
    }
}