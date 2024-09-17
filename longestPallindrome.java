//time complexity : O(n) we traverse through the whole array
//space complexity : O(n) in worst case we may store all n characters of a string.
//executed on leetcode: yes
//issues faced :none
/**Approach : pallindrome can be formed if we have pairs of characters. if there are charcters which are not paired. any of the character can be added in the middle of arranged pairs of characters to form a pallindrome.
 * we crate a hashset and whenever we find a pair of characters, we empty the hashset and increment the length by 2. if the charcter doesnt exist in hashset, we add that charcter to the set.
 */

import java.util.*;
public class longestPallindrome {
    public static int longest(String s) {
        HashSet<Character> set = new HashSet<Character>();
        int length = 0;
        for(int i=0;i<s.length();++i)
        {
            if(!set.contains(s.charAt(i))) set.add(s.charAt(i));
            else 
            {
                set.remove(s.charAt(i));
                length+=2;
            }
        }
        if(!set.isEmpty()) return length+1;
        return length;  
    }
    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println("length of largest possible pallindrome = "+longest(s));
    } 
    
}