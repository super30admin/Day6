// 409. Longest Palindrome


class Solution {
    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0)
            return 0;
        
        int count =0;
        
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(set.contains(c))
            {
             set.remove(c); count += 2;   
            } else {
                set.add(c);
            }
        }
        
        if(!set.isEmpty()) count++ ;
        return count;
        
    }
}

/**Complexity Analysis**
Time complexity : 
O(n). The entire array is traversed only once.

Space complexity : 
O(n). Maximum size of the HashMap map will be n, if all the elements are either 1 or 0.
*/