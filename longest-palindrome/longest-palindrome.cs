public class Solution {
    public int LongestPalindrome(string s) {
        int[] count = new int[128];
        
        foreach(char c in s)
        {
            count[c]++;
           
        }
        int ans =0;
        
        foreach(int v in count)
        {
             //Console.WriteLine(v/2*2);
            ans+= v/2*2;
            if(ans %2==0 && v%2==1)
            {
                ans++;
            }
        }
        return ans;
        
    }
}
