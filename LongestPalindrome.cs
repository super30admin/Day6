// Time Complexity : O(n)
// Space Complexity : O(1) or O(n) if all characters are unique
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : NO
//Use a HashSet to track characters with odd frequencies.
//For each character in the string, add/remove it from the set to count its frequency.
//The length of the longest palindrome is the sum of all pairs of characters (counted as 2), 
//plus one if there’s any character with an odd frequency.

public class Solution {
    public int LongestPalindrome(string s) {
// can be achieved using hashMaps, arrays as well
        HashSet<char> set = new HashSet<char>();
        int count = 0;
        Boolean flag = false;
        foreach(char c in s.ToCharArray()){ //TocharArray because of case sensitive
            if(set.Contains(c)){
                count +=2;
                set.Remove(c);
            }else{
                set.Add(c);
            }
        }
         if(set.Count>0) return count +1;
         return count;
    }
}

public class Program
{
    public static void Main()
    {
        Solution obj = new Solution();
        string s = "abccccdd";
        int result = obj.LongestPalindrome(s);

        Console.WriteLine(result);
    }
}