class Solution {
    public int longestPalindrome(String s) {
        //Time O(N)
        //Space O(1)
/*
   Intution : If any character repeats two times then we can add that to palindrome , and for the middle element of the palindrome we can add an element which repeats one time
*/
        if(s == null || s.length() == 0)
        {
            return 0;
        }
        HashSet<Character> set = new HashSet<>();
        int ans = 0;
        for(int i=0 ; i<s.length() ; i++)
        {
            if(set.contains(s.charAt(i)))
            {
                ans += 2;
                set.remove(s.charAt(i));
            }
            else
            {
                set.add(s.charAt(i));
            }
        }
        if(set.size() > 0) //Adding element which repeats only one time
        {
            ans++;
        }
        return ans;
    
    }
}