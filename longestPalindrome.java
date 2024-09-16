//Time Complexity : O(n) where n is the number of char in a string
//Space Complexity : O(1) i.e. we are storing in HashSet and counting frequency of each char and if that is present already in HashSet then we are removing it in constant time from set. 
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

//Your code here along with comments explaining your approach
/*Step 1: create HashSet to contains unique characters. This will help us know which characters are unique, or occurred odd or even number of times in a given string
 * Step 2: We will iterate through string characters and check whether that character is present or not. If not then add it to set. If present then, 
 * just add the count +2 and remove that characters from set
 * Step 3: Check if set is empty or not. If it's empty then count will be even number. No need to add extra 1 for odd occurrence of 1character.
 *  If it's not empty then the remaining character in a set is either unique and appear odd number of times. So, we will add extra 1 after the final count for the character remaining in set.
 */


import java.util.*;
public class longestPalindrome {

	public static int longestPalindromes(String s) {
        if( s == null || s.length() == 0) return 0;
        
        HashSet<Character> set = new HashSet<>();
        int count=0;
        
        for(int i=0; i<s.length(); i++)
        {
            char c= s.charAt(i);
            if(set.contains(c))
            {
                count=count+2;
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
	public static void main(String[] args) {
		//String s = "abccccdd";
		String s = "abccbyccddye";
		int cnt=longestPalindromes(s);
		System.out.println("The count of longest palindrome string from given string is \t"+ cnt);

	}

}
