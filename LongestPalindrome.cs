public class Solution
{
    public int LongestPalindrome(string s)
    {
        if (s == null || string.IsNullOrEmpty(s))
        {
            return 0;
        }

        HashSet<Char> hashset = new();
        int length = 0;
        foreach (var c in s)
        {
            if (hashset.Contains(c))
            {
                length += 2;
                hashset.Remove(c);
            }
            else
            {
                hashset.Add(c);
            }
        }
        if (hashset.Count() > 0)
        {
            length++;
        }
        return length;
    }
}