// time complexity - o(n) where n is length of string
// space complexity - o(1) as small letter count is capped at 26
// successfully ran on leet code - Yes
// approach - Iterate and Check if char present in set. If present make a pair and add 2 to result
// remove the char from set. In last if set is not empty add one to result

public class Solution
{
    public int LongestPalindrome(string s)
    {
        HashSet<char> set = new HashSet<char>();
        int result = 0;
        for (int i = 0; i < s.Length; i++)
        {
            if (set.Contains(s[i]))
            {
                result += 2;
                set.Remove(s[i]);
            }
            else
            {
                set.Add(s[i]);
            }
        }
        if (set.Count > 0)
        {
            result++;
        }
        return result;
    }
}