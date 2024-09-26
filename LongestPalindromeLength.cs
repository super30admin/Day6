using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algorithms
{
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No
    public class LongestPalindromeLength
    {
        //Time Complexity - O(n) - Since we are iterating through the entire array
        //Space Complexity - O(n) - Since we are using extra space
        public int LongestPalindrome(string s)
        {
            if (s == null || s.Length == 0) return 0;
            var count = 0;
            var set = new HashSet<char>();
            for (int i = 0; i < s.Length; i++)
            {
                if (set.Contains(s[i]))
                {
                    //Increment the count by 2, since both of the elements can be placed 
                    //on either side to make a palindrome
                    count = count + 2;
                    set.Remove(s[i]);
                }
                else
                {
                    set.Add(s[i]);
                }
            }
            if (set.Count != 0)
            {
                count++;
            }
            return count;
        }
    }
}
