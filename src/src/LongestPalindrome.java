import java.util.HashMap;
import java.util.HashSet;

public class LongestPalindrome {

    //TC : O(n) where n is the length of the string given
//SC : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


    //For each character, say it occurs k times.
    // We know we have k / 2 * 2 letters that can be paired for sure.
    //At the end, if there was any k % 2 == 1, then that letter could have been a unique center.

    // To perform this check, we will check for k % 2 == 1 and longestLength % 2 == 0,
    // the latter meaning we haven't yet added a unique center to the palindrome
    public int longestPalindrome(String s) {

        int oddMax = 0;
        int longestLength=0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray())
            map.put(c, map.getOrDefault(c,0)+1);

        for(int i : map.values())
        {


            longestLength += i / 2 *2;

            if( longestLength % 2 == 0 && i % 2 !=0)
            {
                longestLength++;

            }

        }

        return longestLength;

    }


    //TC : O(n) where n is the length of the string given
//SC : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

    //this approach uses hashset, as we can find pairs of elements easily using it.
    //If we find that a character of the string was already present in the hashset, then we simply remove the character and increment count
    //At last we check whether the hashSet is empty, if yes then it means that one unique can be used as the center, so add one

    public int longestPalindrome_approachTwo(String s) {
        if(s==null || s.length()==0) return 0;
        HashSet<Character> set = new HashSet<Character>();
        int count = 0;
        for(char c : s.toCharArray()){
            if(set.contains(c)){
                set.remove(c);
                count++;
            }else{
                set.add(c);
            }
        }
        if(!set.isEmpty()) return count*2+1;
        return count*2;

    }
}
