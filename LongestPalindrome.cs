// Time complexity is O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode: Yes (https://leetcode.com/submissions/detail/571387569/)
// Any problem you faced while coding this:

using System;
using System.Collections.Generic;

namespace LongestPalindrome
{
    class Program
    {
        public static int LongestPalindrome(string s) {
            Dictionary<char, int> charCountDict = new Dictionary<char, int>();
            int result = 0;
            for(int i=0; i< s.Length; i++) {
                if(charCountDict.ContainsKey(s[i])) {
                    charCountDict[s[i]] += 1;
                } else {
                    charCountDict.Add(s[i], 1);
                }
            }
            
            foreach(KeyValuePair<char, int> entry in charCountDict) {
                result += entry.Value/2 * 2;
                if(result % 2 == 0 && entry.Value % 2 == 1) {
                    result += 1;
                }
            }
            return result;
        }

        static void Main(string[] args)
        {
            Console.WriteLine(Program.LongestPalindrome("abccccdd"));
        }
    }
}
