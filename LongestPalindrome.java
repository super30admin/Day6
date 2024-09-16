// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


/*
 * 
 * Count variable is used to keep track of the elements. If the set contains the element that means we have found 2 of those elements
 * we will increase the count by 2 and remove the element from the set. When the element which is not in the set is found , its added to the set
 *  Finally if the set is not empty that means we can use one character so the count is finally increased by one
*/

import java.util.HashSet;

class LongestPalindrome {
    public static int longestPalindrome(String s) {
        if(s == null || s.isEmpty()) return 0;

        HashSet<Character> set = new HashSet<>();
        int count = 0;

        for(char c: s.toCharArray()){
            if(set.contains(c)){
                count += 2;
                set.remove(c);
            }else{
                set.add(c);
            }
        }

        if(!set.isEmpty()) count++;

        return count;
    }
    }