//Time Complexity: O(1) as we have only 26 + 26 (upper and lower) alphabets
//Space Complexity: O(1)
public class Solution {
       public int LongestPalindrome(string s)
        {
            if (s == null || s.Length == 0)
            {
                return 0;
            }
            int cnt = 0;
            HashSet<char> set = new HashSet<char>();
            for (int i = 0; i < s.Length; i++)
            {
                char c = s.ToCharArray()[i];
                if (!set.Contains(c))
                {
                    set.Add(c);
                }
                else
                {
                    cnt += 2;
                    set.Remove(c);
                }
            }
            if (set.Count >0)
            {
                cnt += 1;
            }
            return cnt;
        }
}