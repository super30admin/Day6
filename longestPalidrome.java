// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int longestPalindrome(String s) {

        if(s.length() == 1)
        {
            return 1;
        }

        int count[] = new int[128];
        int ans = 0;
        boolean oddIncluded = false;

        for(char ch: s.toCharArray())
        {
            count[ch]++;
        }

        for(int i = 0 ; i<count.length ; i++)
        {
            if(count[i] == 0)
            {
                continue;
            }
            if(count[i]%2 == 0)
            {
                ans+= count[i];
            }
            else
            {
                if(!oddIncluded)
                {
                    ans+=count[i];
                    oddIncluded = true;
                }
                else
                {
                    ans+=count[i]-1;
                }
            }
        }
        return ans;
    }
}
