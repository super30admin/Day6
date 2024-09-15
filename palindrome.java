// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int count = 0;
        for(int i=0;i<s.length();i++) {
            if(hm.containsKey(s.charAt(i))) {
                int value = hm.get(s.charAt(i));
                value++;
                hm.put(s.charAt(i), value);
            } else {
                hm.put(s.charAt(i), 1);
            } 
        }
        for(int j=0;j<s.length();j++) {
            if(hm.containsKey(s.charAt(j))) {
                if(hm.get(s.charAt(j))%2 == 0) {
                    count+= hm.get(s.charAt(j));
                    hm.remove(s.charAt(j));
                } else {
                    count+= hm.get(s.charAt(j))-1;
                    hm.put(s.charAt(j), 1);
                }
            }
        }

        if(hm.size() != 0) {
            count++;
        }
        return count;
    }
}