//TC: O(N)
//SC:O(1)
public class Solution {
    public int LongestPalindrome(string s) {
        HashSet<char> set  = new HashSet<char>();
        int length =0;
        for(int i=0;i<s.Length;i++){
            if(set.Contains(s[i])){
                length+=2;
                set.Remove(s[i]);
            }else{
                set.Add(s[i]);
            }
        }
        
        if(set.Count > 0){
            return length+1;
        }
        return length;
    }
}