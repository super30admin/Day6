//Time Complexity: O(n)
//Space Complexity: O(k)
public class Solution {
    public int LongestPalindrome(string s) {
        int n = s.Length;  
        int result = 0;
        HashSet<char> set = new HashSet<char>();

        for (int i = 0; i < n; i++) {
            char ch = s[i];
            if (set.Contains(ch)) {
                result += 2;
                set.Remove(ch);
            } else {
                set.Add(ch);
            }
        }
        
        if (set.Count > 0) {
            result++;
        }

        return result;
    }
}