import java.util.HashSet;
import java.util.Set;

// Time Complexity : O(N) where N is the length of the string
// Space Complexity : O(1) //Since at most there will be 26 elements in the set
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Approach
//Using the hashset to implement the problem. Add the character in the set if it is not present,
//if the character is present then we have same character present 2 times in the string.
//we can increment the count by 2 and remove the character from the set.
//Lastly check the size of set, if not empty then there are characters which are odd number of time in the string
//increment count by one and return

public class LongestPalindrome {

    public int longestPalindrome(String s){
        if(s==null || s.length()==0) return -1;

        int count = 0;
        Set<Character> set = new HashSet<Character>();
        for(int i=0; i<s.length(); i++){//traverse the string

            //check if the character is present in the set,
            //if present we remove the character and increment count by 2
            //ie there are even (2) number of characters
            if(set.contains(s.charAt(i))){
                count +=2;
                set.remove(s.charAt(i));
            }
            else {
                //else we will put the character in the set
                set.add(s.charAt(i));
            }
        }
        return set.size()==0 ?  count :  ++count;
    }
}
