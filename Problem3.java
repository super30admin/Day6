// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Problem statement: https://leetcode.com/problems/longest-palindrome/

class Problem3 {

    public int longestPalindrome(String s) {

        HashSet<Character> set = new HashSet<>();
        int count=0;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(set.contains(c)){
                set.remove(c);
                count = count + 2;
            }else{
                set.add(c);
            }
        }

        if(!set.isEmpty()){
            count++;
        }
        return count;

    }
}
