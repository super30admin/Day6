// Time Complexity: O(n), where n is the length of the string s
// Space Complexity: O(n)
public class Solution {
    public int LongestPalindrome(string s) {
        HashSet<char> unbalanced = new HashSet<char>();
        int len = 0;
        
        for(int i=0; i<s.Length; i++){
            if(unbalanced.Contains(s[i])){
                unbalanced.Remove(s[i]);
                len+=2;
            } else
                unbalanced.Add(s[i]);
        }
        
        if(unbalanced.Count > 0) len++;
        
        return len;
    }
}