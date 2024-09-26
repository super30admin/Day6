using System;
using System.Collections.Generic;

namespace Algorithms
{
    public class LongestPalindrome
    {

        /// Time Complexity : O(n) 
        // Space Complexity :O(1)
        // Did this code successfully run on Leetcode :Yes
        // Any problem you faced while coding this :  Referred Online
        public int longestPalindrome(String s)
        {
            HashSet<char> set = new HashSet<char>();
            int result = 0;
            char[] charArray = s.ToCharArray();
            for(int i =0; i<charArray.Length; i++)
            {
                char c = charArray[i];
                if (set.Contains(c))
                {
                    result += 2;
                    set.Remove(c);
                }
                else
                {
                    set.Add(c);
                }
                
            }
            if (set != null) result++;
            return result;
        }
    }
}
