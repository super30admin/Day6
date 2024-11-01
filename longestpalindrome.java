// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

// Approach: created an array to store the characters from the string.If the character is present in the array already,
// i.e, for every second occurance of a character,we increase the count by 2 and remove the character from array, if it is
// not there in the array, we add it to the array. At last we check if the count is less than the length of the string, there
// is odd occurance of a character, so we add 1 to count.
// Your code here along with comments explaining your approach




public class longestpalindrome {
    class Solution {
        public int longestPalindrome(String s) {
            char[] set=new char[65];
            int count=0;
            for(char c:s.toCharArray())
            {
                if(set[c-'A']!=0)
                {
                    count=count+2;
                    set[c-'A']=0;
                }
                else
                {
                    set[c-'A']=c;
    
                }
            }
            if(count<s.length()) return count+1;
            return count;
        }
    }
}
