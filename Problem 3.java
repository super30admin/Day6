//Step 1 add the count of character to an array of fixed length.
//Step 2 add the closest even to the count and check is sum is even and the count is odd, if true increase the count.


//time-O(n) space-O(1)
class Solution {
    public int longestPalindrome(String s) {
        int[] arr= new int[126];
        int ans=0;
    
        for(char c : s.toCharArray())
                arr[c]++;
    
        for(int v:arr)
        {
            ans+=v/2 * 2;
            
            if(ans%2==0 && v%2==1)
                ans++;
        }
        return ans;
    }
}
//Hashset solution- time-O(n), space- O(n)
class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set= new HashSet<>();
        int len=0;
        for(int i=0;i<s.length();i++)
        {
            char ch= s.charAt(i);
            if(set.contains(ch) )
            {
                len+=2;
                set.remove(ch);
            }
            else
                set.add(ch);
        }
        if(!set.isEmpty())
            len++;
        
        return len;
}
}